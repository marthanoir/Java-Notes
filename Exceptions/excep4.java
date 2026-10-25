package Exceptions;

import java.util.Scanner;

public class excep4 {
    public static void main(String[] args) throws NumberFormatException{
        
        // int i = 0;
        // int j = 0;

        try 
        {
            System.out.println("Enter the number: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println(num);
        }

        finally         //finally block is primarily used to close resources.
        {
            System.out.println("final block ran successfully");
        }
    }
}
