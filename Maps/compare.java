package Maps;


import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class Student
{
    String name;
    int age;

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    
}
public class compare {
    public static void main(String[] args) {
        
        Comparator<Student> com = new Comparator<Student>()
        {
            public int compare(Student i, Student j)
            {
                if (i.age>j.age)
                    return 1;
                else
                    return -1;
            }
        };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student("Richeek", 21));
        studs.add(new Student("Caleb", 19));
        studs.add(new Student("Jojo", 21));
        studs.add(new Student("Himk", 21));

        Collections.sort(studs, com);
        for (Student s: studs)
        {
            System.out.println(s);
        }
    }
    
}
