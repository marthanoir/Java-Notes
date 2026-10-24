package Exceptions;

class RicheekException extends Exception
{
    public RicheekException(String string)
    {
        super(string);
    }
}
public class excep2 {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try 
        {
            j = 18/i;
            if (j==0)
                throw new RicheekException("No division by zero");
        }
        catch(RicheekException e)
        {
            System.out.println("Something went wrong as there is "+ e + " exception.");
        }

        System.out.println(j);
        System.out.println("Done..");
    }
    
}

