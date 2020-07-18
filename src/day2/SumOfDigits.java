package day2;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(findSumOfDigitsInString("String1238cub"));
    }

    public static int findSumOfDigitsInString(String str){

        int count = 0;
        char [] ch = str.toCharArray();

        for (char each: ch){
            if (Character.isDigit(each)){
                count +=Integer.valueOf("" + each);
            }
        }
        return count;
    }
}
