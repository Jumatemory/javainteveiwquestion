package day6;

import org.w3c.dom.ls.LSOutput;

public class WordCounter2 {
    public static void main(String[] args) {
        System.out.println(findWord("i go to church every day , i  love going to church , say church, church "));
    }
    public static String findWord(String word){
        int count = 0;
        for (int i = 0; i < word.length()-6; i++) {
            String sixChars = word.substring(i, i+6);
            if (sixChars.equalsIgnoreCase("church")){
                count++;
            }

        }
        word = Integer.toString(count);




        return word  ;
    }
}
