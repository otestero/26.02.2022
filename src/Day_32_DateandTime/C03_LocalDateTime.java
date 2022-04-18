package Day_32_DateandTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);
        System.out.println(tarihSaat.plusYears(3).plusMonths(5));
    }
}
