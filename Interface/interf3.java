package Interface;

interface A
{
    int age = 21;        //variables are final and static
    String city = "Kolkata";

    void show();
    void config();
}
interface B
{
    void run();
}

class C implements A,B
{
    public void show()
    {
        System.out.println("in show...");
    }

    public void config()
    {
        System.out.println("in config...");
    }

    public void run()
    {
        System.out.println("running...");
    }
}
public class interf3 {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.config();
        obj.run();
    }
    
}
