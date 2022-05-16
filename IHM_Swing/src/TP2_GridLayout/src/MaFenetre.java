package TP2_GridLayout.src;



import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class MaFenetre extends JFrame
{
	private JPanel panel;
	private JButton bouton[];
	final int nbBouton = 6;
	
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
		panel.setLayout(new GridLayout(2,3,10,30));
		 
		bouton = new JButton[nbBouton];
		
	    for (int i = 0;i < nbBouton;i++)
	    {
	    	bouton[i] = new JButton("Bouton "+(i+1));
		    panel.add(bouton[i]);
	    }
        
	    this.setContentPane(panel);
	}	
}

	