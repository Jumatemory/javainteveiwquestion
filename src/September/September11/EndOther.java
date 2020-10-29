package September.September11;
/*


Given two strings, return true if either
f the strings appears at the very end of the other string,
 ignoring upper/lower case differences (in other words,
  the computation should not be "case sensitive").
   Note: str.toLowerCase() returns the lowercase version of a string.


endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
 */

public class EndOther {
    public static boolean endOther(String a, String b) {
 String str1  = a.toLowerCase();
  String str2=  b.toLowerCase();

       int indexA= a.lastIndexOf(b);
       int indexB= b.lastIndexOf(a);
      if (a.substring(indexA).equalsIgnoreCase(b)||b.substring(indexB).equalsIgnoreCase(a)){
          return true;
      }

        if (str1.contains(str2)||str2.contains(str1)    ){
            return true;
        }


        return false;
    }

    public static void main(String[] args) {
        System.out.println(  endOther("Hiabcx","bc" ));
    }



}
