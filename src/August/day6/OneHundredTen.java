package August.day6;

import java.util.Scanner;

public class OneHundredTen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] names = {scan.nextLine(), scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine() };

        for (int i = 0; i <=names.length-1; i++) {
            System.out.println(names[i].charAt(0) +" " + names[i].charAt(names[i].length()-1));

        }
    }
}
