package day7;

import java.util.Arrays;

public class OneHundredFortyThree {
    /*


    Two-dimensional Arrays - 2D array has a type such as int[][] or
    String[][], with two pairs of square brackets. The elements of a 2D array
    are arranged in rows and columns, and the new operator for 2D arrays specifies both
    the number of rows and the number of columns.

You have  2D array multiplicationTable declared with 10 rows and 10 columns.
Write java program to populate the array with multiplication table values like
in the picture below:
     */
    public static void main(String[] args) {
        int [][] multiplicationTable = new int[10][10];

//        for (int i = 0; i < multiplicationTable.length; i++) {
//            for (int j = 0; j < multiplicationTable.length; j++) {
//                multiplicationTable[i][j]= (i+1)*(j+1);
//
//            }
//
//        }
//        System.out.println(Arrays.deepToString(multiplicationTable) ) ;
        int counter = 1;
        for (int i = 1; i <=100; i++) {
            System.out.print(i+" ");
            counter++;
            if (counter==11){
                System.out.println();
                counter=1;
            }


        }
    }
}
