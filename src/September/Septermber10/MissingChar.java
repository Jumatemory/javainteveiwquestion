package September.Septermber10;
/*

Given a non-empty string and an int n,
return a new string where the char at index n
 has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

missingChar("kitten", 1) → "ktten"
        missingChar("kitten", 0) → "itten"
        missingChar("kitten", 4) → "kittn"

 */



public class MissingChar {
    public static String missingChar(String str, int n) {
    String con = str.substring(0,n);
    String con2 = str.substring(n+1);
    return con + con2;
    }

    public static void main(String[] args) {
        System.out.println(missingChar("love", 0));
    }
}
