package October.October23;

public class Fibonacci {
    public static void main(String[] args) {
        int n1=0,n2=1,n3;
        System.out.print(n1 +" " + n2);
        int counter = 10;
        for (int i = 2; i < counter; i++) {

            n3 =n1+n2;
            System.out.print(" "+ n3 );
            n1=n2;
            n2=n3;


        }

    }

}
