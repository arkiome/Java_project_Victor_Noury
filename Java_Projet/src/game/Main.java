package game;

public class Main {
static int nombre=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Controleur.creerPiocheInit();
		//attendre nom + nb joueur
		Controleur.innitialisationMenu(nombre,0);
		Controleur.commencerPartie();
		
	}
}
