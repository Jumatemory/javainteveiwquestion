package September.Septermber10;

public class HundredEighty {
    public static void main(String[] args) {

        System.out.println(reverse("love"));
        System.out.println(coverString("apples", "pears"));

    }
    public static String coverString(String main, String coverME) {
        if (!main.contains(coverME)){

            return "["+ main+"]";
        }
        int indexOfCoverMe = main.indexOf(coverME);
        String holder = main;
        String sub = main.substring(indexOfCoverMe,indexOfCoverMe+coverME.length());
        String replacement ="["+ sub +"]";
        String juma ="";
        System.out.println(main.contains(coverME));
    if (main.contains(coverME)){
       juma=  main.replaceAll(sub, replacement);
        }

    return juma;
    }
    public static String reverse(String input)
    {
        String str = " ";
        for (int i = input.length()-1; i >=0; i--) {
            str += input.charAt(i);
        }
        System.out.println(str);

        return str.trim();
    }
}
