package September2;

import java.util.Arrays;
import java.util.Scanner;

public class PrintUniqueArrayValue {
    public static void main(String[] args) {
        String words2 [] = {"java", "code", "python", "code", "rust", "code", "rust"};

//        Scanner scan = new Scanner(System.in);
//
//        int size = scan.nextInt();
//        String [] names = new String[size];
//
//        for (int i = 0; i <size ; i++) {
//            names[i] = scan.nextLine();
//        }
//        String [] words2 = new String [names.length] ;
//        for (int n = 0; n < names.length; n++) {
//            words2[n] = names[n];
//        }
        printUnique(words2);



    }
    public static void printUnique(String [] nums){


        for (int i = 0; i < nums.length; i++) {
            int counter =0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    counter++;
                }
            }
            if (counter==1){
                System.out.println(nums[i]  );


            }

        }
    }
}
