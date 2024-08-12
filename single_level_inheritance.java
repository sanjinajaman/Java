
class shape{
    int l;
    int h;
    public void printshape(){
   System.out.println("display area:");
   }

   
}
class Triangle extends shape{
     public void printtriangle(int l, int h){
        System.out.println(1/2*l*h);

     }

   }
public class single_level_inheritance {
    public static void main(String[] args){

        Triangle t1=new Triangle();
        
        t1.printtriangle(t1.h=20,t1.l=10);
        t1.printshape();
        

    }
    
}
