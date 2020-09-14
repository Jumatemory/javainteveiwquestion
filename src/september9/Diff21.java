package september9;

public class Diff21 {
    public static void main(String[] args) {
        System.out.println(22);
    }
    public static int diff21(int n) {
        int x =0;
    if (n<21){
       x= 21-n;
    } else if (n>21){
       x=21*n;
    }
    return x;
    }
}
