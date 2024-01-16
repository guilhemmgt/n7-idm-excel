from Coeff import Coeff
from Resultats import Resultats
from Config import Config 

#test
instanceCoeff = Coeff()
instanceCoeff.load(Config.PATH + "eclipse-workspace-idm/CSV_exemples/Coeff.csv")
print(instanceCoeff.table)
print(instanceCoeff.checkAll())
instanceRes = Resultats()
instanceRes.load(Config.PATH + "eclipse-workspace-idm/CSV_exemples/Res.csv")
print(instanceRes.table)
instanceRes.calcAll()
print(instanceRes.table)
instanceRes.export(Config.PATH + "eclipse-workspace-idm/CSV_exemples/Resultat.csv")