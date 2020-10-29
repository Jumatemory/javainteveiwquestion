package August.day2;

public class ConsecutiveNumber {

    public static void main(String[] args) {
       String numbers = printConsecutive(100);
        System.out.println(numbers);
    }
    public static String printConsecutive(int number){
      String result="";
        for (int i = 0; i <number ; i++) {
            if (i%2==0 ){
              result +="codibility\n";

            }else if(i%2==0 && i%3 ==0 && i%5 ==0){
               result +="codilityTestCoder";
            }
            else if(i%3==0){
               result+= "test";
            } else if(i%5==0){
               result+= "coder";
            }else if(i%2==0 && i%3==0){
                result+= "codibilityTest";

            }  else{
               result+="" + i+"\n";
            }

        }
        return result;
    }
}
