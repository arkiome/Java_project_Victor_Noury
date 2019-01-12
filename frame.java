package test;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JTextField;
	import java.awt.Container;
	import java.awt.FlowLayout;
	import java.awt.Frame;

	import javax.swing.JButton;
		 
		public class frame extends JFrame {
			
			public static final long serialVersinUID = 1L;
			
			public frame(String title) {
				
				setTitle(title); 
				setSize(1200, 700); 
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setResizable(false);
				setLocationRelativeTo(null);
				setVisible(true);
				
				add(new panel());
				
				
				
				
				/*JPanel panel = new JPanel();
				panel.setLayout(new FlowLayout());
				
				JButton bouton = new JButton("Cliquez ici !");
				panel.add(bouton);
		 
				JButton bouton2 = new JButton("Ou là !");
				panel.add(bouton2);*/
			}
			

			


	}


