interface Animal{
    public void walk(); //define
    void eat();

}
interface Harbivore{

}

class Horse implements Animal{
    public void walk(){
        System.out.println("Walks on 4 leg");

    }
}

class Chicken implements Animal,Harbivore{ //multiple inheritance

}

public class interfaces_oop {

    public static void main(String[] args){
        Horse horse=new Horse();
        horse.walk();


    }
    
}
