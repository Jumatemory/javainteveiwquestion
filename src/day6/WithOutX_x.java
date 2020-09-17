package day6;

public class WithOutX_x {
    public static void main(String[] args) {

        System.out.println(findXOrx("lovex"));
    }
    public static String findXOrx(String word){
        if (word.substring(0,1).equalsIgnoreCase("x") ){
          word=word.substring(1);

        } else if(word.substring(word.length()-1).equalsIgnoreCase("x")){
            word =word.substring(0, word.length()-1);
        }




   return word   ;
    }

}

/*
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,
otherwise print the string unchanged.
 */
