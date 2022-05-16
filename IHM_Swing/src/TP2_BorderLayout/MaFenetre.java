package TP2_BorderLayout;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class MaFenetre extends JFrame
{
	private JPanel panel;
	private JButton bouton[];
	
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
		int nb = 5;
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		 
		bouton = new JButton[nb];
		
		for (int i=0;i<nb;i++)
		{
			bouton[i] = new JButton("Bouton "+(i+1));
		}
	    
		panel.add(bouton[0],BorderLayout.NORTH);
		panel.add(bouton[1],BorderLayout.SOUTH);
		panel.add(bouton[2],BorderLayout.WEST);
		panel.add(bouton[3],BorderLayout.EAST);
		panel.add(bouton[4],BorderLayout.CENTER);
		
	    this.setContentPane(panel);
	}
	
}

	