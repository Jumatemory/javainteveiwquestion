package September11;

public class XyzThere {
    public static void main(String[] args) {
        System.out.println(xyzThere("xyz"));
    }

    public static int xyzThere(String str) {
    int counter =0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i,i+2).equalsIgnoreCase("xyz"));
            counter++;
        }
        return counter;
    }
}
