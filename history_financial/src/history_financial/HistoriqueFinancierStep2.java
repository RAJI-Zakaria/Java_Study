package history_financial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HistoriqueFinancierStep2 {

	//we can use Double instead of int, for the moment i'll use int
		private Integer solde;
		private HashMap<String, PosteBudgetaire> postesBudgetaires;
		
		public HistoriqueFinancierStep2() {
			postesBudgetaires = new HashMap<String, PosteBudgetaire>();
			this.solde=0;
		}

		
		public HistoriqueFinancierStep2(Integer solde) {
			//calling the default constructor
			this();
			//setting the solde value
			this.solde = solde;
		}
		
		

		public void recevoirPour(int P_budget, String P_posteBudgetaire) {
			int budget=0;
			//checking if posteBudget exists
			//then ==> add current budget to the received budget 
			if(postesBudgetaires.containsKey(P_posteBudgetaire)) {
				budget += postesBudgetaires.get(P_posteBudgetaire).getRecette();
			}else {
				PosteBudgetaire
			}
			budget += P_budget;
			
			PosteBudgetaire pb = new PosteBudgetaire(P_posteBudgetaire);
			int index = postesBudgetaires.get(pb);
			if(index > -1) {
				budget += postesBudgetaires.get(index).getRecette();
			}
			budget += P_budget;
			//saving the budget
			postesBudgetaires.get(index).depot(budget);
			
			//adding to solde
			solde += P_budget;
		}

		public void depenserPour(int P_budget, PosteBudgetaire P_posteBudgetaire) {
			int budget=0;
			//substract the received budget  from the current budget
			int index = postesBudgetaires.indexOf(P_posteBudgetaire);
			if(index > -1) {
				budget += postesBudgetaires.get(index).getDepense();
			}
			budget += P_budget;
			//saving the budget
			postesBudgetaires.get(index).retrait(budget);
			

			//subs from solde
			solde -= P_budget;
		}
		
		public void transfertDeVers(int P_budget, PosteBudgetaire P_posteBudgetaireSource, PosteBudgetaire P_posteBudgetaireCible ) {
			P_posteBudgetaireSource.transfererVers(P_budget, P_posteBudgetaireCible);
		}
		
		public void solde() {
			System.out.println("Solde : " + solde); 
		}
		


		public void totalRecuPour(PosteBudgetaire P_posteBudgetaire) {
//			int totalRecu = 0;   
//
//			for (PosteBudgetaire poste : postesBudgetaires) {
//				if(poste.equals(P_posteBudgetaire)) {
//					totalRecu += P_posteBudgetaire.getRecette();
//				}
//			}
			
			
			
			System.out.println("totalRecuPour : " + P_posteBudgetaire.getRecette());
		}
		
		public void totalDepensePour(PosteBudgetaire P_posteBudgetaire) {
			System.out.println("totalDepensePour : " + dicoDepenses.get(P_posteBudgetaire));
		}
		
		
		public void solde(String P_posteBudgetaire) {
			//substract the depenses from recettes
			int L_solde = dicoRecettes.get(P_posteBudgetaire) - dicoDepenses.get(P_posteBudgetaire);
			System.out.println("Solde : " + L_solde); 
		}

		

}
