"""
L'interface utilisateur
"""

#Import des bibliothèques requises
from tkinter import *
import tkinter.filedialog 

# =============================================================================
# Variables globales
# =============================================================================

chargement_effectue = False

verif_effectue = False

# =============================================================================
# Fonctions
# =============================================================================

def Charger_csv():
    #ne prend rien en argument (type none), récupère le texte (type string) 
    #dans un document .txt choisis au préalable par l'utilisateur sur son 
    #disque dur et renvoie en sortie un enchainement de mot avec des passages  
    #à la ligne (type str) contenant tout les mots du fichier .txt
    f=(tkinter.filedialog).askopenfilename(title='Séléctionner le fichier .csv')
    fichier=open(f,'r')
    Flux=fichier.readlines()
    fichier.close()
    Button_Selectionner.config(text="Fichier Chargé ✔", fg="chartreuse4")
    global chargement_effectue
    chargement_effectue = True
    global verif_effectue
    verif_effectue = False
    Button_Verifier.config(text="Vérifier", fg="black")
    Button_Calculer.config(text="Calculer", fg="black")
    
def Afficher_csv():
    
    #récupérer le contenu du csv...
    
    fenetre_affichage=Tk()
    fenetre_affichage.title("Affichage du csv")
    fenetre_affichage.geometry("500x500")
    Frame_Contenu_affichage=Frame(fenetre_affichage, bg='grey')
    Frame_Contenu_affichage.pack(fill=BOTH)
    Fermer_fenetre=Button(Frame_Contenu_affichage, text='Fermer', font='Arial 10', command=fenetre_affichage.destroy)
    Fermer_fenetre.pack(pady=30)

def Verifier_csv():
    if chargement_effectue:
    
        # effectuer la vérification ...
        raison_probleme = "Le test à échoué car blabla..."
        verif_ok = True
        
        if verif_ok:
            Button_Verifier.config(text="Vérification réussi", fg="chartreuse4")
            Button_Calculer.config(text="Calculer", fg="black")
            global verif_effectue
            verif_effectue = True
        else:
            Button_Verifier.config(text="Vérification échoué", fg="crimson")
            fenetre_echer_verif=Tk()
            fenetre_echer_verif.title("Echec de la vérification")
            Frame_Contenu=Frame(fenetre_echer_verif, bg='grey')
            Frame_Contenu.pack()
            Label_Probleme=Label(Frame_Contenu, text="Problème lié à la vérification",font='Arial 15 bold', fg='black',bg='grey')
            Label_Probleme.pack(pady=30)
            Label_Raison=Label(Frame_Contenu, text=raison_probleme,font='Arial 12', fg='black',bg='grey')
            Label_Raison.pack(pady=10)
            Fermer=Button(Frame_Contenu, text='Fermer', font='Arial 10', command=fenetre_echer_verif.destroy)
            Fermer.pack(pady=30)
    
    else:
        Button_Verifier.config(text="Veuillez charger le fichier", fg="crimson")
        

def Calculer_csv():
    
    if verif_effectue:
        
       #effectuer les calculs
        contenu = "le résultat du calcul ie le csv calculé"
        nom_fichier = "test.txt"
        fichier=open(nom_fichier,'w')
        fichier.write(contenu)
        fichier.close()
        Button_Calculer.config(text="Calcul efféctué", fg="chartreuse4")
        
    else:

        Button_Calculer.config(text="Veuillez vérifier le fichier", fg="crimson")

# =============================================================================
# Interface Graphiques
# =============================================================================

#Création de la fenetre
fenetre=Tk()

fenetre.title("Calculateur sur csv")

fenetre.geometry("550x600")

#Création de la barre de menu
menubar=Menu(fenetre)

#Frame Frame_Main
Frame_Main=Frame(fenetre, bg='grey')
Frame_Main.pack(fill=BOTH, expand=True)

#Label Label_Titre : Nom du logiciel
Label_Titre=Label(Frame_Main,text='Calculateur de csv',font='Arial 20 bold', fg='black',bg='grey') 
Label_Titre.pack(padx=30, pady=40)

#Bouton Button_Selectionner : Séléction du dictionnaire
Button_Selectionner=Button(Frame_Main,text='Séléctionner Fichier...',font='Arial 12',command=Charger_csv, fg='black',bg='white', relief='raised')
Button_Selectionner.pack(pady=60)

#Label Label_Titre : Nom du logiciel
Label_Operation=Label(Frame_Main,text='Opérations', font='Arial 12 bold', fg='black',bg='grey')
Label_Operation.pack(padx=30)

#Frame Frame_Operation
Frame_Operation=Frame(Frame_Main, width=400, bg='grey')
Frame_Operation.pack(pady=10)

#Bouton Button_Afficher : Button_Afficher le contenu du csv
Button_Afficher=Button(Frame_Operation,text='Afficher csv',font='Arial 12',command=Afficher_csv, fg='black',bg='white', relief='raised')
Button_Afficher.pack(side=LEFT, padx=10)

#Bouton Calculer : Effectuer les calculs sur le contenu du csv
Button_Calculer=Button(Frame_Operation,text='Calculer',font='Arial 12',command=Calculer_csv, fg='black',bg='white', relief='raised')
Button_Calculer.pack(side=RIGHT, padx=10)

#Bouton Button_Verifier : Vérifier le contenu du csv
Button_Verifier=Button(Frame_Operation,text='Vérifier',font='Arial 12',command=Verifier_csv, fg='black',bg='white', relief='raised')
Button_Verifier.pack(padx=10)

##########################################################
#Bouton de sortie
Quitter=Button(Frame_Main, text='Quitter', font='Arial 10', command=fenetre.destroy)
Quitter.pack(pady=75)
##########################################################

##########################################################
#Affichage de la fenetre
fenetre.mainloop()
##########################################################