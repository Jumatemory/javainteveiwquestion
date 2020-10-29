package August.day7;

public class OneHunFiftySix {
    /*
    add_to_r is a method that gets an array and a number.

the method creates a new array bigger by one then (int[] r).
It populates the new array with the old ones(r) values.
and finally in the last position adds the number (int n) to it.

for example:

method input: add_to_r(new int{1,5,77,8}  ,2)

outputs (int array):
[1, 5, 77, 8, 2]

     */
    public static void main(String[] args) {
        int n []= {2,4,6,67,7,};
        int oneNumber =6;
        add_to_r(n,oneNumber);
    }
    public static void add_to_r(int r[], int n){
        int [] new_r = new int[r.length+1];
        for (int i = 0; i < new_r.length-1; i++) {
            new_r[i]= r[i];

        }
        new_r[new_r.length-1]= n;
       for (int each : new_r){
           System.out.println(each);
       }
    }
}
