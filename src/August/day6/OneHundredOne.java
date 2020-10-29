package August.day6;

public class OneHundredOne {
    /*


Example:
input: What's the difference between java, javascript and python?
output: false
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true
     */
    public static void main(String[] args) {
        int javaCounter = 0;
        int pythonCounter =0;
        String str ="What's the difference between java,  and python?";
        for (int i = 0; i < str.length()-3; i++) {
            String javaChars = str.substring(i,i+4);
            if (javaChars.equalsIgnoreCase("java")){
                javaCounter++;
            }

        }
        for (int i = 0; i < str.length()-5; i++) {
            String pythonChars = str.substring(i,i+6);
            if (pythonChars.equalsIgnoreCase("python")){
                pythonCounter++;
            }

        }
        System.out.println(javaCounter==pythonCounter);

    }
}
