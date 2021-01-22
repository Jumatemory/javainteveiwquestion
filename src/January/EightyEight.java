package January;

import java.util.Scanner;

public class EightyEight {
    /*
    Print true if the string "cat" and "dog" appear
     the same number of times in the given string word.
Example:
input: catdog
output: true

Example:
input: catcat
output: false

Example:
input: cat-cheetah-dog-cat
output: false
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int catCounter = 0;
        int dogCounter =0;
        for (int i = 0; i < str.length()-2; i++) {
            String catWord = str.substring(i,i+3);
            if (catWord.equalsIgnoreCase("cat")){
                catCounter++;
            } else if (catWord.equalsIgnoreCase("dog")){
                dogCounter++;
            }
        }
        System.out.println(catCounter==dogCounter);




    }
}
