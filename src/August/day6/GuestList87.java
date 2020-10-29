package August.day6;

import java.util.Scanner;

public class GuestList87 {
    /*
    Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
 If yes - take input from.
If not - finish the program and print list of the guests.

     */
    public static void main(String[] args) {
        System.out.println("Please enter guest name:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Do you want to enter new guest name:");
        name = scan.next();
        while (!name.equalsIgnoreCase("no") ){
            System.out.println("Please enter guest name:");
            name = scan.next();
            System.out.println("Do you want to enter new guest name:");
            scan.nextLine();
        }
        System.out.println(name);
    }
}
