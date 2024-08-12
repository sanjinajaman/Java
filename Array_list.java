import java.util.Arrays;

public class Array_list {

    public static void main (String[] args){
        int age = 30;
        int physics = 97;
        int chem = 98;
        int eng = 95;

        // int[] marks = new int [3];
        // marks[0]=97;
        // marks[1]= 98;
        // marks[2]= 95;
        // System.out.println(marks);

        // System.out.println(marks[0]);

        //array length
        // System.out.println(marks.length);

        //array sort
        // System.out.println(marks[0]);
        // Arrays.sort(marks);
        // System.out.println(marks[0]);


        //array list

        int[] marks_list = {97,98,95};
        int[][] final_marks = {{97,98,95}, {95, 95,98}};

        System.out.println(marks_list[2]);

        System.out.println(final_marks[0][2]);


    }
    
}
