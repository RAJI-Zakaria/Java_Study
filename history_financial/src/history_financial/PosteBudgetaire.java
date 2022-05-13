package history_financial;

public class PosteBudgetaire {
	private String label;
	private int depense;
	private int recette;

	public PosteBudgetaire(String label) {
		// TODO Auto-generated constructor stub
		this.label = label;
		this.depense=0;
		this.recette=0;
	}
	
	public void depot(int P_budget) {
		this.recette+=P_budget;
	}
	
	public void retrait(int P_budget) {
		this.depense+=P_budget;
	}
	
	public void transfererVers(int P_budget, PosteBudgetaire P_unPosteBudgetaireCible) {
		//subs budget from the current posteBudget
		this.retrait(P_budget);
		//Add budget to the target posteBudget
		P_unPosteBudgetaireCible.depot(P_budget);
	}

	public int getDepense() {
		return this.depense;
	}

	public int getRecette() {
		return this.recette;
	}

	public String getLabel() {
		return this.label;
	}
	
	
	public Boolean equals(PosteBudgetaire poste) {
		return this.label.equals(poste.getLabel());
	}
	

}
