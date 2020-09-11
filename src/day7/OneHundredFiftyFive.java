package day7;

import java.util.Scanner;

public class OneHundredFiftyFive {
    /*
    Create a method called next3 .
    This method gets an int argument and
    prints the next 3 numbers after that number.
    Call the method from main method and pass num to it.

enter number
1
next 3 are:
2 3 4

(put a space between numbers)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        next3(num);
    }
    public static void next3(int number){

        for (int i = 0; i < 3; i++) {
            System.out.print(++number+" ");

        }
    }
}
