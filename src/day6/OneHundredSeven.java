package day6;

import java.util.Scanner;

public class OneHundredSeven {
    public static void main(String[] args) {
        String str = "";
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<arr.length; i++)
        {
            arr[i] = input.nextLine();
        }
        for (int i = 0; i < arr.length; i++) {
            str= arr[i];
            System.out.println(str.substring(0,3));

        }


    }
}
