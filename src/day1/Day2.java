package day1;

public class Day2 {


    public static void main(String[] args) {
        System.out.println(passwordValidation("cyBertek@1"));
    }

    public static boolean passwordValidation(String password){

        if (password.length()>=6 && !password.contains(" "))
            if (password.matches("(.*[a-z].*)")&&
                    password.matches("(.*[A-Z].*)")&& password.matches("(.*[0-9].*)")&&
                    password.matches("(.*[-/,:-@ #].*)")){
                return true;

            }
                return false;


    }
}
