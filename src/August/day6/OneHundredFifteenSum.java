package August.day6;

public class OneHundredFifteenSum {
    public static void main(String[] args) {
        int sum = 0;
        int numbers [] = new int [5];
        numbers[0] = 1;
        numbers[1]= 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers [4] = 9;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];

        }
        System.out.println(sum);
    }
}
