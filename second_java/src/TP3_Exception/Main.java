package TP3_Exception;

import tp_exception.MonExceptionGolb;

public class Main {

	public static void main(String[] args) throws MonExceptions, MonExceptionGolb {
		
		String[] notes = new String[] {"12","tata","33","1","22"};
		String[] nts = new String[] {};
		
		try {
			
			double somme = Notes.moyenne(nts); 
			System.out.println("la somme est : " + somme);
			
		}catch(MonExceptionGolb e) {
			System.out.println(e);
		}
	}
	
	

}
