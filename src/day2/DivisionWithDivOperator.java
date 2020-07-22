package day2;

public class DivisionWithDivOperator {
    public static void main(String[] args) {
        divideWithDivisionOperator(6, 2);

    }
    public static void divideWithDivisionOperator(int num1, int num2   ){
        if (num2==0){
            System.out.println("Invalid number");
        } else
            System.out.println(num1 + " divide by "+ num2+ " is");
        int count = 0;
        while (num1>=num2){
            num1-=num2;
            count++;
        }
        System.out.println(count + " and remainder is "+ num1);

    }
}
