package game;
import java.awt.Color; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
	
	public ArrayList<Player> getListeJoueur() {
		return listeJoueur;
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
		piocheDeJeux=piocheInit;
		Collections.shuffle(piocheDeJeux);
		for (int i=0 ; i<48-nbDeJoueur*12;i++) {
			piocheDeJeux.remove(0);
		}
	}
	
	public ArrayList<Integer> creerListIdJeux(int nbJoueur) {
		ArrayList<Integer> listId = new ArrayList<Integer>();
		for(int i=0 ; i<nbJoueur;i++) {
			listId.add(i);
		} 
		return listId;
	}	
	
	public void trierDomino(ArrayList<Domino> piocheDeJeux) {
		Collections.sort(piocheDeJeux);
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
	
	public ArrayList<Domino> get1erPetitesPioches() {
		return petitesPioches.get(0);
	}

	public Player getplayer(int indice) {
		return listeJoueur.get(indice);
	}
	
	public void setPetitesPioches(ArrayList<ArrayList<Domino>> petitesPioches) {
		this.petitesPioches = petitesPioches;
	}

	public ArrayList<Domino> getPiocheDeJeux(int  i) {
		return piocheDeJeux;
	}
	
	public ArrayList<Integer> getListeIdJoueur() {
		return listeIdJoueur;
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
		petitesPioches.add(petitePioche);
	}
	
	// attend le id que envois la iHM retourn true si bon tour du joueur
	public boolean verifBonJoueur(int idJoueur) {
		if (idJoueur == listeIdJoueur.get(numTourJoueur)){return true;}
		else {return false;}
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
	public void Tiragedominos(int numDominoTire,int idJoueur) {
		Domino domino =get1erPetitesPioches().get(numDominoTire);
		getplayer(idJoueur).setChoixDomino(domino);
	}
	
	public void innitialisationTour1er(){
		mélangerIdJoueur();
		creerPetitePioche();
		creerPetitePioche();
	}	
		
		
}
	



