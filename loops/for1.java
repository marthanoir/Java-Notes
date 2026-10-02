package loops;

public class for1 {
    public static void main(String[] args) {
        for (int i=1;i<5;i++)
        {
            System.out.println("DAY"+ i);
            int j = 1;
            for (j=1;j<=7;j++){
                System.out.println("   "+ (j+8) + " - " + (j+9));
            }
        }
    }
    
}
