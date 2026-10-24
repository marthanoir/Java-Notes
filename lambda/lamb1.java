package lambda;

@FunctionalInterface 
interface A
{
    void show(int i);
}

public class lamb1 {
    public static void main(String[] args) {
        // A obj = () ->
        // {
        //     System.out.println("in show..");
        // };

        A obj = (i) -> System.out.println("in show.." + i);
        ;

        obj.show(5);
    }
}
