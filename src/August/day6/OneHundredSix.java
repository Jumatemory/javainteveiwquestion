package August.day6;

public class OneHundredSix {
    public static void main(String[] args) {
        String str="Thank you for responding for my email";
        char [] chars = str.toCharArray();


        for (int i = 0; i <str.length() ; i++) {
            if (chars[i]=='i'||chars[i]=='a'||chars[i]=='u'||chars[i]=='e'){
                System.out.println(chars[i]);
            }

        }

//        for (int i = 0; i < str.length(); i++) {
//          char my = str.charAt(i);
//          if (my=='a'||my=='e'||my=='u'||my=='i'||my=='o'){
//              System.out.println(str.charAt(i));
//
//          }
//        }
    }
}
