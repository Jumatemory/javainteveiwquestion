package day7;

public class OneHundredFortyFive {
    /*
    Declare and create a two-dimensional array of ints called values,
     with 2 rows, and initialize the first row to 8, 20, 50 and the
     second row to 12, 30, 75.
     */
    public static void main(String[] args) {
        int number [][] = {{8,20,50},{12,30,75}};
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(" "+ number[i][j]);
            }
            System.out.println();
        }
    }
}
