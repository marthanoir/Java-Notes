package Methods;

class Calc
{
    public void add(int a, int b){
        int r1 = a + b;
        System.out.println(r1);
    }
}

class AdvCalc extends Calc
{
    public void add(int a, int b)
    {
        int r2 = a + b + 1;
        System.out.println(r2);
    }
}
public class overriding 
{
    public static void main(String[] args) {
        AdvCalc calculator = new AdvCalc();
        calculator.add(3,5);
    }
}
