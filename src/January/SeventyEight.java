package January;

public class SeventyEight {
    public static void main(String[] args) {
        /*
        We have a message variable already declared and assigned value in this format

Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

Variables are already declared:

sender, phoneNumber, messageBody
- by using String methods:
retrieve related information from SMSmessage string and assign to those 3 variables.
-print each variable in separate line

***********************
Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
         */
        String sentence ="Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
         int firstDiamond=sentence.indexOf("<");
         int secondDiamond = sentence.indexOf(">");
        System.out.println("Sender:" + sentence.substring(firstDiamond+1, secondDiamond));
        int firstBracket=sentence.indexOf("[");
        int secondBracket = sentence.indexOf("]");
        System.out.println("Phone Number: "+ sentence.substring(firstBracket+1, secondBracket));





    }
}
