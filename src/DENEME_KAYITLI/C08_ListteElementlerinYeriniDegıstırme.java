package DENEME_KAYITLI;

import java.util.ArrayList;
import java.util.List;

public class C08_ListteElementlerinYeriniDegıstırme {
    public static void main(String[] args) {
        // Verilen bir listede, istenen iki index'deki elementlerin yerini
        // kalici olarak degistiren bir method olusturun
        List<Integer>sayilar =new ArrayList<>();
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(7);
        sayilar.add(8);
        sayilar.add(9);
        sayilar.add(10);

        // 1. adım değiştşrşlecek olan iki indeksi tanımla
        //2. yerlerini değiştir
        // 3. adım yeni liste oluştur

        int ilkindex=5;
        int ikinciindex =9;

        swapElements(sayilar,ilkindex,ikinciindex);


    }

    public static void swapElements(List<Integer> sayilar, int ilkindex, int ikinciindex) {

        System.out.println("sayilar = " + sayilar);
    }
}
