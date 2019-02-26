package collections;
//Write a program to format date as example "21-March-2016"

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {

    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MMMMM-yyyy");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }

}
