package August.day6;

public class WhileLoopDemo {
    public static void main(String[] args) {
        returnLastChar("county");
        int counter =0;
        while (counter<=100){
            System.out.println(counter);
            counter++;
        }

    }


    public  static void returnLastChar(String string){
        System.out.println(string.substring(0,string.length()-1));
    }
}
