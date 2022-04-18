package Day_25;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        // verilen bir arraydan istenen elementi silip kalanları
        // yeni bir array olarak yazdıran bir metod oluşturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyeneleman=3;
        istenmeyenElement(arr,istenmeyeneleman);


    }
    public static void istenmeyenElement(int[] arr, int istenmeyeneleman) {
        // 1. adım istenemeyen element sayısını bulalım
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==istenmeyeneleman){
                sayac++;
            }
        }
// 2. adım yeni arrayi oluşturalım
        int arryeni[]=new int[arr.length-sayac];
        // 3. adım eski arrayden uygun elementleri yeniye taşı
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=istenmeyeneleman){
                arryeni[index]=arr[i];
                index++;
            }

        }
        // 4. adım yeni arrayı Listeyi yazdırmak
        System.out.println(Arrays.toString(arryeni)); // [4, 2, 5, 7, 8, 5, 2, 4]



    }
}
