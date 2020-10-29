package August.data_type_conversion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LongToString {
    public static void main(String[] args) {
        long number = 5188580090L;
        String  number2= String.valueOf(String.valueOf(number));
        System.out.println(number2);

        float num= 121545;
        String str = String.valueOf(num);
        System.out.println("float to string conversion: "+ str);

        String str2="1245";
        float f = Float.valueOf(str2);
        System.out.println("string to float conversion : "+f);
        float f2 = Float.parseFloat(str2);
        System.out.println("String to float conversion method 2 k: "+ f2);

        String string ="1454545";
        double d = Double.valueOf(string)   ;
        System.out.println("String to double conversion : "+ d);
        
        Date date = Calendar.getInstance().getTime();
        System.out.println("date = " + date);
        String strDate = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(date    );
        System.out.println("strDate = " + strDate);
        Date date2 = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str2Date = dateFormat.format(date2);
        System.out.println("Converted String: " + str2Date);

    }
}
