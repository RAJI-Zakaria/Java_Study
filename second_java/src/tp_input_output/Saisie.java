package tp_input_output;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import TP3_Exception.MonExceptions;
import tp_exception.MonExceptionGolb;

public class Saisie {
	static int saisie() throws InputMismatchException{
      return saisieCorrecte();
	}
	 public static int saisieCorrecte() {
		 while(true) {
			 try {
	    		   int a=0;
	           	Scanner scanner = new Scanner( System.in );
	           	
	           	System.out.println( "Veuillez saisir un premier entier : " );
	                a = scanner.nextInt();
	                
	                //return and quite the while loop
	                return a;
	           	
	           }catch(InputMismatchException e) {
	           	System.err.println("Ce n'est pas un entier.");
	           } 
		 }
	 }
	 
	 public static List<Integer> saisieListe() 
	 {
		 List<Integer> lst = new ArrayList<Integer>();
		 int val;
		 while(true) { 
				val = saisieCorrecte();
				 System.out.print(lst);
				if(val==-1)
				{
					return lst; 
				}
				
				lst.add(val);
		 }
		 
	 }
	 public static double moyenne(List<Integer> lst) throws MonExceptionGolb{
			if(lst.size()==0) {
				throw new MonExceptionGolb();
			}
			double res = 0;
				
				int lgt = lst.size();
				for(int i=0;i<lgt;i++) { 
						res = res +  lst.get(i); 
				}
				res = res/lgt;
			
			return res;
		}
	
	 
	
}


 


