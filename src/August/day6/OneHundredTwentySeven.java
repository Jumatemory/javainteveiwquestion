package August.day6;

import java.util.Scanner;

public class OneHundredTwentySeven {
    public static void main(String[] args) {
        /*
        An array inhabitants represents cities and their respective populations.
        For example, the following arrays
        shows 8 cities and their respective populations:
[3, 6, 0, 4, 3, 2, 7, 1]
Some cities have a population of 0 due to a pandemic zombie disease
that is wiping away the human lives.
After each day, every city will lose half of its population.
write a program to loop though each city population and make it
 lose half of its population
until all cities have no humans left. Make updates to each element in the
array And print the array like below for each day:

Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
         */
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }


    }
}
