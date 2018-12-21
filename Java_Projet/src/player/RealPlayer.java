package player;

import java.awt.Color;

import game.Plateau;

public class RealPlayer extends Player {
	
	public RealPlayer(Plateau board ,String pseudo, Color color) {
	this.board = board ;
	this.pseudo = pseudo ;
	this.color = color ;
	}
	
	public void jouerUnTour() {
		placerDomino();
		choixDomino();
	}
	
	public void placerDomino() {
		
	}
	
	public void choixDomino() {
		
	}

}
