package August.day1;

public class MaxValue {
    public static void main(String[] args) {
        System.out.println(findMax());
    }



    public static int findMax(){
        int [] numbers = {1, 0, 1500,4,6,7,120, 4,6,8};


        int max =numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<max){
                max=numbers[i];
            }

        }

















       return max;
    }
}
