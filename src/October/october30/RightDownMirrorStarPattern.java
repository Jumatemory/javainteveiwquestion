package October.october30;

public class RightDownMirrorStarPattern {
    public static void main(String[] args) {
        for (int i = 10; i >0; i--) {
            for (int j = 10; j>i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}

