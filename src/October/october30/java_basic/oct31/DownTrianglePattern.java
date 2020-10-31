package October.october30.java_basic.oct31;

public class DownTrianglePattern {
    public static void main(String[] args) {
        for (int i = 10; i >=0; i--) {
            for (int j = i; j <10 ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=(2*i-1); k++) {
                if (k==1||i==10||k==(2*i-1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }
}
