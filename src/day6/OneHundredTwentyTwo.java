package day6;

public class OneHundredTwentyTwo {
    public static void main(String[] args) {
     String [] names = {"keyboard", "cd","keyboard", "telephone"};

        for (int i = 0; i < names.length; i++) {
            int counter =0;
            for (int j = 0; j < names.length; j++) {
                if (names[i]==names[j]){
                    counter++;
                }
            }
            if (counter>=2){
                System.out.println(names[i]  );
                break;

            }

        }
    }
}
