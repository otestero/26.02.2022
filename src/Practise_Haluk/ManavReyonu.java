package Practise_Haluk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManavReyonu {
    static List<String> urunListesi   = new ArrayList<String>();
    static List<Double> urunFiyatlari = new ArrayList<Double>();
    static Scanner scan=new Scanner(System.in);
    static double toplamOdeme=0;

    public static void main(String[] args) {
        /*
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         *            istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         *            Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
        urunListesi.add("domates - urun kodu   : 0");
        urunListesi.add("Muz - Ürün Kodu       : 1");
        urunListesi.add("Elma - Ürün Kodu      : 2");
        urunListesi.add("Erik - Ürün Kodu      : 3");
        urunListesi.add("Çilek - Ürün Kodu     : 4");

        urunFiyatlari.add(15.0);
        urunFiyatlari.add(18.0);
        urunFiyatlari.add(8.0) ;
        urunFiyatlari.add(47.0);
        urunFiyatlari.add(27.0);
        musterisecimi();
        //System.out.println("urunListesi = " + urunListesi);[domates - urun kodu : 0, Muz - Ürün Kodu : 1
        //System.out.println("urunFiyatlari = " + urunFiyatlari); [15.0, 18.0, 8.0, 47.0, 27.0]

    }

    public static void musterisecimi() {
        System.out.print("Seçtiğiniz Ürün Kodunu Giriniz :  ");
        int secim   = scan.nextInt();
        System.out.print("Kaç kg alacaksınız             :  ");
        double kilog= scan.nextDouble();
        double urunTutari=kilog*urunFiyatlari.get(secim);
        toplamOdeme+=urunTutari;
        System.out.print("Devam Etmek İstiyorsanız 1," +
                         " Kasa için 2 seçiniz   : ");
        int devamet= scan.nextInt();
        if (devamet==1){
            musterisecimi();
        }else
            kasa();

    }

    public static void kasa() {
        System.out.println("Tekrar Bakleriz Ödemeniz gereken Tutar ; "+ toplamOdeme);
    }
}
