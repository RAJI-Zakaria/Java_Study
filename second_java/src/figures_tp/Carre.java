package figures_tp;

public class Carre extends Rectangle{

	public Carre() {
		super();
	}
	
	public Carre(double c) {
		super(c,c);
	}
	
	public double cote(){
		return super.largeur;
		
	}
}
