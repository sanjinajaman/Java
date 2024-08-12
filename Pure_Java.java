public class Pure_Java {

    public static void main (String[] args){
// primitive 

        //byte 1[-128 to 127]
        //short -2 
        //int-4  1,2,3,4
        //long-8  
        //float -4 6.12
        //double- 8 
        // char-2 a,b,c
        //boolean- 1 true/false
 

        byte age =12;
        int roll= 04;
        long phone = 2045485067676855987L;
        float pi=3.14F;
        char x = '@';
        boolean isAdult = false;


        //Non-Primitive

         String name = "Sanjina";
         System.out.println(name.length());
        // String always immutable
        //Strings
        //concatenate
        String name1 = "Sanjina";
        String name2 = "Jaman";

        String name3 = name1 + " and " + name2;

        System.out.println(name3);

        //charAt
        String name_char_at= "Aman";
        System.out.println(name.charAt(0));


        //replace

        String rep_char=name1.replace('a','b');

        System.err.println(rep_char);


        //substring
        String full_name="Sanjina and Jaman";
        System.out.println(full_name.substring(0,8));



        


    }
    
}
