package August.questions;

public class NumberPattern {
    public static void main(String[] args) {
        int number =1;
        for (int i = 0; i < 10; i++) {


            for (int j = 0; j < i; j++) {
                System.out.print(number++ + " ");

            }
            System.out.println();
        }
        int n=8;
        int i = 0;
        System.out.printf("%" + (n - i) * 2 + "s", "");
        int num=1;
        System.out.printf("%4d", num);
    }
}
