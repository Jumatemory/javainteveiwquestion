package January;

import java.util.Scanner;

public class EightySix {
    /*
    Imagine you have a party and need to form the list of the guests.
    (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
 If yes - take input from.
If not - finish the program and print list of the guests.

Example of the program:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String listOfGuest="";
        String check ="";

        System.out.println("Please enter guest name:");
        listOfGuest+= scanner.nextLine();
        System.out.println("Do you want to enter new guest name:");
        check = scanner.next();
        while (check.equalsIgnoreCase("yes")){
            System.out.println("Please enter guest name:");
            listOfGuest+=scanner.next();
            System.out.println("Do you want to enter new guest name:");
            check =scanner.next();


        }
        System.out.println(listOfGuest);

    }




}
