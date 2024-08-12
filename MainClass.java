
class Pen{

    String color;
    String type; //ballpoint; gel

    public void write(){
        System.out.println("Writing something");
    }

    public void printcolor(){
        System.out.println(this.color);
    }

}


class Student {
    String name;
    int age;


    public void printInfo(){

        System.out.println(this.name);
        System.out.println(this.age);
    }
    // constructor
    // Student(){
    //     System.out.println("Constructor Called");
    // }

    // Student(String name, int age){
    //     this.name=name;
    //     this.age=age;
       
    // }

    Student (Student s2){

        this.name=s2.name;
        this.age=s2.age;

    }
    Student(){
        
    }
}




public class MainClass{
    public static void main(String args[]){

      /*   Pen pen1= new Pen();

        Pen pen2= new Pen();

        pen1.color="blue";
        pen1.type="gel";
        

        pen2.color="black";
        pen2.type="ballpoint";

        pen1.write();
        
        pen1.printcolor();
        pen2.printcolor();*/


        //Student s1 =new Student("Bintu", 23);

        // s1.name="Sanjina";
        // s1.age=24;

        Student s1 =new Student();

        s1.name="Sanjina";
        s1.age=24;

        //s1.printInfo();

        Student s2= new Student(s1);
        s2.printInfo();


    }



}