package CollectionAPI;


// import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class collect2 {
    public static void main(String[] args) {

        // Set<Integer> nums = new HashSet<Integer>();
        Set<Integer> nums = new TreeSet<Integer>();     //TreeSet gives Sorted Set.
        nums.add(52);
        nums.add(63);
        nums.add(85);
        nums.add(27);

        for (int n : nums)
        {
            System.out.println(n);
        }
    }
    
}
