package October.October28;

public class PyramidStarPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 9-i; j >1 ; j--) {
                System.out.print(" ");
            }
            for (int j = 10-i; j >=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
