package TP2_connexion.src;



import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class MaFenetre extends JDialog
{
	private JPanel panelPrinc,panelSec[];
	private JLabel labelLogin,labelPassw;
	private JTextField textLogin,textPassw;
	private JButton boutonAnnuler,boutonOK;
	
	public MaFenetre(String titre)
	{
	      this.setTitle(titre);
	      this.setSize(250,130);
	      this.setResizable(true);
	      this.setLocationRelativeTo(null);
	      this.setLayout(null);
	      
	      this.construireFenetre();
	}
	
	private void construireFenetre()
	{    
		Dimension prefSizeLabel = new Dimension(70,20);
		
		panelSec = new JPanel[3];
		panelSec[0] = construirePanelSecondaire0(prefSizeLabel);
		panelSec[1] = construirePanelSecondaire1(prefSizeLabel);
		panelSec[2] = construirePanelSecondaire2(prefSizeLabel);
		
		panelPrinc = new JPanel();
		panelPrinc.setLayout(new BoxLayout(panelPrinc,BoxLayout.Y_AXIS));
		panelPrinc.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		panelPrinc.add(panelSec[0]);
		panelPrinc.add(panelSec[1]);
		panelPrinc.add(Box.createVerticalStrut(20));
		panelPrinc.add(panelSec[2]);
	
	    this.setContentPane(panelPrinc);
	}
	

	private JPanel construirePanelSecondaire0(Dimension prefSize)
	{    
		JPanel panel;
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
		labelLogin = new JLabel("Login :");
		labelLogin.setPreferredSize(prefSize);
		panel.add(labelLogin);
		textLogin = new JTextField();
		panel.add(textLogin);
		
		return panel;
	}
	
	private JPanel construirePanelSecondaire1(Dimension prefSize)
	{    
		JPanel panel;
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
		labelPassw = new JLabel("Password :");
		labelPassw.setPreferredSize(prefSize);
		panel.add(labelPassw);
		textPassw = new JPasswordField();
		panel.add(textPassw);
		
		return panel;
	}
	
	private JPanel construirePanelSecondaire2(Dimension prefSize)
	{    
		JPanel panel;
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
		panel.add(Box.createHorizontalGlue());
		boutonAnnuler = new JButton("Annuler");
		panel.add(boutonAnnuler);
		panel.add(Box.createRigidArea(new Dimension(10,10)));
		boutonOK = new JButton("OK");
		panel.add(boutonOK);
		
		return panel;
	}
}

	