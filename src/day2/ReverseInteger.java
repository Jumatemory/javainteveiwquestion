package day2;

public class ReverseInteger {

    public static void main(String[] args) {
        reverseInteger(-12345);


    }
    public static void reverseInteger(int number){
        System.out.println(new StringBuffer(String.valueOf(number)).reverse());
    }
}
