package abstractclass;


abstract class Car 
{
    abstract public void drive();
    abstract public void fly();
    public void playmusic()
    {
        System.out.println("Playing Music...");
    }
}

abstract class WagonR extends Car
{
    public void drive()
    {
        System.out.println("Driving...");
    }
} 

class UpdatedWagonR extends WagonR
{
    public void fly()
    {
        System.out.println("Flying...");
    }
}
public class abs {
    public static void main(String[] args) {
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playmusic();
        obj.fly();
    }
}
