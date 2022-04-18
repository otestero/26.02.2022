package DENEME_KAYITLI;

import java.util.Arrays;

public class C02_ArraydenElementSilipKalaniYazdirma {
    public static void main(String[] args) {
        // verilen bir array'den istenen elementi(kac tane varsa) silip, kalanlari
        // yeni bir array olarak yazdiran bir method olusturun
        int arr[]={1,2,3,4,1,2,2,3,6};
        int istenmeyensayi=1;

        istenmeyensayiyisil(arr,istenmeyensayi);

    }

    public static void istenmeyensayiyisil(int[] arr, int istenmeyensayi) {
        // 1. adım istenmeyen element sayısını bul
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==istenmeyensayi ) {
                sayac++;
            }
        }
        // 2. adım istenmeyen sayıların olmadığı yeni arrayı oluştur
        int arrYeni[]=new int[arr.length-sayac];
        System.out.println(Arrays.toString(arrYeni)); //[0, 0, 0, 0, 0, 0, 0, 0]

        // 3. adım eski arraydan istediğimiz haricindeki elementleri taşıayalım

        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=istenmeyensayi){ // int arr[]={1,2,3,4,1,2,2,3,6};
                                             //System.out.println(index);
                                           // System.out.println(arr[i]);
                arrYeni[index]=arr[i];
                index++;
            }


        }//System.out.println(index);
        // 4. adım yeni arrayı yazdıralaım
        System.out.println(Arrays.toString(arrYeni)); //[1, 3, 4, 1, 3, 6]
    }
}
