package player;
import java.awt.Color;
import java.util.ArrayList;

import game.dominos.Domino;
import game.dominos.Plateau;


public abstract class Player {

	public String pseudo ;
	public Color color ;
	public Plateau plateau ;
	public Domino choixDomino = null ;
	
	
	public Domino getChoixDomino() {
		return choixDomino;
	}
	public void setChoixDomino(Domino choixDomino) {
		this.choixDomino = choixDomino;
	}
////////////////////////////////////////	
	public  String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
////////////////////
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
////////////////////
	public Plateau getPlateau() {
		return plateau;
	}
	public void setPlateau(Plateau board) {
		this.plateau = board;
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
	
	
	
	public void modifBoardPlacement(int x,int y) {
		int coloneModife=0;
		int ligneModife=0;
		//mettre façon de determiner ligne/colone
		
		
		for (int i = 0; i < plateau.getBoard().length; i++) { 
//retourne true si plaçable => le modifie en true			
			if (plateau.getBoard()[ligneModife][i].isPlaçable()) {
				plateau.getBoard()[ligneModife][i].setPlaçable(false);
			} 
			if (plateau.getBoard()[i][coloneModife].isPlaçable()) {
				plateau.getBoard()[i][coloneModife].setPlaçable(false);
			}
		
		}
		
	}
	/*
	//le clique doit retourner l'indice du domino
	public void choixDomino(ArrayList<Domino> petitePioche ,int choix){
		//attendre le choix prit sur la fenêtre parmit les 4/3 dominos
		choixDomino = petitePioche.get(choix);
		petitePioche.remove(choix);
	}
		public ArrayList<Domino> Tirerdominos(int nbDominoTirage) {
		
		return piocheDeJeux;
	}
	*/
}
