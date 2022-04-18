package DENEME;

import java.util.Scanner;

public class SayiToplama {
    public static void main(String[] args) {
            // verilen iki sayiyi toplayip yazdiran bir method olusturalim
//int sayi1= 10;
//int sayi2=20;
        Scanner scan=new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz  :  ");
        Integer sayi1= scan.nextInt();
        System.out.print("ikinci Sayıyı Giriniz   :  ");
        Integer sayi2= scan.nextInt();
        ikiSayiyiTopla (sayi1,sayi2);

        // iki double sayinin toplamini yazdiran bir method olusturalim
        System.out.print("Double Sayınızı Giriniz      : ");
        Double sayi3= scan.nextDouble();
        System.out.print("Double ikinici sayıyı Giriniz: ");
        Double sayi4= scan.nextDouble();
        İkiSayiyiTopla (sayi3, sayi4);

        ikiSayiyiTopla (100,200);
    }

    private static void İkiSayiyiTopla(Double sayi3, Double sayi4) {
        System.out.println("Toplam                 :   " + (sayi3 + sayi4));
    }
    private static void ikiSayiyiTopla(int sayi1, int sayi2) {
        System.out.println("Toplam                 :   " + (sayi1 + sayi2));
    }
}



