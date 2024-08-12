class Animal{
    int l;
    int h;  
void eat(){
    System.out.println(l+h);
    System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class BabyDog extends Dog{  
void weep(){
     System.out.println(l+h);
    System.out.println("weeping...");
}  
}  
 

public class multi_level1 {
    public static void main(String args[]){  
        BabyDog d=new BabyDog();
          
        d.weep();  
        d.bark();  
        d.eat();  
}  
    
}
