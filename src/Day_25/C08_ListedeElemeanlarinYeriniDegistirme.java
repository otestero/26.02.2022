package Day_25;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedeElemeanlarinYeriniDegistirme {
    public static void main(String[] args) {
        //verilen bir listede istenen iki indexteki elementlerin yerini
        // kalıcı olarak değiştiren bir metot oluşturun

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        int ilkindex=2;
        int ikinciindex=5;

        sayilar=swapElement(sayilar,ilkindex,ilkindex);


    }

    public static List<Integer> swapElement(List<Integer> sayilar, int ilkindex, int ilkindex1) {
   // bir tam sayi oluşturup
        // verilen indeklserdeki sayıların yer değiştirin
        // indexxleri kontrol edip sınırın otesindeyse uyarı mesajı verin


   return sayilar;
    }
}
