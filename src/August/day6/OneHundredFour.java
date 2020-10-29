package August.day6;

import java.util.Scanner;

public class OneHundredFour {
    public static void main(String[] args) {
        /*
        In this task, we gonna talk about JSON files. JavaScript Object Notation (JSON) -  is a language-independent data format. Write a program that will parse JSON file, and print out into the console first name and last name as displayed in the example below. In this task, JSON file will be provided as a String variable.
Example:
input:{"id": 1934, "firstName": "JohnCubit", "lastName": "Intenational", "role": "student-team-member"}
output:
First name: James
Last name: May

         */
        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();
        int indexOfFName= json.indexOf(":", 20);
        int indexOfFNameComma =json.indexOf(",",26);
       int lastName =json.indexOf("lastName");
       int role = json.indexOf("role");
        System.out.println(json.substring(indexOfFName+3,indexOfFNameComma-1));
        System.out.println(json.substring(lastName+12, role-4));

    }
}
