package August.questions;

public class DuplicateArray {
    public static void main(String[] args) {
        String names []= {"Juma", "Latif",  "Omaid", "omaid", "Sayed", "juma","juma", "Habib", "habib"};
        int counter = 0;
        for (int i = 0; i < names.length; i++) {

            for (int j = i+1; j <names.length ; j++) {
                if (names[i].equalsIgnoreCase(names[j])){
                    counter++;
                    if (counter>=1){
                        System.out.println(names[i]);
                    }


                }

            }


        }
    }

}
