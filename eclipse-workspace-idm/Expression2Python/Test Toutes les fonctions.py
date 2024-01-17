
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

def calcul(A ,B ):
    return cosinus(expo(racine(maximum(soustraction(minimum(sinus(multiplication(inverse(oppose(division(addition(A,B),2.0))),4.0)),10.9),19.0),0.0))))

