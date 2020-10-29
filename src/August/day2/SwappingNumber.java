package August.day2;

public class SwappingNumber {
    public static void main(String[] args) {
        swapNumber(25, 7);
    }
    public static void swapNumber(int a, int b ){
        a = a+ b;
        b = a-b;
        a= a-b ;
        System.out.println(a);
    }
}
