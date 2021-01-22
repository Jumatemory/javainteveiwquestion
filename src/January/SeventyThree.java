package January;

public class SeventyThree {
    public static void main(String[] args) {
        String word ="fifteen";

        if (word.length()<5){
            System.out.println("invalid");
        } else if (word.length()>5){
            int len = word.length()/2;
            System.out.println(word.substring(len+1));
        }
    }
}
