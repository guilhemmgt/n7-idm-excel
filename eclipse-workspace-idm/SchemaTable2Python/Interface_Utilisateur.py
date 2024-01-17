# =============================================================================
# Ensemble des imports et variables globales
# =============================================================================

from tkinter import *
import tkinter.filedialog 
from Config import Config 

################################## Modifications End-user ##################################

from Coeff import Coeff
from Resultats import Resultats

liste_instances = [Coeff(), Resultats()] #liste des instances à créer

############################################################################################

chargement_effectue = False

verif_effectue = False

liste_dialog = [] #liste des documents chargés dans l'interface

nombre_instances = len(liste_instances)

numero_instances = 0

# =============================================================================
# Fonctions de l'interface graphique
# =============================================================================

def Charger_csv():
    #ne prend rien en argument (type none), récupère le texte (type string) 
    #dans un document .txt choisis au préalable par l'utilisateur sur son 
    #disque dur et renvoie en sortie un enchainement de mot avec des passages  
    #à la ligne (type str) contenant tout les mots du fichier .txt
    path=tkinter.filedialog.askopenfilename(title='Séléctionner le fichier .csv', filetypes=[('CSV', '*.csv',)])
    global numero_instances
    numero_instances += 1
    global liste_instances
    liste_instances[numero_instances-1].load(path)
    Button_Selectionner.config(text="Fichier Chargé ✔", fg="chartreuse4", state=tkinter.DISABLED)
    global liste_dialog
    liste_dialog.append("Nouveau fichier chargé : " + path)
    global chargement_effectue
    chargement_effectue = True
    global verif_effectue
    verif_effectue = False
    Button_Verifier.config(text="Vérifier", fg="black")
    Button_Calculer.config(text="Calculer", fg="black")
    Label_Dialog.config(text=ListeDocs2String())
    UpdateScroll()


def Afficher_csv():
    
    fenetre_affichage=Tk()
    fenetre_affichage.title("Affichage du csv")
    Frame_Contenu_affichage=Frame(fenetre_affichage, bg='grey')
    Frame_Contenu_affichage.pack(fill=BOTH)
    Label_Contenu=Label(Frame_Contenu_affichage, text=liste_instances[numero_instances-1].table, font='Arial 10 bold', fg='black',bg='grey')
    Label_Contenu.pack()
    Fermer_fenetre=Button(Frame_Contenu_affichage, text='Fermer', font='Arial 10', command=fenetre_affichage.destroy)
    Fermer_fenetre.pack(pady=30)


def Verifier_csv():

    if chargement_effectue:
        global liste_dialog
        res = liste_instances[numero_instances-1].checkAll()
        verif_ok = (res == True)
        global verif_effectue
        verif_effectue = True
        
        if verif_ok:
            Button_Verifier.config(text="Vérification réussi", fg="chartreuse4")
            Button_Calculer.config(text="Calculer", fg="black")
        else:
            Button_Verifier.config(text="Vérification échoué", fg="crimson")
            liste_dialog.append(str(res))
            UpdateScroll()
    
    else:
        Button_Verifier.config(text="Veuillez charger le fichier", fg="crimson")
        liste_dialog.append("Veuillez charger le fichier")
        UpdateScroll()
        

def Calculer_csv():
    
    if verif_effectue:
        
        global liste_instances
        liste_instances[numero_instances-1].calcAll()
        Button_Calculer.config(text="Calcul efféctué", fg="chartreuse4", state=tkinter.DISABLED)
        
    else:
        global liste_dialog
        liste_dialog.append("Veuillez vérifier le fichier")
        UpdateScroll()
        Button_Calculer.config(text="Veuillez vérifier le fichier", fg="crimson")
        
def Exporter_csv():
    nomFichier = Entry_Export.get()
    if nomFichier == "":
        global liste_dialog
        liste_dialog.append("Veuillez mettre un nom de fichier dans la case Export (ex : fichierExport)")
        UpdateScroll()
    else:
        path = tkinter.filedialog.askdirectory()
        liste_instances[numero_instances-1].export(path + "/" + nomFichier + ".csv")
        Button_Exporter.config(text="Fichier exporté", fg="chartreuse4")


def ListeDocs2String() :
    filesStr = ""
    for i in liste_dialog:
        filesStr = filesStr + PassageLigne(i) + "\n--------------------------------------------------------------------\n"
    return filesStr


def PassageLigne(str):
    n = 60
    if len(str) > n and len(str) != 0 :
        return str[0:n] + "\n" + PassageLigne(str[n:])
    elif len(str) != 0:
        return str
    

def UpdateScroll():
    Label_Dialog.config(text=ListeDocs2String())
    Frame_Dialog.update()
    Canvas_Dialog.configure(scrollregion=Canvas_Dialog.bbox('all'))
    
    
def Multi_fun(*functions):
    def func(*args, **kwargs):
        val = None
        for function in functions:
            val = function(*args, **kwargs)
        return val
    return func

def Reset_var():
    global chargement_effectue
    chargement_effectue = False
    global verif_effectue
    verif_effectue = False
    
# =============================================================================
# Interface Graphiques
# =============================================================================

for instance in liste_instances :
    
    #Création de la fenetre
    fenetre=Tk()
    
    fenetre.title("Calculateur sur csv")
    
    fenetre.geometry("550x750")
    
    #Création de la barre de menu
    menubar=Menu(fenetre)
    
    #Frame Frame_Main
    Frame_Main=Frame(fenetre, bg='grey')
    Frame_Main.pack(fill=BOTH, expand=True)
    
    #Label Label_Titre : Nom du logiciel
    Label_Titre=Label(Frame_Main,text='Calculateur de csv',font='Arial 20 bold', fg='black',bg='grey') 
    Label_Titre.pack(padx=30, pady=40)
    
    strFichier = liste_instances[liste_instances.index(instance)].toString()
    #Bouton Button_Selectionner : Séléction du dictionnaire
    Button_Selectionner=Button(Frame_Main,text='Séléctionner fichier "' + strFichier +'"',font='Arial 12',command=Charger_csv, fg='black',bg='white', relief='raised')
    Button_Selectionner.pack(pady=60)
    
    #Label Label_Titre : Nom du logiciel
    Label_Operation=Label(Frame_Main,text='Opérations', font='Arial 12 bold', fg='black',bg='grey')
    Label_Operation.pack(padx=30)
    
    #Frame Frame_Operation
    Frame_Operation=Frame(Frame_Main, width=400, bg='grey')
    Frame_Operation.pack(pady=10)
    
    #Frame Sous_Frame_Gauche_Operation
    Sous_Frame_Gauche_Operation=Frame(Frame_Operation, width=400, bg='grey')
    Sous_Frame_Gauche_Operation.pack(side=LEFT)
    
    #Frame Sous_Frame_Gauche_Operation
    Sous_Frame_Droite_Operation=Frame(Frame_Operation, width=400, bg='grey')
    Sous_Frame_Droite_Operation.pack(side=RIGHT)

    #Bouton Button_Afficher : Button_Afficher le contenu du csv
    Button_Afficher=Button(Sous_Frame_Gauche_Operation,text='Afficher csv',font='Arial 12',command=Afficher_csv, fg='black',bg='white', relief='raised')
    Button_Afficher.pack(side=LEFT, padx=10)
    
    #Bouton Button_Verifier : Vérifier le contenu du csv
    Button_Verifier=Button(Sous_Frame_Gauche_Operation,text='Vérifier',font='Arial 12',command=Verifier_csv, fg='black',bg='white', relief='raised')
    Button_Verifier.pack(side=RIGHT, padx=10)

    #Bouton Calculer : Effectuer les calculs sur le contenu du csv
    Button_Calculer=Button(Sous_Frame_Droite_Operation, text='Calculer',font='Arial 12',command=Calculer_csv, fg='black',bg='white', relief='raised')
    Button_Calculer.pack(side=LEFT, padx=10)
    
    #Bouton Exporter : Exporter le csv précédemment calculé
    Button_Exporter=Button(Sous_Frame_Droite_Operation, text='Exporter',font='Arial 12',command=Exporter_csv, fg='black',bg='white', relief='raised')
    Button_Exporter.pack(side=RIGHT, padx=10)

    #Label Export
    Label_Export=Label(Frame_Main, text='Export', font='Arial 12 bold', fg='black',bg='grey')
    Label_Export.pack(padx=10)

    #Entry Export : Entry le nom du fichier a exporter
    Entry_Export=Entry(Frame_Main, width=30)
    Entry_Export.pack(padx=10)
    
    #Frame ZoneDialog : Frame on se trouvera le canvas
    Frame_ZoneDialog = Frame(Frame_Main, bg='grey')
    Frame_ZoneDialog.pack(pady=10)
    
    #Canvas Dialog : le canva sur lequel agira la scrollbar
    Canvas_Dialog=Canvas(Frame_ZoneDialog, highlightthickness=0)
    Canvas_Dialog.pack(side=LEFT, fill=BOTH, expand=True)
    
    #Scrollbar Ascenseur
    Ascenseur=Scrollbar(Frame_ZoneDialog, command=Canvas_Dialog.yview)
    Ascenseur.pack(side=RIGHT, fill=Y)
    
    Canvas_Dialog.configure(yscrollcommand=Ascenseur.set)
    
    #Frame Dialog : Frame à l'intérieur du canva
    Frame_Dialog=Frame(Canvas_Dialog)
    Canvas_Dialog.create_window((0,0), window=Frame_Dialog, anchor='nw')
    
    #Label Dialog : label qui contiendra les nouvelles informations aux fur et à mesure
    Label_Dialog=Label(Frame_Dialog, text=ListeDocs2String(), bg='white', justify="left")
    Label_Dialog.pack(side= LEFT, fill=BOTH, expand=True)
    
    ##########################################################
    if liste_instances.index(instance) + 1 == nombre_instances:
        Text_Fin = "Quitter"
    else:
        Text_Fin = "Suivant"
    #Bouton de sortie
    Quitter=Button(Frame_Main, text=Text_Fin, font='Arial 10', command=Multi_fun(Reset_var,fenetre.destroy))
    Quitter.pack(pady=10)
    ##########################################################
    
    ##########################################################
    #Affichage de la fenetre
    fenetre.mainloop()
    ##########################################################
