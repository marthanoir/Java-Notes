package Abstractclass;

// class A
// {
//     public void show()
//     {
//         System.out.println("In A show...");
//     }
// }
// public class anonymousclass {
//     public static void main(String[] args) 
//     {
//         A obj = new A()
//         {
//             public void show()
//             {
//                 System.out.println("In Anonymous Inner Class..");
//             }
//         };
//     obj.show();
//     }
// }


abstract class C
{
    public abstract void show();
}

public class anonymousclass{
    public static void main(String[] args) {
        C obj = new C() 
        {
            public void show(){
                System.out.println("In show...");
            }
        };
        obj.show();
    }

}

