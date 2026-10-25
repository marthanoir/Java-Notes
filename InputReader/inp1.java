package InputReader;

import java.io.IOException;
// import java.io.InputStreamReader;

public class inp1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number: ");
        int num = System.in.read();     //returns ASCII value of a number or an alphabet

        System.out.println(num);
        System.out.println(num - 48);
    }
}
