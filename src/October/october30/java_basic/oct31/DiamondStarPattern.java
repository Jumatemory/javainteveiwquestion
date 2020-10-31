package October.october30.java_basic.oct31;

public class DiamondStarPattern {
    public static void main(String[] args) {
        for (int i = 1; i <10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int k = 1; k < 2 * (i); k++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.print("");
            } else {
                System.out.println("*");
            }
        }




        for (int i = 10; i >0; i--) {
            for (int j = 10; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int k = 1; k < 2 * (i); k++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.print("");
            } else {
                System.out.println("*");
            }
        }
    }
}
