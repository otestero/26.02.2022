package day49_maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class dene1 {
    public static void main(String[] args) {
        // Sinif listesini duzenli bir sekilde yazdirmak
        Map<Integer, String> sinif = MapOlustur.myMap();
        System.out.println(sinif);
        sinifListYazdir(sinif);
    }

    public static void sinifListYazdir(Map<Integer, String> sinif) {
        System.out.println("Numara  Isim   Soyisim  Brans");
        System.out.println("=============================");

        Set<Integer> keySet = sinif.keySet();
        Collection<String> valueSet = sinif.values();
        System.out.println(keySet+"\n");
        for (Integer each:keySet
        ) {
            System.out.println();

        }
        System.out.println(valueSet);
        System.out.println(valueSet.size());
        for (String each: valueSet
        ) {
            System.out.printf("%10s \n ",keySet);System.out.println(each);
        }

    }
}
