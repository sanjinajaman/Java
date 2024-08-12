class Student{
    String name;
    static String school; 
}

public class static_topic {
    public static void main(String  args []){
     Student.school="Dhaka Central girl's High School";
     Student s1=new Student();
     s1.name="sanjina";
     System.out.println(Student.school);
    }
}
