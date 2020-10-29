package August.day7;

import java.util.Scanner;

public class OneHundredFortyEight {
    public static void cube()
    {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int cube = (number*number*number);
        System.out.println(cube);
        //your code here
    }//end cube

    public static void main(String[] args) {

        cube();

    }
}
