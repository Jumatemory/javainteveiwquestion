package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSorting {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,10,9,8,7,5,3);

        sortingArrayList(numbers);
        System.out.println(numbers);
    }
    public static List<Integer> sortingArrayList(List<Integer>list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i)<list.get(j)){
                    Integer temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }

        }
        return list;
    }
}

