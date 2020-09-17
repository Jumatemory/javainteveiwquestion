package day6;

public class OneHundredEleven {
    public static void main(String[] args) {

        int sum =0;
        int k =1;
        do {

            sum =sum+(k*k);
            k++;


        } while (k<=50);
        System.out.println(sum);
    }
}
