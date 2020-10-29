package August.day6;

public class OneHundredFifteen {
    public static void main(String[] args) {
        int [] nums = {2,4,6,7,10,506};
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
               max = nums[i];
            }

        }
        System.out.println(max);
    }
}
