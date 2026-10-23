package finalkeyword;


final class Calc
{
    public final void show()
    {
        final int val = 60;
        System.out.println("By Richeek.");
        System.out.println(val);
    }

    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}

class AdvCalc
{
    public void show()
    {
        System.out.println("By John.");
    }
}
public class fin {
    public static void main(String[] args) {
        Calc cal = new Calc();
        cal.show();
        cal.add(3,4);
    }
}
