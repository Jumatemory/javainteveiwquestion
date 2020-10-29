package September.Septermber10;

import java.util.Scanner;

public class HundredSeventyNine {
    /*
    uniqueChars is a method that you will code now,
    should be able to accept any string in the world and return unique characters from the parameter.

Examples:

uniqueChars("java") ==> "jav"

uniqueChars("mama") ==> "ma"

uniqueChars("spoon") ==> "spon"
     */
    public static void main(String[] args) {

            Scanner sc  = new Scanner(System.in);
            String sentence = "This is a bird";
            System.out.println("Enter a word to extract from the string: ");
            String wordToextract = sc.next();
            if(sentence.contains(wordToextract)){
                int y = sentence.indexOf(wordToextract);
                String u = sentence.substring(y , y+(wordToextract.length()));
                System.out.println(u);
            }

        }



}
