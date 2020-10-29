package August.questions;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        int number[] = {3,3,2,1,2,1,3};
        int fre[] = new int [number.length];
        int visited=-1;
        for (int i = 0; i < number.length; i++) {
            int counter = 1;
            for (int j = i+1; j <number.length ; j++) {
                if (number[i]==number[j]){
                    counter++;
                    fre[j]= visited;

                }
            }
            if (fre[i]!=visited){
                fre[i] = counter;

            }
            /*
            fre ={3,-1,2,1,-1,1,-1}

             */

        }
        for (int i = 0; i < fre.length; i++) {
            if (fre[i]!=visited){
                System.out.println(" number " + number[i] + " | and its frequency " + fre[i]);
            }
        }
    }

}
