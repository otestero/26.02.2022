package DENEME_KAYITLI;

import java.util.ArrayList;
import java.util.List;

public class C07_ListekiOrtalamainUstundekiElementSayisiniBulma {
    public static void main(String[] args) {
        // bir listede ortalamanin ustunde olan element sayisini bulunuz
        List<Double> notlar = new ArrayList<>();
        notlar.add(1.0);
        notlar.add(3.0);
        notlar.add(5.0);
        notlar.add(3.0);
        notlar.add(5.0);
        notlar.add(6.0);
        notlar.add(1.0);
        notlar.add(7.0);
        System.out.println("notlar = " + notlar); // [1.0, 3.0, 5.0, 3.0, 5.0, 6.0, 1.0, 7.0]

        // 1.adım toplamı bul
        // 2. adım ortalamayı bul
        // 3. adım notlarla ortalamayı karşılaştır
        // 4. adım ortalamaın üstündeki notları yazdır

        double nottoplami = 0;
        double notOrtalamasi = 0;
        //nottoplamı= notlar.get(0)+ notlar.get(1)+notlar.get(2)+notlar.get(3);
        for (int i = 0; i < notlar.size(); i++) {
            nottoplami += notlar.get(i);              // nottoplami = 31.0
            notOrtalamasi = nottoplami / notlar.size(); //notOrtalamasi = 3.875
        }
            List<Double> ortalamaUstuNotlar=new ArrayList<>();
        for (int i = 0; i < notlar.size(); i++) {

             if (notlar.get(i) > notOrtalamasi) {
                ortalamaUstuNotlar.add(notlar.get(i));
            }
        }  System.out.println("nottoplami         = " + nottoplami); // 31.0
           System.out.println("notOrtalamasi      = " + notOrtalamasi); //3.875
           System.out.println("ortalamaUstuNotlar = " + ortalamaUstuNotlar); // [5.0, 5.0, 6.0, 7.0]
    }
}

