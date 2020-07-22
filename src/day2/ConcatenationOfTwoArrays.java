package day2;

import java.util.Arrays;

public class ConcatenationOfTwoArrays {
    public static void main(String[] args) {
        int number1 [] = {2,8,9, 190, 0};
        int number2[] = {120,8,9,9,19};
       int [] allNumber =  concatTwoArrays(number1, number2);
        System.out.println(Arrays.toString(allNumber));

    }




    public static int[] concatTwoArrays(int[] arr1, int[]arr2){
        int [] result = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each: arr1){
            result[i] = each;
            i++;
        }
        for (int each: arr2){
            result[i]= each;
            i++;
        }
        return result;
    }
}
