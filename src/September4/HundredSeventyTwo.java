package September4;

import java.util.Scanner;

public class HundredSeventyTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}
        };
        int num = matrix[0][0]+matrix[1][1]+matrix[2][2];
        int num2 = matrix[0][2]+matrix[1][1]+matrix[2][0];
       int result = num-num2;
        System.out.println(Math.abs(result));
    }
}
