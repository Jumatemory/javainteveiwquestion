package August.day1;

import java.util.Arrays;

public class SameLetterVersion2 {

    public static void main(String[] args) {
        System.out.println(checkIfTwoStringHaveSameLetters("herat", "Hirat"));
    }


    public static boolean checkIfTwoStringHaveSameLetters(String str1, String str2){
        char [] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        String s1 ="", s2 ="";

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (char each: ch1){
            s1+= each;
        }
        for (char each : ch2){
            s2 += each;
        }





        return s1.equals(s2);
    }
}
