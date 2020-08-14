package day6;

import java.util.Arrays;

public class SameLetter {
    public static void main(String[] args) {
        System.out.println(checkSameLetter("abc", "bca"));

    }
    public static boolean checkSameLetter(String str1, String str2){
        char [] char1 = str1.toCharArray();
        char [] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        String string1 ="";
        String string2 ="";

        for (char each: char1){
            string1+= each;

        }
        for (char each: char2){
            string2 += each;
        }
        return string1.equals(string2);
    }
}
