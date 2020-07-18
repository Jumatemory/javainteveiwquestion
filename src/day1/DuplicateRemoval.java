package day1;

public class DuplicateRemoval {
    public static void main(String[] args) {
        System.out.println(removeDuplicate("aabbedfgh"));
    }

    public static String removeDuplicate(String str){

        String result = "";


        for (int i = 0; i <str.length() ; i++) {
            if (!result.contains(""+str.charAt(i))){
                result += ""+ str.charAt(i);
            }
        }






        return result;
    }
}
