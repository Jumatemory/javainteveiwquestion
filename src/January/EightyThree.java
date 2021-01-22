package January;

import jdk.swing.interop.SwingInterOpUtils;

public class EightyThree {
    /*Instructions from your teacher:
using substring method output the first two letters of txt string
for examole:
String txt = "foo"
the first two letters are "fo"


use print not println.
     */
    public static void main(String[] args) {
        String word ="mob";
        System.out.println(word.substring(0,2));
        /*
            Online Book Merchants offers premium customers 1 free book
            with every purchase of 5 or more books and offers 2 free books
             with every purchase of 8 or more books. It offers regular customers
             1 free book with every purchase of 7 or more books, and offers 2
             free books with every purchase of 12 or more books.
     Write a program that assigns freeBooks the appropriate value
      based on the values of the boolean variable isPremiumCustomer and the int
       variable nbooksPurchased. Print amount of freeBooks into the console.
          */

        isPremiumCustomer(false,9);
    }

    public static void isPremiumCustomer (boolean isPremium, int nBookPurchased){

        int freeBook =0;
        if (isPremium &&nBookPurchased>=5){
            freeBook =1;

        } else if(isPremium && nBookPurchased>=8){
            freeBook = 2;
        } else if (!isPremium && nBookPurchased>=7){
            freeBook =1;
        } else if(!isPremium && nBookPurchased>=12){
            freeBook =2;
        }


        System.out.println("freeBook = " + freeBook);
    }















}
