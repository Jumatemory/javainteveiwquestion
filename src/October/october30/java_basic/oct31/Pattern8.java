package October.october30.java_basic.oct31;

public class Pattern8 {
    public static void main(String[] args) {

        for (int i = 1; i <=10; i++) {
            int num;
            if (i%2==0){
                num=0;
                for (int j = 1; j <=10; j++) {
                    System.out.print(num);
                    num =(num==0)?1:0;
                }
            }
            else
            {
                num=1;
                for (int j = 1; j <=10 ; j++) {
                    System.out.print(num);
                    num=(num==0)?1:0;

                }
            }
            System.out.println();

        }
    }
}
