package day6;

import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
//        int [] numbers = {2,4,6,8,10,29};
//        for (int i = 0; i <numbers.length/2; i++) {
//            int temp = numbers[i];
//            numbers[i]= numbers[numbers.length-i-1];
//            numbers[numbers.length-i-1 ]= temp;
//
//        }
//        System.out.println(Arrays.toString(numbers));
        int [] numbers = {29,2,4,6,8, 8,10,29};
        for (int i = 0; i < numbers.length; i++) {
            int counter=0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i]==numbers[j]){
                    counter++;
                }
            }
            if (counter==1){
                System.out.println(numbers[i]);
            }
        }

    }


}
