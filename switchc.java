import java.util.Scanner;

public class switchc {
public static void main(String[] args){
        Scanner case_1 =new Scanner(System.in);
       int button= case_1.nextInt();
       

 switch (button) {
     case 1:System.out.println("pres button 1");    
         break;

     case 2:System.out.println("pres button 2");    
       break;    
     case 3:System.out.println("pres button 3");    
     break;

     default:System.out.println("pres invalid button ");
        break;
         }
    }
    
 }
