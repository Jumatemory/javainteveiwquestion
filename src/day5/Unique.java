package day5;

import java.util.Arrays;
import java.util.Collections;

public class Unique {
    public static void findUnique(String str){

        String result ="";

        for (String each : str.split("")){
            result += ((Collections.frequency(Arrays.asList(str.split("")),each))==1)?each:"";
        }





    }
}
