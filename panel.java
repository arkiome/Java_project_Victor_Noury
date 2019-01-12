package test;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class panel extends JPanel{
	
	//Initialiser les composants 
	public static int nombre = 0;
	//public static  String[] nom_1;
	JButton nombre_joueurs = new JButton("Nombre de joueurs");

	JButton joueur_1 = new JButton("Joueur 1"); 
	JLabel pseudo_1 = new JLabel("Nom joueur : ");
	public static JLabel nom_joueur_1 = new JLabel("El Guapo             ");
	
	JButton joueur_2 = new JButton("Joueur 2"); 
	JLabel pseudo_2 = new JLabel("Nom joueur : ");
	public static JLabel nom_joueur_2 = new JLabel("Rico                 ");
		
	JButton joueur_3 = new JButton("Joueur 3");
	JLabel pseudo_3 = new JLabel("Nom joueur : ");
	public static JLabel nom_joueur_3 = new JLabel("Zizou                ");
			
	JButton joueur_4 = new JButton("Joueur 4");
	JLabel pseudo_4 = new JLabel("Nom joueur : ");
	public static JLabel nom_joueur_4 = new JLabel("Monstruoso           ");
	
	JButton jouer = new JButton("jouer à DOMINATION");
	JComboBox<Integer> choix_nombre_joueurs = new JComboBox<Integer>();
	
	public panel() {
	
		//Bouton "jouer" pour ouvrir fenetre jouer
		jouer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jeu fenetre_jeu = new jeu();
				fenetre_jeu.setVisible(true);
			}
			
		});
			
		
		//choix nombre de joueurs 
		choix_nombre_joueurs.addItem(2);
		choix_nombre_joueurs.addItem(3);
		choix_nombre_joueurs.addItem(4);

		//afficher boutons et choix nombre joueurs
		add(nombre_joueurs); 
		add(choix_nombre_joueurs);
		
		//Rendre visible ou invisible selon le choix du nombre de joueurs
		choix_nombre_joueurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombre = (int) choix_nombre_joueurs.getSelectedItem();
				switch (nombre) {
				case 2 : 
				joueur_1.setVisible(true);
				nom_joueur_1.setVisible(true);
				pseudo_1.setVisible(true);
				joueur_2.setVisible(true);
				nom_joueur_2.setVisible(true);
				pseudo_2.setVisible(true);
				joueur_3.setVisible(false);
				nom_joueur_3.setVisible(false);
				pseudo_3.setVisible(false);
				joueur_4.setVisible(false);
				nom_joueur_4.setVisible(false);
				pseudo_4.setVisible(false);
					break;
				case 3 :
				joueur_1.setVisible(true);
				nom_joueur_1.setVisible(true);
				pseudo_1.setVisible(true);
				joueur_2.setVisible(true);
				nom_joueur_2.setVisible(true);
				pseudo_2.setVisible(true);
				joueur_3.setVisible(true);
				nom_joueur_3.setVisible(true);
				pseudo_3.setVisible(true);
				joueur_4.setVisible(false);
				nom_joueur_4.setVisible(false);
				pseudo_4.setVisible(false);
					break;
				case 4 :
					joueur_1.setVisible(true);
					nom_joueur_1.setVisible(true);
					pseudo_1.setVisible(true);
					joueur_2.setVisible(true);
					nom_joueur_2.setVisible(true);
					pseudo_2.setVisible(true);
					joueur_3.setVisible(true);
					nom_joueur_3.setVisible(true);
					pseudo_3.setVisible(true);
					joueur_4.setVisible(true);
					nom_joueur_4.setVisible(true);
					pseudo_4.setVisible(true);
					break;
					default:
						System.out.println("WRONG");
				}
			}
		});
		
		
		//Afficher les boutons et zone de texte 
		add(joueur_1);
		add(pseudo_1);
		add(nom_joueur_1); 
		add(joueur_2);
		add(pseudo_2);
		add(nom_joueur_2); 
		add(joueur_3);
		add(pseudo_3);
		add(nom_joueur_3); 
		add(joueur_4);
		add(pseudo_4);
		add(nom_joueur_4); 
		add(jouer); 
	}



}
