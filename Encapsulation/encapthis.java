package Encapsulation;

class Human
{
    private String name;
    private int age;
    private int count;

    public void setcount(int count)
    {
        this.count= count;
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

    public int getcount()
    {
        return count;
    }
}
public class encapthis {
    public static void main(String[] args) {
        Human hum = new Human();

        hum.setname("Richeek Mitra Mazumdar");
        hum.setcount(2);
        hum.setage(21);

        System.out.println(hum.getname()+ " : "+ hum.getAge()+" -> "+hum.getcount());   
    }
}