package Day_32_DateandTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        LocalTime lt=LocalTime.now();
        System.out.println(lt);

        int sayi=0;
        for (int i = 0; i < 10; i++) {
            sayi+=i;
        }
        LocalTime ltLoopSonrasi=LocalTime.now();
        System.out.println(ltLoopSonrasi);//22:15:08.062322500
        double nano1=lt.getNano();
        double nano2= ltLoopSonrasi.getNano();
        System.out.println("işlem " + (nano2-nano1)+ "nano saniyede bitti");
        System.out.println(lt.plusMinutes(1000));

    }
}
