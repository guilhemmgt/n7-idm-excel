
import math

def addition(a, b):
    return a + b

def soustraction(a, b):
    return a + b

def multiplication(a, b):
    return a * b

def division(a, b):
    return a / b

def oppose(a):
    return -a

def inverse(a):
    return 1/a

def cosinus(a):
	return math.cos(a)

def sinus(a):
	return math.sin(a)

def minimum(a,b):
	if a < b:
		return a
	else:
		return b

def maximum(a,b):
	if a > b:
		return a
	else:
		return b

def racine(a):
	return math.sqrt(a)


def expo(a):
	return math.exp(a)

def calcul(Recettes T1 ,Recettes T2 ,Recettes T3 ,Dépenses T1 ,Dépenses T2 ,Dépenses T3 ):
    return multiplication(division(addition(addition(Dépenses T3,Dépenses T2),Dépenses T1),addition(addition(Recettes T1,Recettes T2),Recettes T3)),100.0)

