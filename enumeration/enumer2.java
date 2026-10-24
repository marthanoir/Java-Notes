package enumeration;

enum Status         //class
{
    Running, Failed, Pending, Success;  //objects, constants
}

public class enumer2 {
    public static void main(String[] args) {
        Status s = Status.Pending;

        switch(s)
        {
            case Running: System.out.println("Run.."); break;
            case Failed: System.out.println("Fail.."); break;
            case Pending: System.out.println("Pending.."); break;
            default : System.out.println("Succeeded.."); break;
        }

        if (s == Status.Pending)
        {
            System.out.println("Good!");
            
        }
        else if (s == Status.Failed)
        {
            System.out.println("Failed");
            
        }
        else if (s == Status.Running)
        {
            System.out.println("Running..");
            
        }
        else
        {
            System.out.println("Successful..");
        }

    }
}

