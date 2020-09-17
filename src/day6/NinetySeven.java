package day6;

public class NinetySeven {
    /*
    Return the number of times that the string "java" appears anywhere in the given string word.

Example:
input: javaxjava
output: 2

Example:
input: javaxjavaapplepearjavaegg
output: 3
     */
    public static void main(String[] args) {
        String str ="hiiiiiiiiii hi hi code hi java my one love ";
        int javaCounter = 0;
        for (int i = 0; i <str.length()-1 ; i++) {
            String javaChar = str.substring(i,i+2);
            if (javaChar.equalsIgnoreCase("hi")){
                javaCounter++;

            }

        }
        System.out.println(javaCounter);
    }
}
