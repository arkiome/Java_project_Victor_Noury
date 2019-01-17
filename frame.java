package graphique;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JButton;
	 
	public class frame extends JFrame {
		
		public frame(String window) {
			
			setTitle(window); 
			setSize(1200, 700); 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setResizable(false);
			setLocationRelativeTo(null);
			setVisible(true);
			
			add(new panel());
			
		}
	
}
