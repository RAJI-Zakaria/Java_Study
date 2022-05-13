package history_financial;

import java.util.HashMap;

public class HistoriqueFinancier {
	//we can use Double instead of int, for the moment i'll use int
	private Integer solde;
	private HashMap<String, Integer> dicoDepenses;
	private HashMap<String, Integer> dicoRecettes;
	
	public HistoriqueFinancier() {
		this.dicoDepenses = new HashMap<String, Integer>();
		this.dicoRecettes = new HashMap<String, Integer>();
		this.solde=0;
	}

	
	public HistoriqueFinancier(Integer solde) {
		//calling the default constructor
		this();
		//setting the solde value
		this.solde = solde;
	}

	public void recevoirPour(int P_budget, String P_posteBudgetaire) {
		int budget=0;
		//checking if the key(posteBudget has been already inserted) 
		//==>add current budget to the received budget
		if(dicoRecettes.containsKey(P_posteBudgetaire)) {
			budget += dicoRecettes.get(P_posteBudgetaire);
		}
		budget += P_budget;
		//saving the budget
		dicoRecettes.put(P_posteBudgetaire, budget);
		
		//adding to solde
		solde += P_budget;
	}

	public void depenserPour(int P_budget, String P_posteBudgetaire) {
		int budget=0;
		//substract the received budget  from the current budget
		if(dicoDepenses.containsKey(P_posteBudgetaire)) {
			budget += dicoDepenses.get(P_posteBudgetaire);
		}
		budget += P_budget;
		//saving the budget
		dicoDepenses.put(P_posteBudgetaire, budget);
		

		//subs from solde
		solde -= P_budget;
	}
	
	public void transfertDeVers(int P_budget, String P_posteBudgetaireSource, String P_posteBudgetaireCible ) {
		depenserPour(P_budget, P_posteBudgetaireSource);
		recevoirPour(P_budget, P_posteBudgetaireCible);
	}
	
	public void solde() {
		System.out.println("Solde : " + solde); 
	}
	


	public void totalRecuPour(String P_posteBudgetaire) {
//		int totalRecu = 0;   
//
//		for (float f : dicoRecettes.values()) {
//			totalRecu += f;
//		}
		
		System.out.println("totalRecuPour : " + dicoRecettes.get(P_posteBudgetaire));
	}
	
	public void totalDepensePour(String P_posteBudgetaire) {
		System.out.println("totalDepensePour : " + dicoDepenses.get(P_posteBudgetaire));
	}
	
	
	public void solde(String P_posteBudgetaire) {
		//substract the depenses from recettes
		int L_solde = dicoRecettes.get(P_posteBudgetaire) - dicoDepenses.get(P_posteBudgetaire);
		System.out.println("Solde : " + L_solde); 
	}

	
	
	

}
