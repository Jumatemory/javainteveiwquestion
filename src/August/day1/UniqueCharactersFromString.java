package August.day1;

import java.util.Arrays;
import java.util.Collections;

public class UniqueCharactersFromString {
    public static void main(String[] args) {
        System.out.println(printUniqueCharactersFromString("abcddeeffgg"));
    }


    public static String printUniqueCharactersFromString(String str){

        String result ="";
        for (String each :str.split("")){


//            result+= ((Collections.frequency(Arrays.asList(str.split("")),each))==1)?
//                    each:"";


            result += (Collections.frequency(Arrays.asList(str.split("")), each))==1?
                    each:"";
        }



        return result;
    }
}
