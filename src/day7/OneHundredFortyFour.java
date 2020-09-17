package day7;

public class OneHundredFortyFour {
    /*
    Like in a match 3 game but not.

You get a 2d array and you need to find how many two matches there are.
and return the number(int) of matches you found.

For example : 1 and 2 are not a match, 2 and 2 are a match.
a match in this case is two numbers in a row that are equal .

for example:
[2,2,1,3,4,5]
[5,2,3,3,4,5]
[3,2,3,1,4,5]

print
matches: 2

This 2d array has 2 matches (
the 2,2 in the first row and
 3,3 in the second).

hint: you will need a nested for loop to
 loop all the array. in the if check the if the
 current number is equal to the next
 (or previous it doesn't matter), check for array boundaries
 before so you won't get an error.
     */
    public static void main(String[] args) {
        int matches = 0;
        int [][] arr = { {1,1,2,4,6,8, 10,29},
                {4,4,5,8,9,19,10,10, 30, 60} ,
                {10,20,40,39,59,69,69,69}   };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {


                System.out.print(" " +arr[i][j]);


            }
            System.out.println();

        }



    }


    }

