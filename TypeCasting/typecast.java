package TypeCasting;

public class typecast {
    public static void main(String[] args) {
        //byte b = 127;
        int a = 257;
        byte k = (byte) a;

        float f = 5.6f;
        int t = (int) f;
        System.out.println(t);

        byte a1 = 10;
        byte a2 = 20;

        int result = a1 * a2;

        System.out.println(result);
        System.out.println(a);
        System.out.println(k);
    }
}
