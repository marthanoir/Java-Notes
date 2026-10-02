package Arrays;

class Student
{
    String name;
    int marks;
    int RollNo;
}
public class array4 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.RollNo = 1;
        s1.name = "Richeek";
        s1.marks = 90;

        Student s2 = new Student();
        s2.RollNo = 2;
        s2.name = "Caleb";
        s2.marks = 80;

        Student s3 = new Student();
        s3.RollNo = 3;
        s3.name = "Ratri";
        s3.marks = 85;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;


        // for (int i = 0; i<students.length; i++)
        // {
        //     System.out.println(students[i].name + " : "+ students[i].marks+ " : "+ students[i].RollNo);
        //}

        for (Student stud : students)       //enhanced for loop
        {
            System.out.println(stud.name + " : "+stud.RollNo+" -> " +stud.marks);
        }
    }
    
}