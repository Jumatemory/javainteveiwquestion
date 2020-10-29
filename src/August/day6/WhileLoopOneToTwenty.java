package August.day6;

public class WhileLoopOneToTwenty {
    public static void main(String[] args) {
      findDivisibleBy3();

    }
    public static void findDivisibleBy3(){
        int count=0;
        int container=0;
        while (count<=20){
            if (count%3==0){
                System.out.println("" +count);

            }
            ++count;
        }




    }
}
