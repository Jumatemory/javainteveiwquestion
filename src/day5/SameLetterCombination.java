package day5;

import java.util.ArrayList;
import java.util.Arrays;

public class SameLetterCombination {

    public static void main(String[] args) {
        boolean b = checkIfTwoWordsConsistOfSameLetter("gbc", "cab");
        System.out.println("b = " + b);
    }
    public static boolean checkIfTwoWordsConsistOfSameLetter(String str1, String str2){
        char charArr1 [] = str1.toCharArray();
        char charArr2[] = str2.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        String l1="";
        String l2 ="";
        for (char each : charArr1){
            l1 += " " + each;
        }
        for (char each : charArr2){
            l2 += " " + each;
        }
        return l1.equals(l2);
        
    }
    
    
    
}
