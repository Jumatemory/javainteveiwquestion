package day6;

public class OneHundredEighteen {
    public static void main(String[] args) {
        String [] names = {"banana", "cup", "grape", "love", "cherry", "telephone", "monitor", "boiler" };
        int counter =0;
        int counter2 =0;
        for (int i = 0; i < names.length; i++) {
            counter2++;
            System.out.print(names[i]+" ");
            if (counter2==3){
                counter2=0;
                String name = names[--i];
            }


            counter++;
            if (counter==3){
                counter=0;
                System.out.println();
            }
        }

    }





    /*
    The code provided in your main method will take in six Strings and save them into an array called arr.
Print out the 3 neighboring items of the array in one line until the last line
each line should contain 3 neighboring items of array element as displayed below
user for loop

Example:
arr -> ["apple", "banana","kiwi", "grape","milk","soda"]
 prints:  apple , banana , kiwi
          banana , kiwi , grape
          kiwi , grape , milk
          grape , milk , soda
     */
}
