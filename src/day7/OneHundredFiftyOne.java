package day7;

public class OneHundredFiftyOne {

    /*
    a sign function is simple, its gets a number and
     tells you if its positive, negative or zero.

for example :
sign(5)  => 1
sign(-30)=> -1
sign(0)  => 0

sign gets an int parameter.

print out 1,-1 or 0 depending on the input
     */
    public static void main(String[] args) {
        returnSign(10);
    }
    public static void returnSign(int number ){
        if (number==0){
            System.out.println(-1);
        } else if (number>0){
            System.out.println(1);
        } else if (number<0){
            System.out.println(-1);
        }
    }
}
