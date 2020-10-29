package September.Septermber10;
/*


Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */


public class DoubleChar {
    public static String doubleChar(String str) {
        char c[] = str.toCharArray();
        String str2="";
        for (int i = 0; i < c.length; i++) {
            str2 = str2+ ""+ c[i]+c[i];
        }

        return str2;
    }

    public static void main(String[] args) {
        System.out.println(doubleChar("hello"));
    }
}
