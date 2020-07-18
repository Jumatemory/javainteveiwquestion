package day1;

public class StringReversal {
    public static void main(String[] args) {


        System.out.println(reverseString("I Love Liseth"));
        System.out.println(reverseString("I love java"));
    }


    public static String reverseString(String str){
        String [] arr = str.split("");
        String result ="";
        for (int i = arr.length-1; i >=0 ; i--) {

            result +=arr[i];

        }

        return result;

    }











    public static String reverseStr(String str){

        String reversedString ="";
        for (int i = str.length()-1; i >=0 ; i--) {

            reversedString += "" +str.charAt(i);

        }



        return reversedString;
    }





















}
