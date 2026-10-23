package abstractclass;


class A 
{
    public void show()
    {
        System.out.println("in A..");
    }

    class B
    {
        public void show1()
        {
            System.out.println("in B...");
        }
    }
}
public class innerclass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.show1();
    }
}
