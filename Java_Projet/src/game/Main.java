package game;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
public static int nombre;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Controleur.creerPiocheInit();
		//attendre nom + nb joueur
		Controleur.innitialisationMenu(/*nombre,0*/);
		Controleur.commencerPartie();
			
	}
}
