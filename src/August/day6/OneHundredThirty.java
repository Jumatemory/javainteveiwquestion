package August.day6;

import java.util.Arrays;
import java.util.Scanner;

public class OneHundredThirty {
    public static void main(String[] args) {
        /*
        Modify an array that is "left shifted" by one --
         so {6, 2, 5, 3} becomes {2, 5, 3, 6}. You may modify and print the given array,
         or print a new array.
Example:
input: 6, 2, 5, 3
output: [2, 5, 3, 6]
         */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < nums.length; i++){
            nums[i] = scan.nextInt();
        }
        int temp = nums[0];

        int [] arr1 = new int [nums.length-1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i]= nums[i+1];


        }

        int arr2 [] = new int[arr1.length+1];
        for (int i = 0; i < arr2.length-1; i++) {

                arr2[i] = arr1[i];

        }
        arr2[arr2.length-1]= temp;
        System.out.println(Arrays.toString(arr2));


//        int [] numbers = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//
//           numbers[i] = nums[i];
//            System.out.println(nums[i]);
//        }
//
//
//
//        numbers[numbers.length-1]= numbers[0];
//        System.out.println("numbers = " + numbers[numbers.length-1]);
//        int number2 [] = new int [numbers.length];
//
//        for (int i = 0; i <number2.length; i++) {
//           number2[i] = numbers[i];
//        }
//        System.out.println(Arrays.toString(number2));

    }
}
