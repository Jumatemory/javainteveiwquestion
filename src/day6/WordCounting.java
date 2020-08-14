package day6;

public class WordCounting {
    public static void main(String[] args) {
        System.out.println(findWord("jay john jay hi jayyyyyyyyyyyyyyyyyyyyy jaywalking jay jay "));


    }
    public static String findWord(String word){
        int count=0;

        for (int i = 0; i < word.length()-3; i++) {
            String threeChar =word.substring(i,i+3);
            if (threeChar.equalsIgnoreCase("jay")){
                count++;
            }

        }
        word = Integer.toString(count);






        return word;
    }

}
