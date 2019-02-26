//Write a program to display times in different country format.
package collections;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeZoneFormat {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        System.out.println("Date is: " + date.toString());

        Locale japan = new Locale(Locale.JAPAN.getLanguage(), Locale.JAPAN.getCountry());
        Locale us = new Locale(Locale.US.getLanguage(), Locale.US.getCountry());
        Locale china = new Locale(Locale.CHINA.getLanguage(), Locale.CHINA.getCountry());
        Locale german = new Locale(Locale.GERMAN.getLanguage(), Locale.GERMAN.getCountry());

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, japan);
        System.out.println("Japan: " + dateFormat.format(date));

        DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.FULL, us);
        System.out.println("United States: " + dateFormat1.format(date));

        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.FULL, china);
        System.out.println("China: " + dateFormat2.format(date));

        DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.FULL, german);
        System.out.println("Germany: " + dateFormat3.format(date));

    }
}
