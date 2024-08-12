import java.util.Scanner;

public class condition {
    public static void main(String[] args) {

        Scanner adult =new Scanner(System.in);
        int age=adult.nextInt();
        if(age>=18){
            System.out.println("Adult");

        }
        
        else{
            System.out.print("Not Adult");
        }
    }
}
