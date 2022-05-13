package TP3_Exception;
import tp_exception.MonExceptionGolb ;

public class Notes {
	//int[] i = new int[] {12,14,3,16,11,20,18};
	

	public static double moyenne(String[] valeurs) throws MonExceptions, MonExceptionGolb{
		if(valeurs.length==0) {
			throw new MonExceptionGolb();
		}
		double res = 0;
			
			int lgt = valeurs.length;
			for(int i=0;i<valeurs.length;i++) {
				try {
					res = res + Double.parseDouble(valeurs[i]);
				}catch(Exception e ) {
					System.out.println("error from '" + valeurs[i] +"' is not a double");
					
				}
			}
			res = res/lgt;
		
		return res;
	}
	
	 
}
