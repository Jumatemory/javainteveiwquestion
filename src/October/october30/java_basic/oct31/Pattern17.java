package October.october30.java_basic.oct31;

public class Pattern17 {
    public static void main(String[] args) {
        int rows=8;
//Prints upper half pattern
        for (int i = 1; i < rows; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
