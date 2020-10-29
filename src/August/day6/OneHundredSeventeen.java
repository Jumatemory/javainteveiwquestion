package August.day6;

public class OneHundredSeventeen {
    public static void main(String[] args) {
        /*
       The code provided in your main method will take in eight Strings and save them into an array called arr.
Print out the 4 lines using for loop:
each line should contain a pair of array element as displayed below
user for loop

Example:
arr -> ["apple", "banana","kiwi", "grape","milk", "soda","juice", "coffee"]
 prints:  apple , banana
          kiwi , grape
          milk, "soda"
          juice, coffee
         */
      String [] names = {"banana", "cup", "grape", "love", "cherry", "telephone", "monitor", "boiler" };
                int counter =0;
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+" , ");
            counter++;
            if (counter==2){
                counter=0;
                System.out.println();
            }
        }
    }
}
