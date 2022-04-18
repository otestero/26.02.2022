package Day_32_DateandTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_İkiTarihArasiniBulma {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        LocalDate dogumgunu=LocalDate.of(2010,12,04);
        System.out.println(Period.between(dogumgunu,bugun)); //P11Y3M27D
        System.out.println(Period.between(dogumgunu,bugun).getDays());//27
        System.out.println(Period.between(dogumgunu,bugun).getYears());//11
        // FIXME: 31.03.2022
    }
}
