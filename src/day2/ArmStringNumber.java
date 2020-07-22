package day2;

public class ArmStringNumber {

    public static void main(String[] args) {
        findArmStringNumber(153);
    }
    public static void findArmStringNumber(int number){
        int temp = number;
        int r ;
        int sum = 0;
        while (number>0 ){
            r = number%10;
            number = number/10;
           sum = sum + r*r*r;

        }
        if (temp==sum){
            System.out.println("It's an Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
