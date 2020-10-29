package August.data_type_conversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ConvertStringToDate {

    public static void main(String[] args) throws ParseException {
        String strDate ="31/12/1998";
       Date date = new SimpleDateFormat("yyyy/MM/dd").parse(strDate);
        System.out.println("date = " + date);

        int intNumber = 12;
        long longNumber = intNumber;

        intNumber = (int) longNumber;
        
        char c ='1';
        int num = Character.getNumericValue(c);
        System.out.println("num = " + num);
        
        int i = 15;
        char chars = Character.forDigit(i, 16);
        System.out.println("chars = " + chars);
        System.out.println(" getting date with anonymous object:  " +new Date().getTime());

       Date sDate = Calendar.getInstance().getTime();

    }
}
