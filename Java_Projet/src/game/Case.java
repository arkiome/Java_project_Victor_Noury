package game;

import game.dominos.DominoPart;

public class Case {

	public DominoPart contenu ;
	public boolean plaçable ;
	
	public Case(DominoPart contenu,boolean plaçable) {
		super();
		this.contenu = contenu;
		this.plaçable = plaçable;
	}
	
	public boolean isPlaçable() {
		return plaçable;
	}

	public void setPlaçable(boolean plaçable) {
		this.plaçable = plaçable;
	}

	public DominoPart getContenu() {
		return contenu;
	}
	public void setContenu(DominoPart contenu) {
		this.contenu = contenu;
	}
		
	//////////////////////////
}
