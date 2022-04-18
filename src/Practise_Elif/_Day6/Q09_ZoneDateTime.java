package Practise_Elif._Day6;

import com.sun.security.auth.module.UnixSystem;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.time.chrono.JapaneseEra;

public class Q09_ZoneDateTime {
    private static ZonedDateTime now;

    public static void main(String[] args) {
  // Baska ülke veya bolgelerin saat dilimine gore zamani alma
        // Newyork un saat dilimine gore saat ?

        ZonedDateTime bgun= ZonedDateTime.now();
        System.out.println(bgun);
         bgun= ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("bgun = " + bgun);

    }
}
