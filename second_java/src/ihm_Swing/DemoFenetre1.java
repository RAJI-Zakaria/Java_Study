package ihm_Swing;
import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class DemoFenetre1 implements WindowConstants {
	public static void main(String[] args) {
		
		
		
		
		
		JFrame maFenetre = new JFrame();  
		
		maFenetre.setSize(240,250);
		maFenetre.setTitle("Profil"); 
		maFenetre.setLocationRelativeTo(null);
		//exit --> mettre fin a son execution
		maFenetre.setDefaultCloseOperation(EXIT_ON_CLOSE);
		maFenetre.setLayout(null);
		maFenetre.setResizable(false);
		
		
		

		//widgets 
				//-----------------________----_>
				//label
				JLabel labeblPseudo = new JLabel("Pseudo : ");
				labeblPseudo.setLocation(10, 10);
				labeblPseudo.setSize(80, 20);
				maFenetre.add(labeblPseudo);


				//widgets 
				//-----------------________----_>
				//input
				JTextField inputPseudo = new JTextField();
				inputPseudo.setLocation(90, 10);
				inputPseudo.setSize(150, 20);
				maFenetre.add(inputPseudo);
		
		 
		
				//labebl for combobox :
				JLabel labelCombo = new JLabel("QualiteExpert : ");
				labelCombo.setLocation(10, 40);
				labelCombo.setSize(120, 30);
				maFenetre.add(labelCombo);
		
		 
		 
  

				
		//adding combo box
		String[] qualities = {"Force", "Patience", "Rapidite", "Ruse"};
		JComboBox<String> comboQualites = new JComboBox<String>(qualities); 
		//comboQualites.setLocation(20, 42);
		//setSize()
		comboQualites.setBounds(130, 42,190,20);
		
		maFenetre.add(comboQualites);
		
        JCheckBox checkBox1 = new JCheckBox("Niveau expert");  

        checkBox1.setBounds(130, 62,190,20);

		maFenetre.add(checkBox1);
		
		maFenetre.setVisible(true);
		
		
		
	}

}
