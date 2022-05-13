package readWriteBinary;

import readWriteBinary.Produit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FichierBinaire f1, f2;
	
		
		Produit p1 = new Produit();

//		p1.setCouleur(Produit.COLOR.RED); 
//		p1.setMasse(200);
		
		Produit[] p;
		p=new Produit[10];
		for(int i=0;i<10;i++) {
			p[i] = new Produit(i%3 +1);
		}
//  
//		for(int i=0;i<10;i++) {
//			System.out.println(p[i]);
//		}

		
try {
			
			f1 = new FichierBinaire("src/fic.dat");
			f1.ouvertureEcriture();
			
			//ecrtiture

			f1.ecrireObjet(p.length);

			for(int i=0;i<p.length;i++) {
				f1.ecrireObjet(p[i]);
			}
			
			f1.fermetureEcriture();
			
			
		}catch(Exception e ) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}


	try {
		
		f2 = new FichierBinaire("src/fic.dat");
		f2.ouvertureLecture();
		
		//lecture
		int nb_obj = (int)f2.lireObjet();
		System.out.println("Nombre dobbjet est : "+nb_obj);
	
		for(int i=0;i<p.length;i++) {
			Produit pr = (Produit)f2.lireObjet();
			System.out.println("Produit lu : "+pr);
		}
		
		f2.fermetureLecture();
		
		
	}catch(Exception e ) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
		
		
		
 
		
	}

}
