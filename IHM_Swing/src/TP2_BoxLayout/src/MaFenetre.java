package TP2_BoxLayout.src;

import javax.swing.*;

@SuppressWarnings("serial")
public class MaFenetre extends JFrame
{
	private JPanel panel;
	private JLabel labelChoix;
	private JRadioButton radioCouleur[];
	private ButtonGroup groupeCouleur;
	private JButton bouton;
	
	public MaFenetre(String titre)
	{
	      this.setTitle(titre);
	      this.setResizable(true);
	      this.setLocationRelativeTo(null);
	      this.setLayout(null);
	      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      this.construireFenetre();
	}
	
	private void construireFenetre()
	{    
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		 
		labelChoix = new JLabel("Choisissez une couleur :");
		radioCouleur = new JRadioButton[4];
		radioCouleur[0] = new JRadioButton("Bleu");
		radioCouleur[1] = new JRadioButton("Vert");
		radioCouleur[2] = new JRadioButton("Jaune");
		radioCouleur[3] = new JRadioButton("Orange");
		bouton = new JButton("Fermer");
		
		groupeCouleur = new ButtonGroup();
		groupeCouleur.add(radioCouleur[0]);
		groupeCouleur.add(radioCouleur[1]);
		groupeCouleur.add(radioCouleur[2]);
		groupeCouleur.add(radioCouleur[3]);
		
		panel.add(labelChoix);
		panel.add(Box.createVerticalGlue());
		panel.add(radioCouleur[0]);
		panel.add(Box.createVerticalGlue());
		panel.add(radioCouleur[1]);
		panel.add(Box.createVerticalGlue());
		panel.add(radioCouleur[2]);
		panel.add(Box.createVerticalGlue());
		panel.add(radioCouleur[3]);
		panel.add(Box.createVerticalGlue());
		panel.add(bouton);
		
	    this.setContentPane(panel);
	}
	
	
	
}

	