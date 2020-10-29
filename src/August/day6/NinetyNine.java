package August.day6;

public class NinetyNine {
    public static void main(String[] args) {
        /*

Example:
input: abXYabc
input: 1
output: true
a appears twice

Example:
input: abXYabc
input: 2
output: true
ab appears twice

Example:
input: abXYabc
input: 3
output: false
abX appears once only
Given a string, consider the prefix string made of the first n chars of the string.
         Does that prefix string appear somewhere else in the string?
Assume that the string is not empty and that n is in the range from 1 till str.length().

         */
        String str="xyzxyxyxy";
        int n =2;
        int counter=0;
        if (n==1){
            for (int i = 0; i < str.length(); i++) {
                String oneChar = str.substring(i,i+1);
                if (oneChar.equalsIgnoreCase(str.substring(0,1))){
                    counter++;
                }

            }
        } else if (n==2){
            for (int i = 0; i < str.length()-1; i++) {
                String oneChar = str.substring(i,i+2);
                if (oneChar.equalsIgnoreCase(str.substring(0,2))){
                    counter++;
                }

            }
        }
        if (counter==n||counter>n){
            System.out.println(true);
        } else {
            System.out.println(false);
        }



    }
}
