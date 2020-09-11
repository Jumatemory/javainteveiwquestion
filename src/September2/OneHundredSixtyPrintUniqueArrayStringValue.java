package September2;
/*

Complete a void method printUniqueWords() that will print only unique words from an array of strings. Every single unique word should be printed from the new line.

Example:
input:[java, code, python, code, rust, code, rust]
output:
java
python
 */

import java.util.Scanner;

public class OneHundredSixtyPrintUniqueArrayStringValue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords();



    }
    public static void printUniqueWords(){
        String words2 [] = {"java", "code", "python", "code", "rust", "code", "rude"};

        for (int i = 0; i <words2.length; i++) {
            int counter = 0;
            for (int j = 0; j < words2.length; j++) {
                if (words2[i]==words2[j]){
                    counter++;
                }

            }
            if (counter==1){
                System.out.println(words2[i]);
            }

        }
    }
}
