package player;
import java.awt.Color;
import java.util.ArrayList;

import game.dominos.Domino;
import game.dominos.Plateau;

public abstract class Player {

	static String pseudo ;
	static Color color ;
	static Plateau plateau ;
	static Domino choixDomino ;
	
	public static String getPseudo() {
		return pseudo;
	}
	public static void setPseudo(String pseudo) {
		Player.pseudo = pseudo;
	}
////////////////////
	public static Color getColor() {
		return color;
	}
	public static void setColor(Color color) {
		Player.color = color;
	}
////////////////////
	public static Plateau getPlateau() {
		return plateau;
	}
	public static void setPlateau(Plateau board) {
		Player.plateau = board;
	}



	//	public int tourDeJeux ;
		
	public String Lirepseudo() {
		return(pseudo);

	}
	
	//réaliser la sécu
	public void placementDomino(Domino domino,int x1,int y1,int x2,int y2){
		
		//attendre le choix prit sur la fenêtre sous forme int x et int y
		plateau.getBoard()[x1][y1].setContenu(domino.getDomino().get(0));
		plateau.getBoard()[x2][y2].setContenu(domino.getDomino().get(1));
	}
	//le clique doit retourner l'indice du domino
	public void choixDomino(ArrayList<Domino> petitePioche ,int choix){
		//attendre le choix prit sur la fenêtre parmit les 4/3 dominos
		choixDomino = petitePioche.get(choix);
		petitePioche.remove(0);
	}
}

