package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import game.dominos.Domino;
import game.dominos.DominoPart;
import game.dominos.TerrainType;
import player.IA;
import player.Player;
import player.RealPlayer;


public class Controleur {
	static List<Player> listeJoueur ;
	public ArrayList<Domino> piocheInit ;	
	public ArrayList<Domino> piocheDeJeux ;
	public int numTour ;
	
	//public ArrayList<Domino> piochetiré2 ;
	//public HashMap <Domino.numero,Domino.domino> ;
	
	public void modificationPlayer() {
			
// for (Player player ; listeJoueur)
	
	}
	
	public void innitialisation() {
		System.out.println( "il y a "+menu.nbDeJoueur+" joueur."  );	
		listeJoueur= new ArrayList<>();
		for ( int i=1 ; i <= menu.nbDeHumain ; i++) {
//			listeJoueur.add(new RealPlayer.RealPlayer(new ));
		}
		for ( int i=0 ; i < menu.nbDeIA ; i++) {
//			listeJoueur.add(new IA.IA(new board,"IA", ));
		}

		//sans regles additionnelles
		int nbDomino = menu.nbDeJoueur*12;
		System.out.println(nbDomino);
			
	}
	public void lancerPartie() {
		
	}
	
	public void créerPiocheInit() {
		Scanner scanner = null;
		String[] elements = null ;
		ArrayList<String[]> allInfoDomino ;
		
		try 
			{scanner = new Scanner(new File("./domino.csv")); } 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		allInfoDomino = new ArrayList<String[]>() ;
		
		while (scanner.hasNext()) {
		    String line = scanner.nextLine();
		    elements = line.split(","); 
		    allInfoDomino.add(elements);
		}
		scanner.close();
		/*
		for (String[] i : allInfoDomino) {
			DominoPart dominopart1 = new DominoPart(i[1],Integer.parseInt(i[0]));
			DominoPart dominopart2 = new DominoPart(i[3],Integer.parseInt(i[2]));
			
			Domino(,);
		}*/
	}
	public void crééAllDomiPart() {
		
	}
}
