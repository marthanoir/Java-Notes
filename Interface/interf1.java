package Interface;

interface A
{
    int age = 21;        //variables are final and static
    String city = "Kolkata";

    void show();
    void config();
}

class B implements A
{
    public void show()
    {
        System.out.println("in show...");
    }

    public void config()
    {
        System.out.println("in config...");
    }
}
public class interf1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.age);
        System.out.println(A.city);
    }
}
