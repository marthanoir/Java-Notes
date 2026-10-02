package SwitchCase;

public class switch2 {
    public static void main (String args[]){

        String n = "Sunday";
        String result = "";

        // switch(n){
        //     case "Sunday", "Saturday" -> System.out.println("6am") ;
        //     case "Monday" -> System.out.println("7am");
        //     default -> System.out.println("8am");

        result = switch(n)
        {
            case "Sunday", "Saturday" -> "6am";
            case "Monday" -> "7am";
            default -> "8am";
        };
        System.out.println(result);
    }
     
}
