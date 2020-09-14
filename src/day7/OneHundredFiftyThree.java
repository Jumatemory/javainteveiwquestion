package day7;

public class OneHundredFiftyThree {
    /*

    The method person get a string with this format :
    "name,last name,age"
for example:

person("jon,doe,30");

the output is:

person name: jon last name: doe age: 30

hint: use the split method to split the string
 to a string array where there is a "," char
     */
    public static void main(String[] args) {
        returnProperties("Juma,Gul,20");
    }
    public static void returnProperties(String name){
        String split [] = name.split(",");
        System.out.println("person name: "+ split[0]+" last name: "+ split[1] +" age: "+ split[2]);

    }
}
