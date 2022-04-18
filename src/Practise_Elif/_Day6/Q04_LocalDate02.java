package Practise_Elif._Day6;

import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static java.util.Calendar.JUNE;

public class Q04_LocalDate02 {
    public static void main(String[] args) {
        String date = LocalDate.of(2014,6,21).format(DateTimeFormatter.ISO_LOCAL_DATE);
        String date1 = LocalDate.of(2014,5,21).format(DateTimeFormatter.ISO_LOCAL_DATE);
        String date3 = LocalDate.of(2014, Month.JUNE, 21).format(DateTimeFormatter.ofPattern("MM d, yyyy"));
        System.out.println(date);
        System.out.println(date1);
        System.out.println(date3);
      // String date4= new LocaleD(2014,5,21);

    }

    /*
           Which of the following can be inserted into the blank to create a date of June 21, 2014?
           21 Haziran 2014 tarihini olusturmak için bos bırakılan yere asagidakilerden hangisi veya hangileri getirilebilir?
           A. new LocalDate(2014, 5, 21);
           B. new LocalDate(2014, 6, 21);
           C. LocalDate.of(2014, 5, 21);
           D. LocalDate.of(2014, 6, 21);
           F. LocalDate.of(2014, Month.JUNE, 21);
         */
}
