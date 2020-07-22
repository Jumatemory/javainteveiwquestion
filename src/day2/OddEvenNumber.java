package day2;

public class OddEvenNumber {

    public static void main(String[] args) {
        checkIfNumberIsOddOrEven(53);
    }
    public static void checkIfNumberIsOddOrEven(int number){
        if (number%2==0){
            System.out.println(number + " is even" );
        } else  {
            System.out.println(number + " is odd");
        }
    }
}
