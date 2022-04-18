package GeometrikSekiller;

import java.util.Scanner;
import java.util.concurrent.Callable;

import static GeometrikSekiller.Cember.*;
import static GeometrikSekiller.Hesaplamalar.CemberAlanCevreHesapla;
import static GeometrikSekiller.Hesaplamalar.DikdortgenAlanCevreHesapla;
import static GeometrikSekiller.Kare.Kkenari;

public class Main {

    public static void main(String[] args) {
        /*
    1-asagidaki hiyarasiye gore classlar creat ediniz...

     sekil <--Cember
     sekil <--Dikdortgen<--Kare

    2- Turetilen class'a uygun olanlarina yaricap,  uzunluk ve genislik veriable'ler ekleyiniz.
    3- Runner class'da  Cember Dikdortgen Kare alan ve cevre hesaplamasi yaptirip sonuclari yazdiriniz.

*/
  boolean cikilsinMi = false;
        while (!cikilsinMi) {
            Scanner scan = new Scanner(System.in);
            System.out.println("********************           Menu          ***********************  " );
            System.out.print("Lütfen Çember için: 1, Kare için: 2, Dikdörtgen için: 3, Çıkış için: 4 'e basın");
            System.out.println("");
            System.out.print("İşleminizi seçiniz:    ");
            int islem = scan.nextInt();
            switch (islem) {
                case 1:
                   CemberAlanCevreHesapla(yaricap,pi); // kişi list'i değerini; "yeniKayıt"  objesi ile "kayıtAl" method call yaparak alıyor
                    break;
                case 2:
                    Hesaplamalar.KareAlanCevreHesapla(Kkenari); // yenikayıt objesi ile "sanslıkullanıcı" metodunu call ediyoruz.
                    break;
                case 3:
                  DikdortgenAlanCevreHesapla(dikdortgen.kisakenar, dikdortgen.uzunkenar);
                    break;
                case 4:
                    cikilsinMi = true;
                    break;
                default:
                    System.out.println("hatalı veri girdiniz");
                    break;

            }
        }
    }
}
