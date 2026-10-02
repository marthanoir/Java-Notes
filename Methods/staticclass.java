package Methods;

class Mobile
{
    static String name;
    int price;
    String brand;

    public void show()
    {
        System.out.println(name+" : "+brand+" : "+price);
    }
}

public class staticclass {
    public static void main(String[] args) {
        
        Mobile.name = "Smartphone";

        Mobile obj1 = new Mobile();
        obj1.price = 15000;
        obj1.brand = "Samsung";
        
        Mobile obj2 = new Mobile();
        obj2.price = 25000;
        obj2.brand = "Realme";

        obj1.show();
        obj2.show();

    }
    
}
