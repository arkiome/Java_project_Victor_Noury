package game;
import java.awt.Color; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import game.dominos.Domino;
import game.dominos.Plateau;
import player.IA;
import player.Player;
import player.RealPlayer;

public class menu {

	public int nbDeHumain ;
	public int nbDeIA ;
	public ArrayList<Integer> listeIdJoueur ;
	public ArrayList<String> listeNames ;
	static ArrayList<Color> couleurPossible = new ArrayList<Color>(Arrays.asList(Color.red, Color.blue , Color.green ,Color.gray)) ;
	public int nbDeJoueur ;
	public int numTourJoueur=0;
	public ArrayList<Domino> piocheDeJeux ;
	public ArrayList<Player> listeJoueur ;
	public boolean LeGrandDuel = false,Dynastie = false,Empiredumilieu = false,Harmonie = false;
	public ArrayList<ArrayList<Domino>> petitesPioches;
	public int nbDominosTires;
	public Integer[] ordreTourSuivant;
	
	public ArrayList<Player> getListeJoueur() {
		return listeJoueur;
	}
	
	public Player getNiemeListeJoueur(int numJoueur) {
		return listeJoueur.get(numJoueur-1);
	}
	
	public void setListeJoueur(ArrayList<Player> listeJoueur) {
		this.listeJoueur = listeJoueur;
	}

	public menu(int nbDeHumain, int nbDeIA, ArrayList<Domino> piocheInit) {
		super();
		this.nbDeHumain = nbDeHumain;
		this.nbDeIA = nbDeIA;
		this.nbDeJoueur = nbDeHumain+nbDeIA;
		this.listeJoueur= new ArrayList<Player>();
		creerPiocheJeux(piocheInit);
		nbTirerdominos();
		this.listeIdJoueur =  creerListIdJeux(nbDeJoueur);
		this.petitesPioches= new  ArrayList<ArrayList<Domino>>();
		int indice=0;
		
		for (int i=0;i<nbDeHumain;i++) { 
			ajoutJoueur (true,indice);
		}
		for (int i=0;i<nbDeIA;i++) { 
			ajoutJoueur (false,indice);
		}
	}
	
	//permet just de ajouter 1 joueur humain
	public void ajoutJoueur (boolean humain,int indice) {
		//System.out.println("entrer 1 pour ajouter 2 pour suppre");
		
		if (humain) {
				System.out.println("1");
				Color couleur = couleurPossible.get(indice) ;
				Plateau board = new Plateau() ;
				RealPlayer player = new RealPlayer(board,couleur);
				
				listeJoueur.add(player);
				indice = indice+1;
		}
		else {
			
				System.out.println("2");
				Color couleur = couleurPossible.get(indice) ;
				Plateau board = new Plateau() ;
				IA IAplayer = new IA(board, couleur);
				listeJoueur.add(IAplayer); 
				indice = indice+1;
		}
	}
	
	public void creerPiocheJeux(ArrayList<Domino> piocheInit) {
	//on cree les différentes pioche % du nombre de joueur : arrayList de domino
		piocheDeJeux=(piocheInit);
		Collections.shuffle(piocheDeJeux);
		for (int i=0 ; i<48-nbDeJoueur*12;i++) {
			piocheDeJeux.remove(0);
		}
	}
	
	//pour mieux fonctionner le faire en fonction d'un joueur
	public void afficherplateau() {
		for (Player player : listeJoueur)
			player.getPlateau().afficher_grille();
	}
	
	public ArrayList<Integer> creerListIdJeux(int nbJoueur) {
		ArrayList<Integer> listId = new ArrayList<Integer>();
		switch (nbJoueur) {
		case 2:
			for(int i=0 ; i<nbJoueur;i++) {
				listId.add(i+1);
				listId.add(i+1);
			}
			break;
		default :
			for(int i=0 ; i<nbJoueur;i++) {
				listId.add(i+1);
			}
			break;
		}
		return listId;
	}	
	
	public ArrayList<Domino> trierDomino(ArrayList<Domino> piocheDeJeux) {
		Collections.sort(piocheDeJeux);
		return piocheDeJeux;
	}
	
	public void mélangerIdJoueur() {
	 	Collections.shuffle(listeIdJoueur);
	}
	
	public void nbTirerdominos() {	
		if (nbDeJoueur == 3) {
			nbDominosTires=3;
		}
		else {
			nbDominosTires= 4;
		}
	}
	
	public void afficheConsoleNiemPtPioche(int a) {
		for (Domino Domi : getNiemePetitesPioches(a)) {
			
			if(Domi==null) {
			System.out.println("domino déjà choisi");
			}
			else {
			Domi.afficheConsoleDomino();
			}
		}
	}
	
	public ArrayList<Domino> getNiemePetitesPioches(int indice) {
		return petitesPioches.get(indice);
	}
	
	public void setPetitesPioches(ArrayList<ArrayList<Domino>> petitesPioches) {
		this.petitesPioches = petitesPioches;
	}

	public void setListeIdJoueur(ArrayList<Integer> listeIdJoueur) {
		this.listeIdJoueur = listeIdJoueur;
	}

	//prend domino 
	public void creerPetitePioche() {
		
		ArrayList<Domino> petitePioche = new ArrayList<Domino>();
		for(int i=0 ; i<nbDominosTires;i++ ) {
			petitePioche.add(piocheDeJeux.get(i));
			piocheDeJeux.remove(i);
		}
		trierDomino(piocheDeJeux);
		petitesPioches.add(trierDomino(petitePioche));
	}
	
	public ArrayList<Integer> creerNiemeListeNumDomino(int indice) {
		ArrayList<Integer> ListeNumDomino = new ArrayList<Integer>();
		for (Domino i :getNiemePetitesPioches(indice)) {
			ListeNumDomino.add(i.getNumero());}
	return ListeNumDomino;
	}
	
	// attend le id que envois la iHM retourn true si bon tour du joueur
	public boolean verifBonJoueur(int idJoueur) {
		if (idJoueur == listeIdJoueur.get(numTourJoueur)){return true;}
		else {return false;}
	}
	
	public void tourChoixDomino() {
		ArrayList<Integer> ListeNumDomino = new ArrayList<Integer>();
		ListeNumDomino=creerNiemeListeNumDomino(0);
		ordreTourSuivant= new Integer[nbDominosTires];
		for (int id : listeIdJoueur) {
			getNiemeListeJoueur(id).getPlateau().afficher_grille();
			afficheConsoleNiemPtPioche(0);
			ListeNumDomino=Tiragedominos(/* numDominoTire,*/id,ListeNumDomino);
		}
	for (int i=0;i<listeIdJoueur.size();i++) {
		listeIdJoueur.set(i,ordreTourSuivant[i]);
		}
	}
	
	
	
	//le tour 0 est égale au tour 1:permet de l'utiliser comme undice
	public void toursSuivant() {
		if (numTourJoueur<nbDeJoueur-1) {
			numTourJoueur = numTourJoueur+1;
		}
		else {
			numTourJoueur = 0;
		}
	}
	// attend les id joueurs+domino / que envois la iHM : met le domino comme choix du perso 
	
	public ArrayList<Integer> Tiragedominos(/*int numDominoTire,*/int idJoueur,ArrayList<Integer> ListeNumDomino) {
///////// A RETIRER SI INTERFACE GRAPHIQUE //////////+ListeNumDomino
		int numDominoTire=0;
		boolean choisi = false ;
		int indicechoix;
		Scanner scan1 = new Scanner(System.in);
		do {
			System.out.println("joueur" + idJoueur +" choisi ton numero de domino");
			try {
				numDominoTire = scan1.nextInt();
				
				if(ListeNumDomino.contains(numDominoTire)) {
					choisi = true;
				}
				else {System.out.println("mauvais numero");
				scan1.nextLine();
				;}
			}catch(Exception e) {
				System.out.println("mauvaise entrée");
				scan1.nextLine();
			}
		}while(!choisi);
		scan1.close();
		
		//////////////////////////////////
		//POTENTIELLEMENT UTILE // prévoir ordre tour suivant
		indicechoix=ListeNumDomino.indexOf(numDominoTire);
		ListeNumDomino.set(indicechoix,null);
		ordreTourSuivant[indicechoix+1]=idJoueur;
		  ////////////////////
		Domino domino =getNiemePetitesPioches(0).get(numDominoTire);
		getNiemeListeJoueur(idJoueur-1).setChoix(domino);
		getNiemePetitesPioches(0).set(indicechoix,null);
		return ListeNumDomino;
	}
	
	public void innitialisationTour1er(){
		mélangerIdJoueur();
		creerPetitePioche();
		creerPetitePioche();
	}	
	public void faire1erTour(){
		tourChoixDomino();	
	}
	
}
	



