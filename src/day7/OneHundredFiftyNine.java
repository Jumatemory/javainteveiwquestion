package day7;

import java.util.Arrays;

public class OneHundredFiftyNine {
    /*
    Write a void method printUniqueNumbers
    that will print unique numbers from an array of ints.

Example:
input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
output:
2
9
34

     */
    public static void main(String[] args) {
        printUnique();
    }
    public static void printUnique(){
        int [] numbers = {1,2,3,3,4,4,5,5,6,6,7,8,9,10,2};
        int [] numbers2 =new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j]==numbers[i]){


                } else {
                    System.out.println(numbers[i]);
                }
            }
        }

    }
}
