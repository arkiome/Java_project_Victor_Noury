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
	public ArrayList<String> listeNames ;
	static ArrayList<Color> couleurPossible = new ArrayList<Color>(Arrays.asList(Color.red, Color.blue , Color.green ,Color.gray)) ;
	public int nbDeJoueur ;
	public ArrayList<Domino> piocheDeJeux ;
	public ArrayList<Player> listeJoueur ;
	public boolean LeGrandDuel = false;
	public boolean Harmonie = false;
	public boolean Empiredumilieu = false;
	public boolean Dynastie = false;
	public ArrayList<ArrayList<Domino>> petitePioche;
	public int nbDominosTires;
	
	public menu(int nbDeHumain, int nbDeIA,ArrayList<Domino> piocheInit ) {
		super();
		this.nbDeHumain = nbDeHumain;
		this.nbDeIA = nbDeIA;
		this.nbDeJoueur = nbDeHumain+nbDeIA;
		creerPiocheJeux(piocheInit);
		nbTirerdominos();
		for (int i=0;i<nbDeHumain;i++) { 
			ajoutJoueur (true);
		}
		for (int i=0;i<nbDeHumain;i++) { 
			ajoutJoueur (false);
		}
		for(int i = 0; i < listeJoueur.size(); i++)
	    {
			listeNames.add(listeJoueur.get(i).Lirepseudo());
	    }
	}
	
	//permet just de ajouter 1 joueur humain
	public void ajoutJoueur (boolean humain) {
		//System.out.println("entrer 1 pour ajouter 2 pour suppre");
		int taille =listeJoueur.size();
		if (humain) {
			try {
				Color couleur = couleurPossible.get(taille) ;
				Plateau board = new Plateau() ;
				RealPlayer player = new RealPlayer(board,couleur);
				listeJoueur.add(player);
			} catch (Exception e) {
				System.out.println("trop de joueur(4 joueurs max)");
			}
		}
		else {
			try {
				Color couleur = couleurPossible.get(taille) ;
				Plateau board = new Plateau() ;
				IA IAplayer = new IA(board, couleur);
				listeJoueur.add(IAplayer);
			} catch (Exception e) {
				System.out.println("trop de joueur(4 joueurs max)");
			} 
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
	
	public void trierDomino(ArrayList<Domino> piocheDeJeux) {
		Collections.sort(piocheDeJeux);
	}
	
	public void mélangerJoueur() {
	 	Collections.shuffle(listeJoueur);
	}
	
	public void nbTirerdominos() {	
		if (nbDeJoueur == 3) {
			nbDominosTires=3;
		}
		else {
			nbDominosTires= 4;
		}
	}
	
	
	
	public ArrayList<Domino> Tirerdominos(int nbDominoTirage) {
		
		return piocheDeJeux;
	}
}

