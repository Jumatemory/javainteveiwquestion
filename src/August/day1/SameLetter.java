package August.day1;

import java.util.Arrays;

public class SameLetter {
    public static void main(String[] args) {
        System.out.println(checkIfStringHaveSameLetters("onion", "onion"));
    }


    public static boolean checkIfStringHaveSameLetters(String str1, String str2){

       char[] ch1 = str1.toCharArray();
       char [] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String s1 ="";
        String s2= "";
        for (char each: ch1){
            s1+=each;
        }
        for (char each: ch2){
            s2+=each;
        }




        return s1.equals(s2);
    }
}
