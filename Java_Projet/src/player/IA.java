package player;

import java.awt.Color;

import game.Plateau;

public class IA extends Player{
	
	public IA(Plateau board , Color color) {
		this.board = board ;
		this.pseudo = "IA" ;
		this.color = color ;
	}
}
/*public class IA extends Player*/