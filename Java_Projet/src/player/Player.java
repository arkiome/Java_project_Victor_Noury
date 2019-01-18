package player;
import java.awt.Color;
import java.util.ArrayList;

import game.dominos.Domino;
import game.dominos.DominoPart;
import game.dominos.Plateau;


public abstract class Player {

	public String pseudo ;
	public Color color ;
	public Plateau plateau ;
	public ArrayList<Domino> choixDomino = new ArrayList<Domino>();
	
	
	public ArrayList<Domino> getChoixDomino() {
		return choixDomino;
	}
	public void setChoixDomino(ArrayList<Domino> choixDomino) {
		this.choixDomino = choixDomino;
	}
	public void setChoix(Domino domino) {
		choixDomino.add(domino);
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
	
	
	public Domino retirer1erChoixDomino() {
		Domino domi = choixDomino.get(0);
		choixDomino.remove(0);
		return domi ;
	}
	
	//r�aliser la s�cu
	public boolean placementDomino(Domino domino,int x1,int y1,int x2,int y2){
		//attendre le choix prit sur la fen�tre sous forme int x et int y
		
		if (plateau.verifPlacement(domino.getNiemDominoPart(0),x1,y1) & plateau.verifPlacement(domino.getNiemDominoPart(1),x2,y2)) {
		plateau.getBoard()[x1][y1].setContenu(domino.getDomino().get(0));
		plateau.getBoard()[x2][y2].setContenu(domino.getDomino().get(1));
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public void modifBoardPlacement(int x,int y) {
		int coloneModife=0;
		int ligneModife=0;
		//mettre fa�on de determiner ligne/colone
		
		
		for (int i = 0; i < plateau.getBoard().length; i++) { 
//retourne true si pla�able => le modifie en true			
			if (plateau.getBoard()[ligneModife][i].isPla�able()) {
				plateau.getBoard()[ligneModife][i].setPla�able(false);
			} 
			if (plateau.getBoard()[i][coloneModife].isPla�able()) {
				plateau.getBoard()[i][coloneModife].setPla�able(false);
			}
		
		}
		
	}
	/*
	//le clique doit retourner l'indice du domino
	public void choixDomino(ArrayList<Domino> petitePioche ,int choix){
		//attendre le choix prit sur la fen�tre parmit les 4/3 dominos
		choixDomino = petitePioche.get(choix);
		petitePioche.remove(choix);
	}
		public ArrayList<Domino> Tirerdominos(int nbDominoTirage) {
		
		return piocheDeJeux;
	}
	*/
}
