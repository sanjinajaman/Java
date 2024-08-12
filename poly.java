// Java program to demonstrate the working of method
// overloading by changing the number of parameters



    
 
public class poly {
     
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
    

 
    public static void main(String[] args)
    {
        poly obj = new poly();
       
          // 1st show function
        obj.s_info(3845875);
         
       
          // 2nd show function
        obj.s_tinfo("Sanjina");
    }
}