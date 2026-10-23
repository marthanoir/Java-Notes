package tostringkeyword;

class Laptop
{
    int price;
    String name;

    public String toString()
    {
        return name + " : " + price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (price != other.price)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}
public class tstring {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.price = 10000;
        obj1.name = "Macbook M1";

        Laptop obj2 = new Laptop();
        obj2.name = "Macbook M1";
        obj2.price = 10000;

        System.out.println(obj1);
    }
}
