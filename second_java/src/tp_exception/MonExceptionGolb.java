package tp_exception;

public class MonExceptionGolb extends Exception
{	
	public MonExceptionGolb()
	{
        super();
    }

    public String toString(){
          return "MonException : le nombre d'arguments est nul";
    }
}