package day6;

public class OneHundredNineteen {
    public static void main(String[] args) {
        String str = "juma@gmail.com";
        String split [] = str.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);


    }
    /*
    Given a String variable email, write code using split method to print email
     id and domain in separate lines.

Example:
email -> info@cybertekschool.com
Print:
Email id: info
Email domain: cybertekschool.com


If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com
print:
invalid email

email -> my@fancy@email.com
print:
invalid email
     */
}
