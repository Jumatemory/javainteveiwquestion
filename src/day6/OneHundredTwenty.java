package day6;

public class OneHundredTwenty {

    public static void main(String[] args) {
        String words [] = {"apple","tomato", "connectivity problem", "Desktop","International"};
        String longest= words[0];
       for (String each: words){
           if (each.length()>longest.length()){
               longest=each;
           }
       }
        System.out.println(longest);
    }

    /*
    Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
     */
}
