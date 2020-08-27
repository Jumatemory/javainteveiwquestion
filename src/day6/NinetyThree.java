package day6;

public class NinetyThree {
    public static void main(String[] args) {

        String word ="rybyjava";
        boolean exists = false;

        if (word.substring(0,4).equalsIgnoreCase("java")||
                word.substring(1,5).equalsIgnoreCase("java")){
            exists=true;
        } else {
          exists=false;
        }
        System.out.println(exists);


        /*
        Given a string word, print true if "java" appears starting at index 0 or
         1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = .
Example:
input: javapython
output: true

Example:
input: cjavac++
output: true


Example:
input: c#javaruby
output: false
         */
    }
}
