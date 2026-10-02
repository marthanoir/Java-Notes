package Methods;


class Computer
{
    public void playmusic()
    {
        System.out.println("Music Playing...");
    }

    public String buypen(int cost)
    {
        if (cost >=10)
        {
            return "Pen bought";
        }
        else{
            return "Can't buy pen";
        }
    }
}
public class method1 {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.playmusic();
        String str = comp.buypen(12);
        System.out.println(str);
    }
    
}
