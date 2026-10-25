package InputReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inp2 {
    public static void main(String[] args) throws IOException 
    {
        System.out.println("Enter a number: ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num = Integer.parseInt(bf.readLine());

        System.out.println("Th number is " + num);

        bf.close();
    }
}
