package Threads;

// class A implements Runnable
// {
//     public void run()
//     {
//         for (int i=0;i<10;i++)
//         {
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(2);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable
// {
//     public void run()
//     {
//         for (int i = 0; i<10; i++)
//         {
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(2);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
public class runs 
{
    public static void main(String[] args) {
        Runnable obj1 = () ->
            {
                for (int i=0;i<10;i++)
                {
                    System.out.println("Hi");
                    try {
                        Thread.sleep(2);
                    } 
                    catch (InterruptedException e) 
                    {
                    e.printStackTrace();
                    }
                }   
        };
        Runnable obj2 = () ->
        {
                for (int i=0;i<10;i++)
                {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(2);
                    } 
                    catch (InterruptedException e) 
                    {
                    e.printStackTrace();
                    }
                }   
        };

        // obj1.setPriority(Thread.MAX_PRIORITY);
        // obj1.setPriority(Thread.MIN_PRIORITY);

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
