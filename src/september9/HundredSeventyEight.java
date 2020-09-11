package september9;



public class HundredSeventyEight {
    public static void main(String[] args) {
        System.out.println(mergeStrings("java", "selenium"));
    }

    public static String  mergeStrings(String one, String two) {
       String oneMore = one+",";

       char str1 [] = oneMore.toCharArray();
       char str2[] = two.toCharArray();
        String merge [] = new String[str1.length+str2.length];
        String twoArr ="";
        String str2Con="";
        String str1Con="";
        String f="";
        if (str1.length<str2.length){
            for (int i = 0; i < str1.length; i++) {
                twoArr += ""+ str1[i]+str2[i];
            }
            for (int i = str1.length; i < str2.length; i++) {
                str2Con+= str2[i];
            }
        } else if (str1.length>str2.length){
            for (int i = 0; i < str2.length; i++) {
                twoArr += ""+ str1[i]+str2[i];
            }

            for (int i = str2.length; i < str1.length; i++) {
                str1Con+= str1[i];
            }

            String con = twoArr +""+ str1Con;
            String con2 = con.replace(","," ");
            return con2;
        }

     String con3 =  twoArr +""+  str2Con.substring(0,str2Con.length());
        String con4 = con3.replace(",","");
        return con4;

    }
}

