
import pandas as pd
import importlib
from Config import Config
import matlab.engine

from detail import detail


class resume:

	_instance = None

	# Assure qu'il y a une seule instance par classe
	def __new__(cls):
		if not cls._instance:
			cls._instance = super(resume, cls).__new__(cls)
			cls._instance.eng = matlab.engine.start_matlab()
			# Récupére la liste de noms des colonnes
			noms_colonnes = ["Annee", "Bilan de l'anne", "Meilleur trimestre", "Rentrees/sorties en %"]

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
		chemins_conditions = [[], [], [], ["Algo/positif.py"]]

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
			self.fusionner_colonnes(detail.get_instance().table, "Annee", "Annee", "Bilan", "Bilan de l'anne")
			self.fusionner_colonnes(detail.get_instance().table, "Annee", "Annee", "Meilleur trimestre", "Meilleur trimestre")
			self.fusionner_colonnes(detail.get_instance().table, "Annee", "Annee", "Rapport recettes/depenses", "Rentrees/sorties en %")


	def calcAll(self):
		self.insertFromTable()
		# Recuperer la matrice des paths
		pass


	def export(self, csv_file):
        # Exporter le DataFrame en tant que fichier CSV
		self.table.to_csv(csv_file, index=False)
		

