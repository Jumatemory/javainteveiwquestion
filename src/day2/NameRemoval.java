package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class NameRemoval {
    public static void main(String[] args) {
    removeName();
    }
    public static void removeName(){
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed","John", "Eric","Ahmed"));
        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            if (it.next().equals("Ahmed"))
                it.remove();
        }
        System.out.println(names);
    }
}
