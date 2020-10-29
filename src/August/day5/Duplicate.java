package August.day5;

public class Duplicate {

    public static void main(String[] args) {
        System.out.println(findDuplicate("AABBCCGGEGH"));

    }
    public static String findDuplicate(String str ){
        String container ="";

        for (int i = 0; i < str.length(); i++) {
            if (!container.contains(str.charAt(i)+"")){
                container += "" + str.charAt(i);
            }
        }
        return container;

    }
}
