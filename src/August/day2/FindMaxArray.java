package August.day2;

public class FindMaxArray {
    public static void main(String[] args) {

        int [] numbers = {4,6,34,6,8,10, 500};
       int max =  findMax(numbers);
        System.out.println("max = " + max);
    }

    public static int findMax(int[] n){
        int max = Integer.MIN_VALUE;
        for (int each: n){
            if (each>max){
                max=each;
            }
        }
        return max;
    }
}
