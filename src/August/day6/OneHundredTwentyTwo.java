package August.day6;

public class OneHundredTwentyTwo {
    public static void main(String[] args) {
     int [] nums = {1,1,2,3,4, 7, 7,7,8,10,100};

        for (int i = 0; i < nums.length; i++) {
            int counter =0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    counter++;
                }
            }
            if (counter==1){
                System.out.println(nums[i]  );


            }

        }
    }
}
