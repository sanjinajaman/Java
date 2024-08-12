class shape{
    int l;
    int h;
    public void printshape(){
   System.out.println("display area:");
   }

   
}
class Triangle extends shape{
    
     public void printtriangle(int l, int h){
        System.out.println((1/2)*l*h);

     }
    }

 class EquilateralTriangle extends Triangle{
   
     public void area(int l, int h){
        System.out.println((1/2)*l*h);

     }


   }

    



public class multi_level_inheritance {
    public static void main(String[] args){

        EquilateralTriangle t1=new EquilateralTriangle();
        t1.area(19, 20);
        
        //t1.area(t1.h=20,t1.l=10);
       // t1.printshape();
        

    }  
}
