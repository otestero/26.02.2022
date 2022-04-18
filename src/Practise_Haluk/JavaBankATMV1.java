package Practise_Haluk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Practise_Haluk.ManavReyonu.scan;

public class JavaBankATMV1 {

    /*
     ATM
         Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
         Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
         Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

         Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.

         Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
         Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali,
         eger değilse menü ekranina geri donsun.
         Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
     */
    public static void main(String[] args) {

        int sayack = 0;
        int sayacs = 0;
        int islemSecme;

        List<Integer> KartNumaralarListesi = new ArrayList<>();
        KartNumaralarListesi.add(11102222);
        KartNumaralarListesi.add(11112222);
        KartNumaralarListesi.add(11122222);
        KartNumaralarListesi.add(11132222);

        List<Integer> sifreListesi = new ArrayList<>();
        sifreListesi.add(0000);
        sifreListesi.add(0001);
        sifreListesi.add(0002);
        sifreListesi.add(0003);

        //*********
        // Ana Menü Listesi
        List<String> yapilacaklarListesi = new ArrayList<>();
        yapilacaklarListesi.add("1. Bakiye sorgulama");
        yapilacaklarListesi.add("2. Para yatırma");
        yapilacaklarListesi.add("3. Para çekme");
        yapilacaklarListesi.add("4. Para gönderme");
        yapilacaklarListesi.add("5. Şifre değiştirme");
        yapilacaklarListesi.add("6. Çıkış");


//*************************
        Scanner scan = new Scanner(System.in);
        System.out.println("Kart numarası ile giriş yapacaksanız 1" + "Şifre ile girecekseniz 2 seçin");
        int girisyontemi = scan.nextInt();

        if (girisyontemi == 1) {
            int girisHakki = 3;
            while (true) {
                System.out.println("*** Hoş geldiniz ***");
                System.out.print("Kart Numaranızı giriniz : ");
                Integer kartnu = scan.nextInt();
                if (KartNumaralarListesi.contains(kartnu)) {
                    // System.out.println("                              *** Ana Menü ***            ");
                    break;
                } else {
                    System.out.println("hatali giris yapildi");
                    girisHakki--;
                    System.out.println("kalan deneme hakkiniz : " + girisHakki);
                    if (girisHakki == 0) {
                        System.out.println("agam hakkin kalmadi bekleme yapma dewamkeee :)");
                        break;
                    }
                }
            }
        }
        System.out.println("Şifre ile giriş için 2 seçin");
        girisyontemi = scan.nextInt();

        // ************  şifre girme ve 3 hak ***********
        if (girisyontemi == 2) {
            int girisHakki = 3;
            while (true) {
                System.out.println("*** Hoş geldiniz ***");
                System.out.println(" Kart şifrenizi giriniz ");
                Integer girilenSifre = scan.nextInt();
                if (sifreListesi.contains(girilenSifre)) {
                    System.out.println("                                  *** Ana Menü ***        ");
                    break;
                } else {
                    System.out.println("hatali giris yapildi");
                    girisHakki--;
                    System.out.println("kalan deneme hakkiniz : " + girisHakki);
                    if (girisHakki == 0) {
                        System.out.println("Banka şubeniz ile görüşün :)");
                        break;
                    }
                }
            }
        }

        System.out.println(yapilacaklarListesi);
        System.out.println("104 Lütfen yapmak istediğiniz işlemin başındaki sayıyı giriniz: ");
        islemSecme = scan.nextInt();

        // ************** MENU ***********
        int bakiye = 100000;
while (true) {
    if (islemSecme == 1) {
        System.out.println("Bakiye Sorgulamayı Seçtiniz");
    } System.out.println("Bakiyeniz: " + bakiye + " TL");
        System.out.println(yapilacaklarListesi);
        System.out.println("114 Lütfen yapmak istediğiniz işlemin başındaki sayıyı giriniz: ");
        islemSecme = scan.nextInt();
    // ilave
    // System.out.println(yapilacaklarListesi);
    // System.out.println("Lütfen yapmak istediğiniz işlemin başındaki sayıyı giriniz: ");
    // islemSecme = scan.nextInt();


    // ********Para Yatırma *******
    if (islemSecme == 2) {
        System.out.println("Para Yatırmayı Seçtiniz");
        System.out.println("125 Bakiyeniz: " + bakiye + " TL");
        scan = new Scanner(System.in);
        System.out.println("Yatırmak istediğiniz mitarı giriniz");
        Integer yatirilacakolan = scan.nextInt();
        System.out.println(yatirilacakolan + " TL yatırmak istiyorsunuz");
        bakiye += yatirilacakolan;
        System.out.println("Yeni bakiyeniz: " + bakiye + "TL");
    }
    //*********************************************
    // ************* PARA ÇEKME İŞLEMİ ************
    if (islemSecme == 3) {
        System.out.println("Para Çekmeyi Seçtiniz");
        System.out.println("Bakiyeniz: " + bakiye + " TL");
        scan = new Scanner(System.in);
        System.out.println("Çekmek istediğiniz mitarı giriniz");
        Integer cekilecekolan = scan.nextInt();
        if (bakiye > cekilecekolan) {
            System.out.println(cekilecekolan + " TL çekmek istiyorsunuz");
            bakiye -= cekilecekolan;
            System.out.println("Yeni bakiyeniz: " + bakiye + "TL");
        } else System.out.println("Bakiyeniz yeterli değildir.");
    }   //System.out.println(yapilacaklarListesi);
       // System.out.println("152 Lütfen yapmak istediğiniz işlemin başındaki sayıyı giriniz: ");
       // islemSecme = scan.nextInt();

    // *********** PARA GÖNDERME **************
    if (islemSecme == 4) {
        System.out.println("Para Göndermeyi Seçtiniz");
        System.out.println("Bakiyeniz: " + bakiye + " TL");

        scan = new Scanner(System.in);
        System.out.print("Alıcı IBAN Başında TR olarak giriniz : ");
        String AliciIBAN = scan.nextLine();

        if (AliciIBAN.substring(0, 2).equals("TR") && AliciIBAN.length() == 26) {
            System.out.println(AliciIBAN.substring(0, 2) + "***********************");
            System.out.println("IBAN numaranız doğrudur");
            scan = new Scanner(System.in);
            System.out.println("Göndermek istediğiniz mitarı giriniz");
            Integer gonderilecekolan = scan.nextInt();
            if (bakiye > gonderilecekolan) {
                System.out.println(gonderilecekolan + " TL gönderildi");
                bakiye -= gonderilecekolan;
                System.out.println("Yeni bakiyeniz: " + bakiye + "TL");
            } else System.out.println("Bakiyeniz yeterli değildir.");
        } else {
            System.out.println("IBAN TR ile Başlamalıdır.");
        System.out.println("IBAN numarasını yanlış girdiniz");}

       // System.out.println(yapilacaklarListesi);
       // System.out.println("194 Lütfen yapmak istediğiniz işlemin başındaki sayıyı giriniz: ");
       // islemSecme = scan.nextInt();

                }
            }

        }

    }






