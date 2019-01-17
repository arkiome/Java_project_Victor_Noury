package graphique;

import java.awt.Frame;
import javax.swing.SwingUtilities; 

public class main_graphique {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new frame("Menu Domination"); 
			}
		});
	}
} 
