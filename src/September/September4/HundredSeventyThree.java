package September.September4;

import java.util.Arrays;
import java.util.Scanner;

public class HundredSeventyThree {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++){
            for(int j=0 ;j<=cols-1;j++){
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows
        int max =arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j]>arr[0][0]){
                    max = arr[i][j];

                }

            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j]= max;
            }
        }


        //TODO write your code below




        //FINAL PRINT
        System.out.println(Arrays.deepToString(arr));
    }
}
