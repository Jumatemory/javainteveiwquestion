package January;

import java.util.Scanner;

public class SeventySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = "Roksana_Botcieva@gmail.com";
        String first ="";
        String last="";
        int index =email.indexOf("_");
        int indexAt =email.indexOf("@");
        String rest ="";
        System.out.println(index);
        if (email.contains("_")){
           first = email.substring(0, index);
           last = email.substring(index+1, indexAt);
           rest = email.substring(indexAt-1);

            System.out.println(last+"_"+first+rest);
        }
        else if(!email.contains("-")){
            System.out.println("I will Norma's pussy and butt hole");
        }
    }
}
