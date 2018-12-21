import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class TestNul {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
	}
}