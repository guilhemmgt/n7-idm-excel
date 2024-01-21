
import pandas as pd
import importlib
from Config import Config
import matlab.engine

from recettes import recettes
from depenses import depenses


class detail:

	_instance = None

	# Assure qu'il y a une seule instance par classe
	def __new__(cls):
		if not cls._instance:
			cls._instance = super(detail, cls).__new__(cls)
			cls._instance.eng = matlab.engine.start_matlab()
			# Récupére la liste de noms des colonnes
			noms_colonnes = ["Annee", "Recettes T1", "Recettes T2", "Recettes T3", "Depenses T1", "Depenses T2", "Depenses T3", "Bilan T1", "Bilan T2", "Bilan T3", "Bilan", "Meilleur trimestre", "Rapport recettes/depenses", "Moy"]

	        # Initialisation du DataFrame avec les noms de colonnes
			cls._instance.table = pd.DataFrame(columns=noms_colonnes)
			cls._instance.eng = matlab.engine.start_matlab()
		return cls._instance

	@classmethod
	def get_instance(cls):
		if not cls._instance:
			cls._instance = cls()
		return cls._instance

	def load(self, csv_file):
		# Charger le CSV en utilisant pandas
		df = pd.read_csv(csv_file)

		# Copier les colonnes du csv dans la table
		for colonne in df.columns:
			if colonne in self.table.columns:
				self.table[colonne] = df[colonne]

	def load_fct(self, function_name, path):
		spec = importlib.util.spec_from_file_location(function_name, Config.PATH + path)
		module = importlib.util.module_from_spec(spec)
		spec.loader.exec_module(module)
		return getattr(module, function_name)

	def load_matlab_fct(self, path):
		split = (Config.PATH + path).rsplit('/', 1)
		repoName = split[0]
		fileName = split[1].rsplit('.',1)[0]
        # Ajouter le chemin vers le dossier contenant la fonction MATLAB
		self.eng.addpath(repoName, nargout=0)
        # Appeler la fonction MATLAB
		matlab_function = getattr(self.eng, fileName)
		return matlab_function


	def load_functions_from_paths(self, matrix_of_paths, function_name):
		functions_matrix = []
		for paths in matrix_of_paths:
			functions = []
			for path in paths:
                # Charger dynamiquement la fonction à partir du fichier spécifié par le chemin
				if path[-3:] == ".py":
					functions.append(self.load_fct(function_name, path))
				elif path[-2:] == ".m":
					functions.append(self.load_matlab_fct(path))
			functions_matrix.append(functions)
		return functions_matrix

	def checkAll(self):
		erreurs = []
		colonneLigne = "Annee"
		if self.table[colonneLigne].nunique() != len(self.table[colonneLigne]) :
			erreurs.append(["il faut des données unique dans "+colonneLigne])
        # Matrice des chemins vers les fichiers contenant les fonctions
		chemins_conditions = [[], ["Algo/positif.py"], ["Algo/positif.py"], ["Algo/positif.py"], ["Algo/positif.py"], ["Algo/positif.py"], ["Algo/positif.py"], [], [], [], [], [], ["Algo/positif.py"], ["Algo/positif.py"]]

        # Initialiser la liste des colonnes non satisfaites
		
		# Charger dynamiquement les fonctions à partir des chemins
		conditions = self.load_functions_from_paths(chemins_conditions, "check")

     	# Itérer sur les colonnes et vérifier les conditions
		for i,colonne in enumerate(self.table.columns):
        # Vérifier les conditions pour chaque élément de la colonne
			for element in self.table[colonne]:
				for condition in conditions[i]:
					if not condition(element):
						erreurs.append([colonne, element])
		return erreurs if erreurs else True

	def fusionner_colonnes(self, DfSource, colonneLigne1, colonneLigne2, ColSource, ColDestination):
		# Fusionner les deux DataFrames sur les colonnesLigne
		result = pd.merge(self.table, DfSource[[colonneLigne1, ColSource]], on=colonneLigne1, how='left', suffixes = ('_x', None))

		self.table[ColDestination] = result[ColSource]


	def insertFromTable(self):
		# Pour toutes les colonnes de self.table qui ont un attribut contenu de type "ImportTable"
			self.fusionner_colonnes(recettes.get_instance().table, "Annee", "Annee", "T1", "Recettes T1")
			self.fusionner_colonnes(recettes.get_instance().table, "Annee", "Annee", "T2", "Recettes T2")
			self.fusionner_colonnes(recettes.get_instance().table, "Annee", "Annee", "T3", "Recettes T3")
			self.fusionner_colonnes(depenses.get_instance().table, "Annee", "Annee", "T1", "Depenses T1")
			self.fusionner_colonnes(depenses.get_instance().table, "Annee", "Annee", "T2", "Depenses T2")
			self.fusionner_colonnes(depenses.get_instance().table, "Annee", "Annee", "T3", "Depenses T3")


	def calcAll(self):
		self.insertFromTable()
		# Recuperer la matrice des paths
		colonne_provisoire = []
		path = "Expression2Python/SoustractionBinaire.py"
		# Charger dynamiquement la fonction à partir du fichier spécifié par le chemin
		if path[-3:] == ".py":
			for j,element in enumerate(self.table["Bilan T1"]):
				colonne_provisoire.append(self.load_fct("calcul", "Expression2Python/SoustractionBinaire.py")(self.table.at[j,'Recettes T1'], self.table.at[j,'Depenses T1']))
		elif path[-2:] == ".m":
			for j,element in enumerate(self.table["Bilan T1"]):
				colonne_provisoire.append(self.load_matlab_fct(path)(self.table.at[j,'Recettes T1'], self.table.at[j,'Depenses T1']))
		self.table["Bilan T1"] = colonne_provisoire
		colonne_provisoire = []
		path = "Expression2Python/SoustractionBinaire.py"
		# Charger dynamiquement la fonction à partir du fichier spécifié par le chemin
		if path[-3:] == ".py":
			for j,element in enumerate(self.table["Bilan T2"]):
				colonne_provisoire.append(self.load_fct("calcul", "Expression2Python/SoustractionBinaire.py")(self.table.at[j,'Recettes T2'], self.table.at[j,'Depenses T2']))
		elif path[-2:] == ".m":
			for j,element in enumerate(self.table["Bilan T2"]):
				colonne_provisoire.append(self.load_matlab_fct(path)(self.table.at[j,'Recettes T2'], self.table.at[j,'Depenses T2']))
		self.table["Bilan T2"] = colonne_provisoire
		colonne_provisoire = []
		path = "Expression2Python/SoustractionBinaire.py"
		# Charger dynamiquement la fonction à partir du fichier spécifié par le chemin
		if path[-3:] == ".py":
			for j,element in enumerate(self.table["Bilan T3"]):
				colonne_provisoire.append(self.load_fct("calcul", "Expression2Python/SoustractionBinaire.py")(self.table.at[j,'Recettes T3'], self.table.at[j,'Depenses T3']))
		elif path[-2:] == ".m":
			for j,element in enumerate(self.table["Bilan T3"]):
				colonne_provisoire.append(self.load_matlab_fct(path)(self.table.at[j,'Recettes T3'], self.table.at[j,'Depenses T3']))
		self.table["Bilan T3"] = colonne_provisoire
		colonne_provisoire = []
		path = "Expression/SommeTernaire.m"
		# Charger dynamiquement la fonction à partir du fichier spécifié par le chemin
		if path[-3:] == ".py":
			for j,element in enumerate(self.table["Bilan"]):
				colonne_provisoire.append(self.load_fct("calcul", "Expression/SommeTernaire.m")(self.table.at[j,'Bilan T1'], self.table.at[j,'Bilan T2'], self.table.at[j,'Bilan T3']))
		elif path[-2:] == ".m":
			for j,element in enumerate(self.table["Bilan"]):
				colonne_provisoire.append(self.load_matlab_fct(path)(self.table.at[j,'Bilan T1'], self.table.at[j,'Bilan T2'], self.table.at[j,'Bilan T3']))
		self.table["Bilan"] = colonne_provisoire
		colonne_provisoire = []
		path = "Algo/meilleurTrimestre.py"
		# Charger dynamiquement la fonction à partir du fichier spécifié par le chemin
		if path[-3:] == ".py":
			for j,element in enumerate(self.table["Meilleur trimestre"]):
				colonne_provisoire.append(self.load_fct("calcul", "Algo/meilleurTrimestre.py")(self.table.at[j,'Bilan T1'], self.table.at[j,'Bilan T2'], self.table.at[j,'Bilan T3']))
		elif path[-2:] == ".m":
			for j,element in enumerate(self.table["Meilleur trimestre"]):
				colonne_provisoire.append(self.load_matlab_fct(path)(self.table.at[j,'Bilan T1'], self.table.at[j,'Bilan T2'], self.table.at[j,'Bilan T3']))
		self.table["Meilleur trimestre"] = colonne_provisoire
		colonne_provisoire = []
		path = "Expression2Python/RapportRecettesSurDepenses.py"
		# Charger dynamiquement la fonction à partir du fichier spécifié par le chemin
		if path[-3:] == ".py":
			for j,element in enumerate(self.table["Rapport recettes/depenses"]):
				colonne_provisoire.append(self.load_fct("calcul", "Expression2Python/RapportRecettesSurDepenses.py")(self.table.at[j,'Recettes T1'], self.table.at[j,'Recettes T2'], self.table.at[j,'Recettes T3'], self.table.at[j,'Depenses T1'], self.table.at[j,'Depenses T2'], self.table.at[j,'Depenses T3']))
		elif path[-2:] == ".m":
			for j,element in enumerate(self.table["Rapport recettes/depenses"]):
				colonne_provisoire.append(self.load_matlab_fct(path)(self.table.at[j,'Recettes T1'], self.table.at[j,'Recettes T2'], self.table.at[j,'Recettes T3'], self.table.at[j,'Depenses T1'], self.table.at[j,'Depenses T2'], self.table.at[j,'Depenses T3']))
		self.table["Rapport recettes/depenses"] = colonne_provisoire
		colonne_provisoire = []
		path = "Expression2Python/MoyenneTernaire.py"
		# Charger dynamiquement la fonction à partir du fichier spécifié par le chemin
		if path[-3:] == ".py":
			for j,element in enumerate(self.table["Moy"]):
				colonne_provisoire.append(self.load_fct("calcul", "Expression2Python/MoyenneTernaire.py")(self.table.at[j,'Recettes T1'], self.table.at[j,'Recettes T2'], self.table.at[j,'Recettes T3']))
		elif path[-2:] == ".m":
			for j,element in enumerate(self.table["Moy"]):
				colonne_provisoire.append(self.load_matlab_fct(path)(self.table.at[j,'Recettes T1'], self.table.at[j,'Recettes T2'], self.table.at[j,'Recettes T3']))
		self.table["Moy"] = colonne_provisoire


	def export(self, csv_file):
        # Exporter le DataFrame en tant que fichier CSV
		self.table.to_csv(csv_file, index=False)
		

