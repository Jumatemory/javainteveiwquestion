package August.day7;

public class OneHundredFiftyEight {
    /*
    Given a method printDataTypes with one string parameter,
    that must determine which primitive data types are capable
    of properly storing that input. Please complete an
    implementation of this method.
    For each input variable  and appropriate primitive , you must determine if the given primitives are capable of storing it. If yes, then print:
n can be fitted in:
* dataType

If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: ).
byte < short < int < long

if the number cannot be stored in one of the four aforementioned primitives, print the line:
n can't be fitted anywhere.

Example:
input: -100
output:
-100 can be fitted in:
* byte
* short
* int
* long

Example:
input: 32000
output:
32000 can be fitted in:
* short
* int
* long

Example:
input:  2147483000
output:
2147483000 can be fitted in:
* int
* long

Example:
input: 213333333333333333333333333333333333
output: 213333333333333333333333333333333333 can't be fitted anywhere.



     */
    public static void main(String[] args) {
        printDataTypes(2147483000);
    }
    public static void printDataTypes(int number ){
        if (number>=-128&&number<=127){
            System.out.println(number + " can be fitted in: ");
            System.out.println("* byte");
            System.out.println("* short");
            System.out.println("* int");
            System.out.println("* float ");
            System.out.println("* long");
            System.out.println("* double");
        } else if(number>=Short.MIN_VALUE&&number<=Short.MAX_VALUE){
            System.out.println(number + " can be fitted in: ");
            System.out.println("* short");
            System.out.println("* int");
            System.out.println("* float ");
            System.out.println("* long");
            System.out.println("* double");
        }else if(number>=Integer.MIN_VALUE&&number<=Integer.MAX_VALUE){
            System.out.println(number + " can be fitted in: ");
            System.out.println("* int");
            System.out.println("* long");

        }
        else if(number>=Float.MIN_VALUE&&number<=Float.MAX_VALUE){
            System.out.println(number + " can be fitted in: ");
            System.out.println("* float ");
            System.out.println("* long");
            System.out.println("* double");
        }else if(number>=Long.MIN_VALUE&&number<=Long.MAX_VALUE){
            System.out.println(number + " can be fitted in: ");
            System.out.println("* long");
            System.out.println("* double");
        }else if(number>=Double.MIN_VALUE&&number<=Double.MAX_VALUE){
            System.out.println(number + " can be fitted in: ");
            System.out.println("* double");
        }
    }
}
