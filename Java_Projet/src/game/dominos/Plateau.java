package game.dominos;

import javax.swing.Spring;

import game.Case;
//	public ? placement chateau  ;
//	public ?9*9 plateau	
import game.Controleur;
	
public class Plateau {
	public static Case[][] board;  
	private int nombre_ligne = 9; 
	private int nombre_colonne = 9; 

	
	public Plateau () {
		//ajouter un if pour la modification Le grand duel
		super();
		Plateau.board = new Case [nombre_ligne][nombre_colonne];
		

			for(int i=0; i<nombre_ligne; i++) {
				for(int j=0; j<nombre_colonne; j++) {
					DominoPart domiLibre = new DominoPart("       ", 0);
					Case vide = new Case(domiLibre,false);
					board [i][j] = vide;
				}
			board[4][4] = Controleur.getTypeChateau(); 
			
			}
	}

	public Case[][] getBoard() {
		return board;
	}
	
	public void setBoard(Case[][] board) {
		Plateau.board = board;
	}

	public void afficher_grille() {
		System.out.print(" |");
		for(int j=0; j<nombre_colonne; j++) {
			System.out.print("    "+j+"    |");}
		System.out.println("");
		
		for(int i=0; i<nombre_ligne; i++) {
			for(int j=0; j<nombre_colonne; j++) {
				System.out.print(" | " + retournTerrainType(i,j));
			}
		System.out.print(" | ");
		System.out.println(i);
		}
	}
	
	public boolean verifDroite(DominoPart dominoPart,int x1,int y1) {
		try {
			board[x1][y1+1].getContenu();
			String terrainType = board[x1][y1+1].getContenu().getTerrainType();
			if(terrainType == dominoPart.getTerrainType() || "chateau" == terrainType) {
				return(true);
			}
			else {
				return(false);
			}
		}
		catch(Exception e) {
			return(false);
		}
	}
	public boolean verifGauche(DominoPart dominoPart,int x1,int y1) {
		try {
			board[x1][y1-1].getContenu();
			String terrainType = board[x1][y1-1].getContenu().getTerrainType();
			if(terrainType == dominoPart.getTerrainType() || "chateau" == terrainType) {
				return(true);
			}
			else {
				return(false);
			}
		}
		catch(Exception e) {
			return(false);
		}
	}
	public boolean verifHaut(DominoPart dominoPart,int x1,int y1) {
		try {
			board[x1-1][y1].getContenu();
			String terrainType =board[x1-1][y1].getContenu().getTerrainType();
			if(terrainType == dominoPart.getTerrainType() || "chateau" == terrainType) {
				return(true);
			}
			else {
				return(false);
			}
		}
		catch(Exception e) {
			return(false);
		}
	}	
	static boolean verifBas(DominoPart dominoPart,int x1,int y1) {
		try {
			
			String terrainType = board[x1+1][y1].getContenu().getTerrainType();
			if(terrainType == dominoPart.getTerrainType() || "chateau" == terrainType) {
				return(true);
			}
			else {
				return(false);
			}
		}
		catch(Exception e) {
			return(false);
		}
	}
	
	public String retournTerrainType(int x1,int y1) {
		return(board[x1][y1].getContenu().getTerrainType());
	}
	
	public boolean verifPlacement(DominoPart dominoPart,int x1,int y1) {
		
		if(board[x1][y1].isPlaçable() 
				& (verifBas(dominoPart, x1, y1) 
				|| verifDroite(dominoPart, x1, y1)
				|| verifGauche(dominoPart, x1, y1)
				|| verifHaut(dominoPart, x1, y1))) {
			return(true);
		}
		else {
			return(false);
		}
	}
	
}