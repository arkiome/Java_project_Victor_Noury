package game;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


import java.util.Scanner;

import game.dominos.Domino;
import game.dominos.DominoPart;
import game.dominos.TerrainType;



public class Controleur<Terraintype> {
	public static ArrayList<Domino> piocheInit ;	
	public int numTour ;
	static ArrayList<Case> typeCaseRedondant =new ArrayList<Case>(Arrays.asList(
					new Case(new DominoPart("0",0 )),
					new Case(new DominoPart("chateau",0))
					//vide + implassable jusqu'en fin de partie
					)); 
	static menu menudeJeu; //mettre un array<menu> pour sauv plusieur partie 
	
	
	public void creerPiocheInit() {
		creerPiocheInit(importerDomino());
	}
	public void innitialisationMenu() {
		//determine nombre total de joueur ,attention choix avec console 
		//mettre ajout limite
		int nbJoueur= nbJoueurViaConsole();
		int nbIa= nbIaViaConsole();
		//creer un menu de jeux
		menudeJeu = new menu(nbJoueur, nbIa ,piocheInit);
	}
		
	public int nbJoueurViaConsole() {
		Scanner scan = new Scanner(System.in);
		System.out.println("nombre joueur?");
		int nbJoueur= scan.nextInt();
		scan.close();
		return nbJoueur;
	}
	public int nbIaViaConsole() {
		Scanner scan = new Scanner(System.in);
		System.out.println("nombre IA?");
		int nbIA= scan.nextInt();
		scan.close();
		return nbIA;
	}	
	static ArrayList<String[]> importerDomino() {
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
		
	//creer
	static void creerPiocheInit(ArrayList<String[]> allInfoDomino) {
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
	public void commencerpartie(menu menu) {
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
		//		
		//		prendre les 3/4 premiers dominos suivant et les trier+les mettre de cotés 
		//		---
		//		dernier tour (tous les joueur) : le placer sur son board
//
	}

}