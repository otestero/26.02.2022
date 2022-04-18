package Day_32_DateandTime;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
import java.util.Locale;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate trh= LocalDate.now();
        LocalDate baskaTrh= LocalDate.of(1970,1,18);
        System.out.println(trh);// 2022-03-31
        System.out.println(trh.getDayOfMonth());//31
        System.out.println(trh.getDayOfWeek());//THURSDAY
        System.out.println(trh.getMonthValue());//3
        System.out.println(trh.getYear());// 2022
        System.out.println(trh.minusWeeks(20));// 20 hafta önceki tarihe götürür
        System.out.println(trh.atStartOfDay());// 2022-03-31T00:00
        System.out.println(trh.isLeapYear());// artık yılı gösterir

    }
}
