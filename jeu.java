package test;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class jeu extends JFrame{

	jeu(){
	//fenetre
	setTitle("Domination");
	setSize(900, 450);
	setResizable(false);
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	setLayout(null);
	
	//numero joueur 
	JLabel numero_joueur_1 = new JLabel("votre numéro joueur est : ");
	numero_joueur_1.setBounds(170, 10, 200, 25);
	numero_joueur_1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 8));
	add(numero_joueur_1);
	JLabel val_numero_joueur_1 = new JLabel("Joueur 1");
	val_numero_joueur_1.setBounds(275, 10, 200, 25);
	val_numero_joueur_1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 10));
	add(val_numero_joueur_1); 
	
	JLabel numero_joueur_2 = new JLabel("votre numéro joueur est : ");
	numero_joueur_2.setBounds(170, 200, 200, 25);
	numero_joueur_2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 8));
	add(numero_joueur_2);
	JLabel val_numero_joueur_2 = new JLabel("Joueur 2");
	val_numero_joueur_2.setBounds(275, 200, 200, 25);
	val_numero_joueur_2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 10));
	add(val_numero_joueur_2); 
	
	JLabel numero_joueur_3 = new JLabel("votre numéro joueur est : ");
	numero_joueur_3.setBounds(710, 10, 200, 25);
	numero_joueur_3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 8));
	add(numero_joueur_3);
	JLabel val_numero_joueur_3 = new JLabel("Joueur 3");
	val_numero_joueur_3.setBounds(825, 10, 200, 25);
	val_numero_joueur_3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 10));
	add(val_numero_joueur_3); 
	
	JLabel numero_joueur_4 = new JLabel("votre numéro joueur est : ");
	numero_joueur_4.setBounds(710, 200, 200, 25);
	numero_joueur_4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 8));
	add(numero_joueur_4);
	JLabel val_numero_joueur_4 = new JLabel("Joueur 4");
	val_numero_joueur_4.setBounds(825, 200, 200, 25);
	val_numero_joueur_4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 10));
	add(val_numero_joueur_4); 
	
	//Pseudo
	
	JLabel name_1 = panel.nom_joueur_1;
	name_1.setBounds(170, 50,200,25);
	name_1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 12));
	add(name_1);
	
	JLabel name_2 = panel.nom_joueur_2;
	name_2.setBounds(170,250,200,25);
	name_2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 12));
	add(name_2);
	
	JLabel name_3  = panel.nom_joueur_3;
	name_3.setBounds(710, 50,200,25);
	name_3.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 12));
	add(name_3);
	
	JLabel name_4 = panel.nom_joueur_4;
	name_4.setBounds(710, 250,200,25);
	name_4.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 12));
	add(name_4);
	
	//placer les dominos 
	JTextField placer_domino_1 = new JTextField();
	placer_domino_1.setBounds(180, 100, 60, 45);
	placer_domino_1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 10));
	add(placer_domino_1);
	JLabel case_placer_domino_1 = new JLabel("Placer le domino");
	case_placer_domino_1.setBounds(170,150,100,15);
	case_placer_domino_1.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 10));
	add(case_placer_domino_1);
	
	JTextField placer_domino_2 = new JTextField();
	placer_domino_2.setBounds(180, 290, 60, 45);
	placer_domino_2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 10));
	add(placer_domino_2);
	JLabel case_placer_domino_2 = new JLabel("Placer le domino");
	case_placer_domino_2.setBounds(170,340,100,15);
	case_placer_domino_2.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 10));
	add(case_placer_domino_2);
	
	JTextField placer_domino_3 = new JTextField();
	placer_domino_3.setBounds(710, 100, 60, 45);
	placer_domino_3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 10));
	add(placer_domino_3);
	JLabel case_placer_domino_3 = new JLabel("Placer le domino");
	case_placer_domino_3.setBounds(710,150,100,15);
	case_placer_domino_3.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 10));
	add(case_placer_domino_3);
	
	JTextField placer_domino_4 = new JTextField();
	placer_domino_4.setBounds(710, 290, 60, 45);
	placer_domino_4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 10));
	add(placer_domino_4);
	JLabel case_placer_domino_4 = new JLabel("Placer le domino");
	case_placer_domino_4.setBounds(710,340,100,15);
	case_placer_domino_4.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 10));
	add(case_placer_domino_4);
	
	
	//pioche 
	JButton pioche_1 = new JButton("1");
	pioche_1.setBounds(275, 100,60,45);
	JButton pioche_2 = new JButton("2");
	pioche_2.setBounds(345, 100,60,45);
	JButton pioche_3 = new JButton("3");
	pioche_3.setBounds(415, 100,60,45);
	JButton pioche_4 = new JButton("4");
	pioche_4.setBounds(275, 150,60,45);
	JButton pioche_5 = new JButton("5");
	pioche_5.setBounds(345, 150,60,45);
	JButton pioche_6 = new JButton("6");
	pioche_6.setBounds(415, 150,60,45);
	JButton pioche_7 = new JButton("7");
	pioche_7.setBounds(485, 100,60,45);
	JButton pioche_8 = new JButton("8");
	pioche_8.setBounds(485, 150,60,45);
	
	//Affichage pioche
	add(pioche_1);
	add(pioche_2);
	add(pioche_3);
	add(pioche_4);
	add(pioche_5);
	add(pioche_6);
	add(pioche_7);
	add(pioche_8);
	
	//Switch Case pioche 
	int nombre_bis_2 = panel.nombre;
	switch (nombre_bis_2) {
	case 2:
		break;
	case 3:
		pioche_7.setVisible(false);
		pioche_8.setVisible(false);
		break;
	case 4:
		break;
	}
	
	
	//map
	plateau map_1 = new plateau(); 
	map_1.setBounds(10,10,150,150); 
	add(map_1);
	plateau map_2 = new plateau();
	map_2.setBounds(10,200,150,150);
	add(map_2);
	plateau map_3 = new plateau(); 
	map_3.setBounds(550,10,150,150); 
	add(map_3);
	plateau map_4 = new plateau();
	map_4.setBounds(550,200,150,150);
	add(map_4);
	
	
	//Switch Case map
	
	

			int nombre_bis = panel.nombre; 
			switch (nombre_bis) {
			case 2 : 
			map_3.setVisible(false); 
			placer_domino_3.setVisible(false);
			case_placer_domino_3.setVisible(false);
			numero_joueur_3.setVisible(false);
			val_numero_joueur_3.setVisible(false);
			map_4.setVisible(false); 
			placer_domino_4.setVisible(false);
			case_placer_domino_4.setVisible(false);
			numero_joueur_4.setVisible(false);
			val_numero_joueur_4.setVisible(false);
				break;
			case 3 :
				map_4.setVisible(false); 
				placer_domino_4.setVisible(false);
				case_placer_domino_4.setVisible(false);
				numero_joueur_4.setVisible(false);
				val_numero_joueur_4.setVisible(false);
				break;
			case 4 :

				break;
				default:
					System.out.println("Veuillez sélectionner un nombre de joueurs");
			}
}

	public static void main(String[]args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				UIManager.put("swing.boldMetal", Boolean.FALSE);
				new jeu().setVisible(true);
			}
		});
		
	}
}
