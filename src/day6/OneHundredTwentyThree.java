package day6;

import java.util.Arrays;
import java.util.Scanner;

public class OneHundredTwentyThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {10,20,40,60,66,00,33};
        for (int i = 0; i < nums.length/2; i++) {
            int temp = nums[i];
            nums [i] = nums[nums.length-i-1];
            nums[nums.length-i-1] = temp;



        }


        //Do not change below statement:
        System.out.println(Arrays.toString(nums));

    }
}
