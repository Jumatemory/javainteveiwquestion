package January;

public class SeventyNine {
    public static void main(String[] args) {
        /*
        Given a string word, if the first or last chars are 'x' or 'X',
         print the string without those 'x' or 'X' chars,
         otherwise print the string unchanged.
         */

        String word ="javax";
       String container =  word.toLowerCase();


        if (container.substring(0,1).equalsIgnoreCase("x") && container.substring(container.length()-1).equalsIgnoreCase("x")) {
            System.out.println(container.substring(1, container.length()-1));

        }
         else if (container.charAt(0)=='x'){
            System.out.println(container.substring(1));
        }
         else if(container.substring(container.length()-1).equalsIgnoreCase("x")){
            System.out.println(container.substring(0,container.length()-1));
        }
       else

            {
           System.out.println(container);
       }
    }
}
