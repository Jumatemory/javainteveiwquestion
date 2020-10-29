package October.October28;

public class PrimeNumber {
    public static void main(String[] args) {
        int num =17;
        int flag = 0;

        int half = num/2;
        System.out.println("m = " + half);


        if (num==1||num==0){
            System.out.println( num + " is not a prime number ");
        } else {
            for (int i = 2; i <=half; i++) {
                if (num%i==0){
                    System.out.println(num + " is not a prime number");
                    flag =1;
                    break;
                }

            }


        }
        if (flag==0){
            System.out.println(num + " is a prime number ");
        }

    }
}
