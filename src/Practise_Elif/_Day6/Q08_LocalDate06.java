package Practise_Elif._Day6;

import javax.print.attribute.standard.MediaSize;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Q08_LocalDate06 {
    public static void main(String[] args) {
        // Bugunun tarihi aliniz, yazdiriniz...
        // Daha Sonra 1 gun, 1 Ay ve 1 yil ekleyerek degisen tarihi yazdiriniz..
        // Degisen tarih uzerinden 3 gun, 2 ay ve 5 yil eksilterek son tarihi yaziniz..

        LocalDate bugun=LocalDate.now();
        System.out.println(bugun);
        bugun=bugun.plusDays(1);
        bugun=bugun.plusMonths(1);
        bugun=bugun.plusYears(1);
        LocalDate degısenTarih=bugun.plusDays(1).plusMonths(1).plusYears(1);
        System.out.println("degısenTarih = " + degısenTarih);
        System.out.println(bugun);

        bugun=bugun.minusYears(5);
        bugun=bugun.minusMonths(2);
        bugun=bugun.minusDays(3);
        LocalDate sontarih=degısenTarih.plusDays(3).plusMonths(2).plusYears(5);
        System.out.println("sontarih = " + sontarih);
        System.out.println(bugun);


    }
}
