package day7;

import java.util.Scanner;

public class OneHundredForty {
    public static void main(String[] args) {
        /*


         Given a String array words, iterate through
         each word and print first and last letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]
         */
        String str = "";

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        for (int i = 0; i < words.length; i++) {
            str +=""+ words[i].charAt(0) + words[i].charAt(words[i].length()-1)+", ";

        }
        System.out.println("["+str.substring(0,str.length()-2)+"]");
        System.out.println("["+str+"]");
        System.out.println(str);


    }
}
