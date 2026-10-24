package enumeration;

enum Laptop
{
    Macbook(70000), Victus(60000), Thinkpad(40000), Surface;

    
    private Laptop() {
        price = 15000; 
    }

    private int price;

    private Laptop(int price)
    {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class enumer3 {
    public static void main(String[] args) {
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap + " : " + lap.getPrice());

        Laptop[] lap = Laptop.values();

        for (Laptop l : lap)
        {
            System.out.println(l + " : "+ l.getPrice());
        }
    }
}
