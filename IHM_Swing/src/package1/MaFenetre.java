package package1;

import javax.swing.*;
import java.awt.*;;

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
		panel.setLayout(new FlowLayout());
		 
		bouton = new JButton[nb];
		
	    for (int i = 0;i < nb;i++)
	    {
	    	bouton[i] = new JButton("Bouton "+(i+1));
		    panel.add(bouton[i]);
	    }
        
	    this.setContentPane(panel);
	}
	
}

	