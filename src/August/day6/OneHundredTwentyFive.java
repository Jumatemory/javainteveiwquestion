package August.day6;

public class OneHundredTwentyFive {
    public static void main(String[] args) {
        String [] names = {"juma", "sam", "Habib", "John", "James", "jam", "tom"};
      String shortest = names[0];
        for(String each: names){
            if (each.length()<shortest.length()){
                shortest=each;
            }

        }
        String sameShortNames ="";
     for (String each: names){
         if (each.length()==shortest.length()){
             sameShortNames+=", "+ each;
         }
     }
      String [] split = sameShortNames.split(",");

       for (String each: split){
           System.out.print("[");

           System.out.print(","+each);
       }
    }
}
