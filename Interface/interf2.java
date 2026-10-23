package Interface;

interface Computer
{
    void code();
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("In Desktop...");
    }
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("In Laptop...");
    }
}

class Developer
{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}
public class interf2 {
    public static void main(String[] args) {
        Computer desk = new Desktop();
        Computer lap = new Laptop();

        Developer richeek = new Developer();
        richeek.devApp(lap);
        richeek.devApp(desk);
    }
}
