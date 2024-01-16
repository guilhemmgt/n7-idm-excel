from Coeff import Coeff
from Resultats import Resultats

#test
instanceCoeff = Coeff()
instanceCoeff.load("D:/Mon_Dossier/Cours/2A/S7_IDM/IDM/eclipse-workspace-idm/CSV_exemples/Coeff.csv")
print(instanceCoeff.table)
print(instanceCoeff.checkAll())
instanceRes = Resultats()
instanceRes.load("D:/Mon_Dossier/Cours/2A/S7_IDM/IDM/eclipse-workspace-idm/CSV_exemples/Res.csv")
print(instanceRes.table)
instanceRes.calcAll()
print(instanceRes.table)
instanceRes.export("D:/Mon_Dossier/Cours/2A/S7_IDM/IDM/eclipse-workspace-idm/CSV_exemples/Resultat.csv")