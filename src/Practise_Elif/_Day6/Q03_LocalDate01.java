package Practise_Elif._Day6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q03_LocalDate01 {
    public static void main(String[] args) {

        String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
     /* B) 2014-05-04T00:00:00:000
         *
         * C) 5/4/14T00:00:00:000
         *
         * D) An exception is throw at runtime
         */
    }
}
