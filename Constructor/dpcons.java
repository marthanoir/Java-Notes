package Constructor;

class Human
{
    private String name;
    private int age;
    private int bodycount;

    public Human()
    {
        age = 12;
        name = "John";
    }

    public Human(int age, String name )
    {
        this.age = age;
        this.name = name;
    }

    public void setbodycount(int bodycount)
    {
        this.bodycount= bodycount;
    }

    public void setname(String name)
    {
        this.name=name;
    }

    public void setage(int age)
    {
        this.age = age;
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
}
public class dpcons {
    public static void main(String[] args) {
        // Human hum = new Human();
        // System.out.println(hum.getname()+ " : "+ hum.getAge()+" -> "+hum.getbodycount());
        
        // hum.setname("Richeek Mitra Mazumdar");
        // hum.setbodycount(2);
        // hum.setage(21);

        Human hum1 = new Human(12,"Richeek");
        System.out.println(hum1.getname() +": "+hum1.getAge());

        // System.out.println(hum.getname()+ " : "+ hum.getAge()+" -> "+hum.getbodycount());   
    }
}