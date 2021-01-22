package January;

public class One {
    public static void main(String[] args) {

        System.out.println(verifyWordExistence("book"));

    }

    public static boolean verifyWordExistence(String word){

        String sentence ="Write a program that will verify if word contains in the sentence. Print out the result as boolean value. ";
        boolean check=false;

        if (sentence.contains(word) ){
            check = true;
        } else {
            check = false;
        }
        return check;

    }
}
