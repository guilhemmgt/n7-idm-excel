
import pandas as pd
import importlib

class Coeff:


	_instance = None

	# Assure qu'il y a une seule instance par classe
	def __new__(cls):
		if not cls._instance:
			cls._instance = super(Coeff, cls).__new__(cls)

			# Récupére la liste de noms des colonnes
			noms_colonnes = ["Examen", "Matiere", "CoeffDansMat"]

	        # Initialisation du DataFrame avec les noms de colonnes
			cls._instance.table = pd.DataFrame(columns=noms_colonnes)
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
		return df #A enlever plus tard, c'est juste pour visualiser

	def afficher_html(self):
        # Convertir le DataFrame en une chaîne HTML représentant un tableau
		return self.table.to_html()

	def load_functions_from_paths(self, matrix_of_paths):
		functions_matrix = []
		for paths in matrix_of_paths:
			functions = []
			for path in paths:
                # Charger dynamiquement la fonction à partir du fichier spécifié par le chemin
				function_name = path.split('/')[-1].split('.')[0]  # Nom de la fonction à partir du nom du fichier
				spec = importlib.util.spec_from_file_location(function_name, path)
				module = importlib.util.module_from_spec(spec)
				spec.loader.exec_module(module)
				functions.append(getattr(module, function_name))
			functions_matrix.append(functions)
		return functions_matrix

	def checkAll(self):
        # Matrice des chemins vers les fichiers contenant les fonctions
		chemins_conditions = [[], [], ["/home/claire/Documents/Cours/IDM_propre/IDM/eclipse-workspace-idm/Algo/positif.py"]]

        # Initialiser la liste des colonnes non satisfaites
		erreurs = []
		
		# Charger dynamiquement les fonctions à partir des chemins
		conditions = self.load_functions_from_paths(chemins_conditions)

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
		t2
		

	def calcAll(self):
		pass

	def export(self, csv_file):
        # Exporter le DataFrame en tant que fichier CSV
		self.table.to_csv(csv_file, index=False)
		

