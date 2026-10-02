package Encapsulation;

class Human
{
    private String name;
    private int age = 21;
    private int bodycount;

    public void setbodycount(int n)
    {
        bodycount= n;
    }

    public void setname(String s)
    {
        name= s;
    }

    public int getAge()
    {
        return age;
    }

    public String getname()
    {
        return name;
    }

    public int getbodycount()
    {
        return bodycount;
    }

    // public void show()
    // {
    //     System.out.println(name + ": "+age+" -> "+bodycount);
    // }
}
public class encap {
    public static void main(String[] args) {
        Human hum = new Human();

        hum.setname("Richeek Mitra Mazumdar");
        hum.setbodycount(2);
        hum.getAge();

        System.out.println(hum.getname()+ " : "+ hum.getAge()+" -> "+hum.getbodycount());

        // hum.show();
    }
}
