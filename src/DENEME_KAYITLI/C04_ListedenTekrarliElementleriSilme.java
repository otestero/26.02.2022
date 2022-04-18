package DENEME_KAYITLI;

import java.util.ArrayList;
import java.util.List;

public class C04_ListedenTekrarliElementleriSilme {
    public static void main(String[] args) {
        // verilen bir listede tekrar eden sayilari sadece 1 kere yazdiran
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7]
        // output [1, 3, 5, 6, 7]

        List<Integer> verilenler = new ArrayList<>();
        verilenler.add(1);
        verilenler.add(3);
        verilenler.add(5);
        verilenler.add(3);
        verilenler.add(5);
        verilenler.add(6);
        verilenler.add(1);
        verilenler.add(7);
        elementleriTekrarEtmeyenListeOlustur(verilenler);
        System.out.println(verilenler); //[1, 3, 5, 3, 5, 6, 1, 7]
    }

    public static void elementleriTekrarEtmeyenListeOlustur(List<Integer> verilenler) {
        List<Integer> tekrarsizListesi = new ArrayList<>();
        for (int i = 0; i < verilenler.size(); i++) {
            if (!tekrarsizListesi.contains(verilenler.get(i))) {
                // i verilenlerin uzunluğundan küçük ise
                // verilenlerin i inci elementini çağır tekrarsız listesinin containsinde yok ise
                // tekrarsizlistesine verilenle listesinden i inci elementi çağır ve ekle.
                tekrarsizListesi.add(verilenler.get(i));
            }
        }
        System.out.println(tekrarsizListesi);
    }
}

