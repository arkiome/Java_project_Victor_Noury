package player;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

import game.Plateau;
import game.dominos.Domino; 

public class RealPlayer extends Player{

	public RealPlayer(Plateau board,Color couleur) {
		super();
		Scanner scan = new Scanner(System.in);
		System.out.println("entrer votre pseudo");
		String pseudo= scan.next();
		scan.close();
		this.pseudo=pseudo;
		this.board=board;
		this.color=couleur;	
	} 
	
	public void joueruncoup() {

	}

	public void choisirDomino(ArrayList<Domino> pioche){
		//attendre le choix prit sur la fenêtre
	}
	public void placerDomino(Domino domino){
		int x1,x2,y1,y2 ;
		//attendre le choix prit sur la fenêtre sous forme int x et int y
		
	}
	// TODO Auto-generated constructor stub
	
	}
