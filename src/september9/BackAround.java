package september9;

public class BackAround {
    /*

    Given a string, take the last
    char and return a new string with the last
     char added at the front and back, so "cat" yields "tcatt".
     The original string will be length 1 or more.


backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
     */
    public static void main(String[] args) {
        System.out.println(backAround("cake"));
    }
    public static String backAround(String str) {
    String str2 = str.charAt(str.length()-1)+str + str.charAt(str.length()-1);
    return str2;
    }
}