package October.October17;

public class CanBalance {

    public static void main(String[] args) {
        int number[] = {2, 1, 1, 2, 1};
        int sum=0;
        int halfSum=0;
        boolean check=false;

        if (number.length%2==0){
            for (int i = number.length/2; i <number.length; i++) {
                halfSum+= number[i];

            }

        } else {
            for (int i = number.length/2+1; i <number.length; i++) {
                halfSum+= number[i];

            }

        }


        System.out.println("halfSum = " + halfSum);
        for (int i = 0; i < number.length; i++) {
            sum+=number[i];
            System.out.println("sum = " + sum);
            if (halfSum==sum){
               check=true;
               break;
            } else {
              check=false;
            }

        }
        System.out.println(check);

    }
}
