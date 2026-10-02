package Methods;

class Mobile
{
    static //static block
    {
        String category = "Phone";
        System.out.println(category);
    }
    static String name;     //static variable
    int price;
    String brand;

    public void show() 
    {
        System.out.println(name+" : "+ brand+" : "+price);
    }

    public static void show1(Mobile obj)    //static method
    {
        System.out.println(name + " : "+ obj.brand + " : " + obj.price);
    }
}

public class staticblock {
    public static void main(String[] args) throws ClassNotFoundException
    {

        Class.forName("Methods.Mobile");
        
        Mobile.name = "Smartphone";

        Mobile obj1 = new Mobile();
        obj1.price = 15000;
        obj1.brand = "Samsung";
        
        Mobile obj2 = new Mobile();
        obj2.price = 25000;
        obj2.brand = "Realme";

        
        Mobile.show1(obj1);

    }
    
}