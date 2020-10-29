package August.day2;

public class PrimeNumber {
    public static void main(String[] args) {
        findPrimeNumber(15);

    }
    public static void findPrimeNumber(int number ) {
        int i =2;
        while (number>i){
            if (number%i==0){
                System.out.println("number " + number + " is not a prime number");
                break;

            }
            i++;

        }

        if(i==number){
            System.out.println("number  "+ number + " is a prime number ");
        }

    }
}
