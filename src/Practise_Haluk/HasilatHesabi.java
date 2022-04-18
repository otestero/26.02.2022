package Practise_Haluk;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HasilatHesabi {
    public static void main(String[] args) {
        /*
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *            ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *            ortalama kazançtan aşağıysa o günleri return yap.
         * */
        // 1. adım
        List<String> gunler = new ArrayList<>();
        gunler.add("Pazartesi");
        gunler.add("Salı");
        gunler.add("Çarşamba");
        gunler.add("Perşambe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");

// 2. adım
        List<Double> gunlukKazanclar = new ArrayList<>();
        int gun = 0;
        double ciro=0;
        double ortalamakazanc=0;
        Scanner scan = new Scanner(System.in);
        while (gun < 7) {
            System.out.println(gunler.get(gun) + "Günün kazancını giriniz :   ");
            double gunlukHasılat = scan.nextDouble();
            gunlukKazanclar.add(gunlukHasılat);
            ciro+=gunlukHasılat; gun++;
            ortalamakazanc=(ciro/7);

            String oukg="";
            for (int i = 0; i < gunlukKazanclar.size(); i++) {
                if (ortalamakazanc<gunlukHasılat){oukg+=gunler.get(i);
            }
        }System.out.println("ciro = " + ciro);
        System.out.println("ortalamakazanc = " + ortalamakazanc);
            System.out.println(oukg);
    }

    }}


