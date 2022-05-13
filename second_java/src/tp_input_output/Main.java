package tp_input_output;

import java.util.List;

import tp_exception.MonExceptionGolb;

public class Main {
	public static void main(String[] args) {
		try {
			//int val = Saisie.saisie();
			List<Integer> lst = Saisie.saisieListe();
			double moyenne = Saisie.moyenne(lst);
			System.out.println("Moyenne : "+moyenne);
		}catch(MonExceptionGolb e) {
			System.out.println(e);
		}
	}
}