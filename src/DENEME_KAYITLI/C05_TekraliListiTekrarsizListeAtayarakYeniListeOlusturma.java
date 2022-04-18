package DENEME_KAYITLI;

import java.util.ArrayList;
import java.util.List;

public class C05_TekraliListiTekrarsizListeAtayarakYeniListeOlusturma {
    public static void main(String[] args) {
        // verilen bir listede tekrar eden sayilari sadece 1 tane yapan
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7] bu listi
        // output [1, 3, 5, 6, 7] bu hale dönüştürün

        List<Integer> verilenler = new ArrayList<>();
        verilenler.add(1);
        verilenler.add(3);
        verilenler.add(5);
        verilenler.add(3);
        verilenler.add(5);
        verilenler.add(6);
        verilenler.add(1);
        verilenler.add(7);
        verilenler = elementleriTekrarEtmeyenListeOlustur(verilenler);
        System.out.println(verilenler);
    }
    public static List<Integer> elementleriTekrarEtmeyenListeOlustur(List<Integer> verilenler) {
        List<Integer> tekrarsizList = new ArrayList<>();
        for (int i = 0; i < verilenler.size(); i++) {
            if (!tekrarsizList.contains(verilenler.get(i))) {
                tekrarsizList.add(verilenler.get(i));
            }
        }
        return tekrarsizList;
    }
}