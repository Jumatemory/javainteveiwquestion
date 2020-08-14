package day6;

public class OneHundred {
    public static void main(String[] args) {
        /*

Example:
input: breadjambread
output: jam

Example:
input: xxbreadjambreadyy
output: jam

Example:
input: xxbreadapple
output: nothing

Example:
input: breadbutterbread
output: butter
  A sandwich is two pieces of bread with something in between. Print the string that is between the first and
   last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.

         */

        String str =" breadbutterbread";
        int firstBread=str.indexOf("bread");
       int lastBread = str.lastIndexOf("bread");
       int breadCounter =0;
        for (int i = 0; i < str.length()-4; i++) {
            String breadChars = str.substring(i,i+5);
            if (breadChars.equalsIgnoreCase("bread")){
                breadCounter++;
            }

        }
        if (breadCounter<=1){
            System.out.println("nothing");


        } else {
            System.out.println(str.substring(firstBread+5,lastBread));

        }
        System.out.println(str.lastIndexOf("bread")     );
        System.out.println(str.indexOf("bread"));
    }


}
