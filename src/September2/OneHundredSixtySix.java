package September2;

import java.util.Arrays;

public class OneHundredSixtySix {
    /*


    c_profits gets the buyPrice(int) and
    sellPrice(int) and determines if there was a profit or loss.
it returns a string value that can be "profit","loss","no loss"

for example:
c_profis(100,1500)
returns : "profit"

c_profis(20,5)
returns : "loss"

c_profis(100,100)
returns : "no loss"


     */
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE
        for (int i = 0; i < chessBoard.length; i++) {
            int counter =0;
            for (char c='a';  c <='h';  c++) {
                chessBoard[i][counter]= i+1+""+c;
                counter++;

            }

        }

        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));
    }
}
