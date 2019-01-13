package game;

import game.dominos.DominoPart;

public class Case {

	public DominoPart contenu ;
	public boolean pla�able ;
	
	public Case(DominoPart contenu,boolean pla�able) {
		super();
		this.contenu = contenu;
		this.pla�able = pla�able;
	}
	
	public boolean isPla�able() {
		return pla�able;
	}

	public void setPla�able(boolean pla�able) {
		this.pla�able = pla�able;
	}

	public DominoPart getContenu() {
		return contenu;
	}
	public void setContenu(DominoPart contenu) {
		this.contenu = contenu;
	}
		
	//////////////////////////
}
