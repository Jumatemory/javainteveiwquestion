package day2;

import java.util.Arrays;

public class ZeroMovementToEnd {
    public static void main(String[] args) {
        int arr[] = {1,0,0,0,8,9,50,2};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                arr[count++] = arr[i];
            }
        }
        while (count<arr.length){
            arr[count++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
