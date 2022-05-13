package tp_input_output;


public class MonExceptionGolb extends Exception
{	
	public MonExceptionGolb()
	{
        System.out.println("Aucun argument");
    }

    public String toString(){
          return "MonException : le nombre d'arguments est nul";
    }
}