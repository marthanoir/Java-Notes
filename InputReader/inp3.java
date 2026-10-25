package InputReader;

import java.io.IOException;
import java.util.Scanner;

public class inp3 {
    public static void main(String[] args) throws IOException 
    {
        System.out.println("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("The number is "+num);

        sc.close();
    }
}