package September.Septermber10;
/*

Return the number of times that the string
"code" appears anywhere in the given string,
except we'll accept any letter for the 'd', so "cope" and "cooe" count.


countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
 */

import java.util.regex.Pattern;

public class CountCode {
    public static void main(String[] args) {
        System.out.println(countCode("I love code code all the time core"));

    }
    public static int countCode(String str) {

        String codeCounter = "co"+ Pattern.matches(".","[a-z") +"e";
        int counter=0;
        for (int i = 0; i < str.length()-3; i++) {
            String codeChar = str.substring(i,i+4);
            if (codeChar.equalsIgnoreCase("code")||codeChar.equalsIgnoreCase(codeCounter) ){
                counter++;
            }

        }

        return counter;
    }
}
