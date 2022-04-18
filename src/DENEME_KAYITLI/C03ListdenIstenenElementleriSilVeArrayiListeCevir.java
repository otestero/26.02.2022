package DENEME_KAYITLI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03ListdenIstenenElementleriSilVeArrayiListeCevir {
    public static void main(String[] args) {
        // verilen bir array'den istenen elementi(kac tane varsa) silip, kalanlari
        // yeni bir array olarak yazdiran bir method olusturun

        int arr[] = {3, 4, 2, 3, 5, 7, 3, 8, 5, 2, 4};
        int istenmeyensayilar = 3;
        istenmeyenelemntiSilveYazdir(arr, istenmeyensayilar);
    }
    public static void istenmeyenelemntiSilveYazdir(int[] arr, int istenmeyensayilar) {
        List<Integer> yeniList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != istenmeyensayilar) {
                yeniList.add(arr[i]);
            }
        }
        System.out.println(yeniList);
    }
}
