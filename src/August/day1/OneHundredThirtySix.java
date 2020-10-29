package August.day1;

import java.util.Scanner;

public class OneHundredThirtySix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
      boolean value = false;
        for (int i = 0; i < nums.length-1; i++) {
            if( (nums[i] == 5) &&(nums[++i]==5)){
               value = true;
            }


        }
        System.out.println(value);
    }
}
