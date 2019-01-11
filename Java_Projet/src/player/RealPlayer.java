package player;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

import game.Case;
import game.dominos.Domino;
import game.dominos.DominoPart;
import game.dominos.Plateau; 

public class RealPlayer extends Player{

	public RealPlayer(Plateau board,Color couleur/*,String pseudo*/) {
		super();
		this.plateau=board;
		this.color=couleur;
		Scanner scan = new Scanner(System.in);
		System.out.println("entrer votre pseudo");
		String pseudo= scan.next();
		scan.close();
		this.pseudo=pseudo;
	} 
	
	public void joueruncoup() {
		
	}
}
