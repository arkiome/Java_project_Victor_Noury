package game;

import game.dominos.DominoPart;

public class Case {

	public DominoPart contenu ;

	public Case(DominoPart contenu) {
		super();
		this.contenu = contenu;
	}
	
	public DominoPart getContenu() {
		return contenu;
	}
	public void setContenu(DominoPart contenu) {
		this.contenu = contenu;
	}
//////////////////////////
}
