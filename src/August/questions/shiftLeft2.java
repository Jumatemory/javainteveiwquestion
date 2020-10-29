package August.questions;

public class shiftLeft2 {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
        int n =3;
        for (int i = 0; i < n; i++) {
            int j, first;
            first = arr[0];
            for ( j = 0; j < arr.length-1; j++) {
                arr[j]= arr[j+1];
            }
            arr[j]  = first;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
