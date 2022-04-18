package Day_32_DateandTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormator {
    public static void main(String[] args) {
        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat); //2022-03-31T22:39:28.481594200
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/M/YYYY");//31/3/2022
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/YYYY");//31/03/2022
        System.out.println(formatter.format(tarihSaat));
        System.out.println(formatter1.format(tarihSaat));

        DateTimeFormatter formatterSaat=DateTimeFormatter.ofPattern("h : mm  a");
        System.out.println(formatterSaat.format(tarihSaat));
        int sayac=3;



    }
}