package game.dominos;

import game.Case;
//	public ? placement chateau  ;
//	public ?9*9 plateau	
	
public class Plateau {
	private Case[][] board;  
	private int nombre_ligne = 9; 
	private int nombre_colonne = 9; 

	
	

	protected Plateau(Case[][] board) {
		super();
		this.board = board;
	}
	public Case[][] getBoard() {
		return board;
	}
	public void setBoard(Case[][] board) {
		this.board = board;
	}

	
	public Plateau () {
		//ajouter un if pour la modification Le grand duel
			

		board = new Case [nombre_ligne][nombre_colonne];
		

			for(int i=0; i<nombre_ligne; i++) {
				for(int j=0; j<nombre_colonne; j++) {
					DominoPart domiVide = new DominoPart("1", 0);
					Case vide = new Case(domiVide);
					board [i][j] = vide;
				}
			

			board[5][5] = typeCaseRedondant.get(1); 
			}
	}
	
	public void afficher_grille() {
		System.out.println();
		for(int i=0; i<nombre_ligne; i++) {
			for(int j=0; j<nombre_colonne; j++) {
				System.out.print(" | " + board[i][j]);
				

			}
			System.out.println(" | ");
		}
		System.out.println(" | ");
	}
}