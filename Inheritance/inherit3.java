

class SciCalculator extends AdvCalculator
{
    public double power(int a, int b)
    {
        return Math.pow(a, b);
    }
}
public class inherit3 {
    public static void main(String[] args) {
        SciCalculator sc = new SciCalculator();
        
        System.out.println(sc.power(3,4)+" : "+sc.div(36,4)+" : "+sc.sub(45,16));
    }
}
