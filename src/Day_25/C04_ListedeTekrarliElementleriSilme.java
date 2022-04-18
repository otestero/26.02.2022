package Day_25;

import java.util.ArrayList;
import java.util.List;

public class C04_ListedeTekrarliElementleriSilme {
    public static void main(String[] args) {

        //verilen bir listede tekrar eden sayıları sadece bir kere yazdıran
        // bir metot oluşturun
        // Örnek: [1,3,5,3,5,6,1,7]
        // output: [1, 3, 5, 6, 7]

        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

    //  sayilar =tekrarsizListeOlustur(sayilar);
        System.out.println(sayilar);
    }}
