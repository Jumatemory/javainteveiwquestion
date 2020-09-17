package day6;

public class OneHundredSixteen {
    public static void main(String[] args) {
        int nums [] = {2,44, 6,8, 8,25,88, 99,100, 299};
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
