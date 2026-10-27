package Maps;

import java.util.HashMap;
import java.util.Map;

public class maps1 {
    public static void main(String[] args) {
        
        Map<String, Integer> students = new HashMap<>();

        students.put("Richeek", 45);
        students.put("Caleb", 56);
        students.put("Jojo", 85);
        students.put("Himk", 78);

        System.out.println(students);
        System.out.println(students.get("Jojo"));

        System.out.println(students.keySet());

        for(String key: students.keySet())
        {
            System.out.println(key + " : " + students.get(key));
        }
    }
}
