import javax.swing.*;

import java.awt.*;

@SuppressWarnings("serial")
public class MaFenetre extends JFrame
{
	private JPanel panelPrinc,panelSec;
	private JList<String> listCoul;
	private JButton boutonAjouter,boutonChoisir,boutonSupprimer;
	
	public MaFenetre(String titre)
	{
	      this.setTitle(titre);
	      this.setSize(250,240);
	      this.setResizable(true);
	      this.setLocationRelativeTo(null);
	      this.setLayout(null);
	      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      this.construireFenetre();
	}
	
	private void construireFenetre()
	{    
		panelSec = construirePanelSecondaire();
		
		panelPrinc = new JPanel();
		panelPrinc.setLayout(new GridLayout(1,2,30,0));
		String[] couleurs = {"Noir","Bleu","Cyan","Gris foncé","Gris","Vert","Gris clair","Magenta",""
				+ "Orange","Rose","Rouge","Blanc","Jaune"};
		listCoul = new JList<String>(couleurs);
		panelPrinc.add(listCoul);
		panelPrinc.add(panelSec);
		
	    this.setContentPane(panelPrinc);
	}
	
	private JPanel construirePanelSecondaire()
	{    
		JPanel panel;
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		
		panel.add(Box.createVerticalGlue());
		boutonAjouter = new JButton("Ajouter");
		panel.add(boutonAjouter);
		panel.add(Box.createVerticalStrut(30));
		boutonChoisir = new JButton("Choisir");
		panel.add(boutonChoisir);
		panel.add(Box.createVerticalStrut(30));
		boutonSupprimer = new JButton("Supprimer");
		panel.add(boutonSupprimer);
		panel.add(Box.createVerticalGlue());
		
		return panel;
	}
}

	