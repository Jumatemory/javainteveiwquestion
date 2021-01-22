package November;

import java.util.Arrays;
import java.util.Date;


public class CopyArrayElements {
    Date date;
    java.sql.Date sqlDate;
    public static void main(String[] args) {
        int number [] = { 1,2,3,4,5};
        int number2 []= new int [number.length];

        for (int i = 0; i < number2.length; i++) {
            number2[i] = number[i];
        }
        System.out.println(Arrays.toString(number2));
        System.out.println("original array");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
        System.out.println("Copied array");
        System.out.println();

        for (int i = 0; i < number2.length; i++) {
       System.out.println();
        }
    }
}
