
//compile time polymorphism
 class Student{
    String name;
    int id;
    public void s_tinfo(String name){
        System.out.println(name);

    }
    public void s_info(int id){

        System.out.println(id);
    }


    public void s_info(String name , int id){
        System.out.println(name+ " "+ id);

    }
    
    
}
//same function k different purpose e use kora k polymorphism bole
public class polymorphism_oop {
   public static void main(String[] args ){
        Student s1=new Student();
        s1.name="sanjina";
        s1.id=1935202505;

       s1.s_info( s1.id);


    }


    
}
