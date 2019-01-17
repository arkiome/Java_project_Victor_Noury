package graphique;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class plateau extends JComponent {
	
	//ImageIcon image_rouge, image_bleu, image_jaune, image_marron, image_vert_clair, image_vert_foncé, image_gris;


			
	plateau (){
		//ImageIcon image_rouge = new ImageIcon(getClass().getResource("/image/rouge.png"));
		//ImageIcon image_bleu = new ImageIcon(getClass().getResource("/image/bleu.png"));
		//ImageIcon image_jaune = new ImageIcon(getClass().getResource("/image/jaune.png"));
		//ImageIcon image_marron = new ImageIcon(getClass().getResource("/image/marron.png"));
		//ImageIcon image_vert_clair = new ImageIcon(getClass().getResource("/image/vert_clair.png"));
		//ImageIcon image_vert_foncé = new ImageIcon(getClass().getResource("/image/vert_foncé.png"));
		//ImageIcon image_gris = new ImageIcon(getClass().getResource("/image/gris.png"));

	}
	//creation plateau
		protected void paintComponent(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;
			
			//Les cases 
			int case_dimension = 15;
			boolean isWhite = true; 
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					if(isWhite) {
						g2.setPaint(Color.WHITE);
					} else {
						g2.setPaint(Color.LIGHT_GRAY);
					}
					g2.fill(new Rectangle2D.Double((j+1)*case_dimension, (i+1)*case_dimension, 
							case_dimension, case_dimension));
					isWhite = !isWhite;
					
				}
				
				isWhite = isWhite; 
			}
		//set chateau
		g2.setPaint(Color.PINK);
		g2.fill(new Rectangle2D.Double((4+1)*case_dimension, (4+1)*case_dimension, 
				case_dimension, case_dimension));
			
		//Cadre 
		g2.setPaint(Color.GRAY);
		g2.setStroke(new BasicStroke(2));
		g2.draw(new Rectangle2D.Double(case_dimension, case_dimension, 9*case_dimension, 9*case_dimension));
			
		//Legende
		int c; 
		for(int i=0; i<9; i++) {
			c= i+1+'0'; 
			g2.drawString(""+(char)c, 1.0f / 3*case_dimension, (i+1.5f)*case_dimension+6 );
		}
		for(int j=0; j<9; j++) {
			c= 'A'+j; 
			g2.drawString(" "+(char)c, (j+1.5f)*case_dimension-5, 1.0f/3*case_dimension+6);
		}
			

			g2.dispose();
		}

}