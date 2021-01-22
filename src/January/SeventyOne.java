package January;

public class SeventyOne {
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            if (i%2==0){
//                System.out.println(i);
//            } else {
//
//            }
//        }
        String container ="";
        String text = "IEastNormaAss";

        for (int i = 0; i < text.length()-1; i++) {
       container += "" + text.charAt(i);

        }
        System.out.println(container);
    }
}
