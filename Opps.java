class Pen{
    String color;
    String type;
    

    public void write(){
        System.out.println("writing something ");
    }
    public void printpenproperty(){
        // System.out.println("Pen color :"+this.color);
        // System.out.println("Pen type :"+this.type);

        System.out.println("Pen color :"+color);
        System.out.println("Pen type :"+type);

    }

}

public class Opps {

    public static void main(String[] args){

        Pen pen1=new Pen();
        pen1.color="black";
        pen1.type="gel";
        

       
        Pen pen2=new Pen();
        pen2.color="green";
        pen2.type="bolpoint";

        pen1.printpenproperty();
        pen2.printpenproperty();
        



    }
    
}
