package day7;

import java.util.Scanner;

public class OneHundredFortySix {
    /*
   create a static method called "plus",
    its return is void and it gets no arguments.

It asks the user to input two numbers,
then it will add them and print the result.
Create a scanner within plus method.

Example:

enter first number:
1
enter second number:
2
result: 3nd the second row to 12, 30, 75.
     */
    public static void main(String[] args) {
        plus();
    }

    public static void plus (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two values: ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.println(number1+number2);
    }
}
