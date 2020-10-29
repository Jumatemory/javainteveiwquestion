package October.October28;

import java.util.Random;

public class PalindromeNumber {
    public static void main(String[] args) {
        int rem =0;
        int num = 356;
        int sum = 0;
        int temp = num;
        while (num>0){
            rem = num%10;
            sum = (sum*10) + rem;
            num/=10;
        }
        if (temp ==sum){
            System.out.println("palindrome ");
        } else {
            System.out.println("Not a palindrome");
        }
        System.out.println(Math.random()*10);
        Random random = new Random();
        random.ints(10);
        System.out.println(random.nextInt(1000));



    }
}
