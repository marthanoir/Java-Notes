package Exceptions;

public class excep1 {
    public static void main(String[] args) {
        int i = 0;
        int j = 20;

        try 
        {
            j = j/i;
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong as there is "+ e + " exception.");
        }

        System.out.println(j);
        System.out.println("Done..");
    }
    
}
