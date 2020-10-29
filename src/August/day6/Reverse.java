package August.day6;

public class Reverse {
    public static void main(String[] args) {
        reverseString("anna");
    }
    public static void reverseString (String str){
        String temp = str;
        String container = "";
        for (int i = str.length()-1; i >0 ; i--) {
            container+= i;


        }
        if (temp.equals(container)){
            System.out.println("word is palindrome");
        } else {
            System.out.println("word is not panlindorme");
        }
    }
}
