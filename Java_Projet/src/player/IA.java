package player;

import java.awt.Color;

import game.dominos.Plateau;

public class IA extends Player{
	
	public IA(Plateau board , Color color) {
		super();
		this.plateau = board ;
		this.pseudo = "IA" ;
		this.color = color ;
	}
}
/*public class IA extends Player*/