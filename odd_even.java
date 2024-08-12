import java.util.Scanner;

public class odd_even {

    public static void main(String[] args){
        Scanner odd_even= new Scanner (System.in);
        int number1= odd_even.nextInt();
        int number2=odd_even.nextInt();


       if(number1%number2!=0){
        
        System.out.println("Odd");
       }

       else if(number1==number2){
        System.out.println("These are equal");
       }

       else if(number1%number2==0){
        System.out.println("Even");
        if(number1>number2){
            System.out.println("Number1 is grater than number2");
        }
        else{
                System.out.println("number2 is grater than number1");
            }
       }

      
    }
    
}
