package October.october30.java_basic.oct31;

public class Pattern6 {
    public static void main(String[] args) {
        int number= 10 ;
        for (int i = 0; i < 10; i++) {
            number = 10;
            for (int j = 0; j < i; j++) {
                System.out.print(number + " ");
                --number;
            }
            System.out.println();
        }
    }

}
