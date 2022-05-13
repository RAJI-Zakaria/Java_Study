package history_financial;

public class main {


	public static void main(String[] args) {
		HistoriqueFinancier histo = new HistoriqueFinancier (0);
		histo.recevoirPour (8000, "paie");
		histo.transfertDeVers (2000, "paie" , "logement");
		histo.depenserPour(700, "logement");
		histo.depenserPour(1200, "nourriture");
		histo.recevoirPour (350, "interets" );
		histo.depenserPour(750, "logement");
		histo.depenserPour(450, "divers");
		histo.solde (); /* => 5250 */
		histo.totalRecuPour ("logement"); /* => 2000 */
		histo.totalDepensePour ("logement"); /* => 1450 */
		histo.solde("logement"); /* => 550 */
		
		

		PosteBudgetaire PosteBudgetaire_paie1 = new PosteBudgetaire("paie");
		PosteBudgetaire PosteBudgetaire_paie2 = new PosteBudgetaire("paie");
		PosteBudgetaire PosteBudgetaire_logement = new PosteBudgetaire("logement");
		PosteBudgetaire PosteBudgetaire_nourriture = new PosteBudgetaire("nourriture");
		PosteBudgetaire PosteBudgetaire_divers = new PosteBudgetaire("divers"); 
		
		
		PosteBudgetaire_paie.depot(2000);
		PosteBudgetaire_paie.retrait(300);
		PosteBudgetaire_paie.transfererVers(1600, PosteBudgetaire_paie);
		
		
		
	}

}
