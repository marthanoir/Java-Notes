

class Calculator
{
    public int add(int a, int b)
    {
        return a + b;
    }
    public int sub(int a, int b)
    {
        return a - b;
    }
}

public class inherit1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5,6)+" : "+calc.sub(8,2));
    }
}
