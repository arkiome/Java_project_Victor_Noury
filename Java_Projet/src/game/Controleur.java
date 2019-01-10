package game;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import game.dominos.Domino;
import game.dominos.DominoPart;
import game.dominos.TerrainType;
import player.IA;
import player.Player;
import player.RealPlayer;


public class Controleur<Terraintype> {
	public ArrayList<Domino> piocheInit ;	
	public int numTour ;
	public ArrayList<TerrainType> typeDeTerrain ;
	static menu menudeJeu; //mettre un array<menu> pour sauv plusieur partie 
	
	public void modificationPlayer() {
// for (Player player ; listeJoueur)
	}
	
	public void innitialisationMenu() {
		//determine nombre total de joueur ,attention choix avec console 
		//ajout limite
		Scanner scan = new Scanner(System.in);
		System.out.println("nombre joueur? (humain) ");
		int nbJoueurHumain= scan.nextInt();
		System.out.println("nombre IA?");
		int nbJoueurIA= scan.nextInt();
		scan.close();
		
		//importation domino
		ArrayList<String[]> piocheIntermédiaire=importerDomino();
		creerPiocheInit(piocheIntermédiaire);
		
		//creer un menu de jeux
		menudeJeu = new menu(nbJoueurHumain, nbJoueurIA ,piocheInit);
	}
	
	
	public ArrayList<String[]> importerDomino() {
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
		//les informations sont dans allInfoDomino sous forme de string
		return (allInfoDomino);
	}	
		
	
	public void creerPiocheInit(ArrayList<String[]> allInfoDomino) {
		Domino domino ;
		for (String[] info1Domino : allInfoDomino) {
			
			//switch () {}
				DominoPart dominopart1 = new DominoPart(info1Domino[1] , Integer.parseInt(info1Domino[0]));
				DominoPart dominopart2 = new DominoPart(info1Domino[3] , Integer.parseInt(info1Domino[2]));
			//Creation des 2 parties d'un domino % du fichier
				
				ArrayList<DominoPart> dominoParts = new ArrayList<DominoPart>(Arrays.asList(dominopart1,dominopart2));
				
				
				domino = new Domino(dominoParts,Integer.parseInt(info1Domino[4]));
				
				piocheInit.add(domino);
		//la pioche est constituée de tous les dominos [dominopart]*2 + num
		//													|--> String + nb couronne
		}
	}
	public void jouerpartie(menu menu) {
		//1er tour
		menu.mélangerJoueur();
		
		
		//	prendre les 3/4*2 premiers dominos et les trier+les mettre de cotés :
		//	menu.jouer la manche 	
		//		1er tour 
		//		(tous les joueur) [choisir un domino parmi les restants de la premiere pile selon odre (hazard)]
		//		---
		//		(trier joueurs en fonction des domino tiré)
		//			par odre des num des dominos choisi 
		//				(tous les joueur)[choisir position du domino +
		//								  mettre domino selon position +
		//								  choisir un domino sur liste suivante]
		//		prendre les 3/4 premiers dominos suivant et les trier+les mettre de cotés 
		//		---
		//		dernier tour (tous les joueur) : le placer sur son board

	}

}