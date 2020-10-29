package August.questions;

public class DiamondShapePattern {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int y = 0; y < 10-i; y++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }

            System.out.println();
        }
        for (int i = 9; i >0; i--) {
            for (int j = 0; j < 10-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
