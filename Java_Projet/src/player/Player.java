package player;
import java.awt.Color;

import game.Plateau;

public abstract class Player {

	public String pseudo ;
	public Color color ;
//	public int tourDeJeux ;
	public Plateau board ;
	
	public String Lirepseudo() {
		return(pseudo);

	}
}

