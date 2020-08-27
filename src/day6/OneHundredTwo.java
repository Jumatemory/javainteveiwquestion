package day6;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class OneHundredTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();
        if (!html.contains("<html>")){
            System.out.println("Invalid input!");
        } else {
            int firstIndexOfQuote =html.indexOf("id");
            int lastIndexOfQuote =html.lastIndexOf("\"");
            System.out.println(html.substring(firstIndexOfQuote+4, lastIndexOfQuote));

        }

    }


}
