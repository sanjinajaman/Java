
   
    class Student{
         String name;
    int id;
     

     public void s_info(){
        System.out.println(this.name);
        System.out.println(this.id);
     }
     //non peramiterized constructor

    //  Student(){
    //     System.out.println("constructor");
    //  }
     //peramiterized constructor
    //   Student(String name,int id){
    //     this.name=name;
    //     this.id=id;

    //  }

     //copy constructor
      Student(Student s3){

       this.name=s3.name;
         this.id=s3.id;
       }

       Student(){
        
       }
     
    }


  public class constructor {
    public static void main(String[] args){


        //Student s1 = new Student(); //called constructor

       // Student s2 = new Student("Tanjina",104357865); //called constructor with peramiterized
       Student s2 = new Student(); //called constructor with peramiterized
       s2.name="sanjina";
       s2.id=1935202505;


        Student s3=new Student(s2);
        //s2.s_info();

        s3.s_info();


               
        
        


    }
    
}
