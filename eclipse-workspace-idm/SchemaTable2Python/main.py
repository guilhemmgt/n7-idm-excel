from Coeff import Coeff
from Resultats import Resultats

#test
instanceCoeff = Coeff()
instanceCoeff.load("/home/claire/Documents/Cours/IDM_propre/IDM/eclipse-workspace-idm/CSV_exemples/Coeff.csv")
print(instanceCoeff.table)
print(instanceCoeff.checkAll())
instanceRes = Resultats()
instanceRes.load("/home/claire/Documents/Cours/IDM_propre/IDM/eclipse-workspace-idm/CSV_exemples/Res.csv")
print(instanceRes)
instanceRes.fusionner_colonnes(Coeff.get_instance().table, "Examen", "Examen", "Matiere", "Matiere")
print(instanceRes.table)
instanceRes.export("/home/claire/Documents/Cours/IDM_propre/IDM/eclipse-workspace-idm/CSV_exemples/Resultat.csv")