package tp1;

public class Main {
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	
		
		
		Produit p1 = new Produit();

		p1.setCouleur(Produit.COLOR.RED); 
		p1.setMasse(200);
		
		

		Produit p2 = new Produit(Produit.COLOR.YELLOW, 120);
		

		System.out.println(p1);
		System.out.println(p2 );
	}

}
