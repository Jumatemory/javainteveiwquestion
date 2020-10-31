package October.october30.java_basic.oct31;

public class Pattern14 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 10-i; j >0 ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
