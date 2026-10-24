package enumeration;

enum Status         //class
{
    Running, Failed, Pending, Success;  //objects, constants
}

public class enumer1 {
    public static void main(String[] args) {
        Status[] ss = Status.values();

        for (Status s : ss)
        {
            System.out.println(s + " : "+ s.ordinal());
        }
    }
}
