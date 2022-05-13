package readWriteBinary;
import java.io.Serializable;

public class Produit implements Serializable{
	private int type;
	private COLOR couleur;
	private int masse;
	
	static enum COLOR {
		  GREEN,
		  RED,
		  YELLOW
		};
	

		public Produit() {
		}
		

		public Produit(int type) {
			this.type = type;
			
			switch (this.type) {
			case 1 : 
				couleur = couleur.GREEN;
				masse = 200;
				break;
			case 2 : 
				couleur = couleur.RED;
				masse = 140;
				break;
			case 3 : 
				couleur = couleur.YELLOW;
				masse = 41;
				break;
			}
		}
	

	public Produit(COLOR couleur, int masse) {
		this.couleur = couleur;
		this.masse = masse;
	}
	public COLOR getCouleur() {
		return couleur;
	}
	public void setCouleur(COLOR clr) {
		this.couleur = clr;
	}
	public int getMasse() {
		return masse;
	}
	public String getMasseUnite() {
		return masse+"gl;";
	}
	public void setMasse(int masse) {
		this.masse = masse;
	}
	
	
	
	@Override
	public String toString() {
		return "Produit [couleur=" + couleur + ", masse=" + masse + "]";
	}
	
	
	
	
	
	
	
}
