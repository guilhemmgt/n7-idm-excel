
import pandas as pd
import importlib

class Coeff:


	#Initialisation avec panda
	def __init__(self):
        # Simuler une liste de noms de colonnes
		noms_colonnes = ["Examen", "Matiere", "CoeffDansMat"]

        # Initialisation du DataFrame avec les noms de colonnes
		self.table = pd.DataFrame(columns=noms_colonnes)

	def load(self, csv_file):
		# Charger le CSV en utilisant pandas
		df = pd.read_csv(csv_file)

		# Copier les colonnes du csv dans la table
		for colonne in df.columns:
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

        # Charger dynamiquement les fonctions à partir des chemins
		conditions = self.load_functions_from_paths(chemins_conditions)
		print(conditions)

        # Utiliser Pandas pour appliquer les conditions aux colonnes
		condition_satisfied = self.table.apply(lambda colonne: all(condition(element) for condition, element in zip(conditions[0], colonne)), axis=0)
        
        # Trouver la première colonne qui ne satisfait pas la condition
		colonne_non_satisfaite = condition_satisfied[condition_satisfied == False].index[0] if not condition_satisfied.all() else None

		return colonne_non_satisfaite if colonne_non_satisfaite is not None else True


#test
instance = Coeff()
df = instance.load("/home/claire/Documents/Cours/IDM_propre/IDM/eclipse-workspace-idm/CSV_exemples/Coeff.csv")
print(instance.table)
print(df)
print(instance.checkAll())
		

