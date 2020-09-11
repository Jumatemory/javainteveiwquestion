package day7;

public class OneHundredFiftyTwo {
    /*
    Create a method called plus_minus that gets an array of ints (int[]),
    it outputs how many negative , positive and zero numbers are in the array.

for example:

plus_minus (new int[]{1,2,55,-9,-2,0});

will output:
positives:3, negatives:2, zeros:1
     */
    public static void main(String[] args) {
        int nums [] = {2,6,8,29,59,-5};
        plus_minus(nums);
    }
    public static void plus_minus(int [] numbers){
        int zero =0;
        int positive =0;
        int negative =0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==0){
                zero++;
            } else if(numbers[i]>0){
                positive++;
            } else if (numbers[i]<0){
                negative++;
            }
        }
        System.out.print("positive:"+positive+","+"negatives:"+negative+","+ "zeros:"+zero);
    }
}
