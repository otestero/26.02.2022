package Day_25;

import java.util.ArrayList;
import java.util.List;

public class C07_List {
    public static void main(String[] args) {
        // bir listede ortalmaın üstünde olan element sayısını bulunuz.
        List<Double> sayilar = new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0);


        // 1. adım ortalamayı bul
        double ortalama=0.0;
        Double toplam  =0.0;

        for (int i = 0; i < sayilar.size(); i++) {
            toplam+=sayilar.get(i);

            ortalama=toplam/sayilar.size();
            System.out.println(ortalama); // 3,875

        }

       // 2. adım ortlamanın üsütünde olanları bir liste at
List<Double>ortalamaninÜstündekiler=new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            if (sayilar.get(i)>ortalama){
                ortalamaninÜstündekiler.add(sayilar.get(i));
            }

        }
        System.out.println(ortalamaninÜstündekiler);


    }
}
