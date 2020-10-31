package everyday_practice;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 80;
        int half=number/2;
        int flag = 0;
        if (number==0||number==1){
            System.out.println(number + " is a not prime number: ");
        } else {
            for (int i = 2; i < half; i++) {
                if (number%i==0){
                    System.out.println(number + " is not a prime number : ");
                    flag = 1;
                    break;
                }
            }
            if (flag==0){
                System.out.println( "The " + number +" is  a prime number ");
            }
        }
    }
}
