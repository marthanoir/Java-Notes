package Maps;

import java.util.List;
// import java.util.function.Consumer;
import java.util.Arrays;
public class steamapi2 {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(4,5,6,7,8,9);

        // Consumer<Integer> con = new Consumer<Integer>() {
            
        //     public void accept(Integer n)
        //     {
        //         System.out.println(n);
        //     }
        // };

        // nums.forEach(con);

        nums.forEach(n -> System.out.println(n));
    }
}

