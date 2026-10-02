

class AdvCalculator extends Calculator
{
    public int multi(int a, int b)
    {
        return a * b;
    }
    public int div(int a, int b)
    {
        return a / b;
    }
}
public class inherit2 {
    public static void main(String[] args) {
        
        AdvCalculator advcalc = new AdvCalculator();
        System.out.println(advcalc.multi(4,6)+" -> "+advcalc.div(20,5));
    }
}
