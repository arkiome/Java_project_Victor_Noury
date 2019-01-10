
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import game.dominos.Domino;
import game.dominos.DominoPart;


public class TestNul {
	static ArrayList<Domino> pioche;
	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DominoPart dominopart1 = new DominoPart("test1", 1);
		DominoPart dominopart2 = new DominoPart("test2", 2);
		ArrayList<DominoPart> dominoParts = new ArrayList<DominoPart>(Arrays.asList(dominopart1,dominopart2));
		Domino domino = new Domino(dominoParts,5);
		pioche.add(domino);
		
		dominopart1 = new DominoPart("test3", 1);
		dominopart2 = new DominoPart("test4", 2);
		dominoParts = new ArrayList<DominoPart>(Arrays.asList(dominopart1,dominopart2));
		domino = new Domino(dominoParts,1);
		pioche.add(domino);
		
		dominopart1 = new DominoPart("test5", 1);
		dominopart2 = new DominoPart("test6", 2);
		dominoParts = new ArrayList<DominoPart>(Arrays.asList(dominopart1,dominopart2));
		domino = new Domino(dominoParts,3);
		pioche.add(domino);
		
		for (Domino domi : pioche) {
			System.out.println(domi.returnNumero());
		}
		
		/*
		System.out.println("test concluant");
		int a=0;
		for (int i=0 ; i<a;i++) {
			System.out.println("test non concluant");
		}
		
		ArrayList<Integer> test = new ArrayList<Integer>() ;
		test.add(1);
		test.add(0);
		test.add(8);
		test.add(3);
		test.size();
		test.get(1);
		//il y a erreur donc on peut dire catch try
		System.out.println(test.get(1));
		test.get(3);
		*/
		
		/*	
		Scanner scanner = null;
		String[] elements = null ;
		ArrayList<String[]> allDomino ;
		
		try 
			{scanner = new Scanner(new File("./domino.csv")); } 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		allDomino = new ArrayList<String[]>() ;
		
		while (scanner.hasNext()) {
		    String line = scanner.nextLine();
		    elements = line.split(","); 
		    allDomino.add(elements);
		}
		scanner.close(); 
		
		for (String[] i : allDomino) {
			
			for (String j : i) {
				System.out.print(j + " "); 
			}
			System.out.println();
		}
	
		test=importerDomino();
	*/
	}
	
}