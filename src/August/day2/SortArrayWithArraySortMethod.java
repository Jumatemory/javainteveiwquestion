package August.day2;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayWithArraySortMethod {
    public static void main(String[] args) {
        int [] numbers = {2, 100, 88,10, 560, 0};
        int [] getNumbers = sort(numbers);
        System.out.println(Arrays.toString(getNumbers));
    }



    public static int [] sort(int [] a){
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : a){
            list.add(each);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = findMin(list);
            list.remove(Integer.valueOf(a[i]));


        }
        return a;
    }
    public static int findMin(ArrayList<Integer> a){
        int min = Integer.MAX_VALUE;
        for (int each: a){
            min = Math.min(min, each);
        }
        return min;
    }
}
