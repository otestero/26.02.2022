package Practise_Haluk_10_List.Practise_10_List;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaBankATM {
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

// ************ Kart numarası ***************
        Scanner scan = new Scanner(System.in);
        System.out.println("Kart numarası ile giriş yapacaksanıa 1" + "Şifre ile girecekseniz 2 seçin");
        int girisyontemi = scan.nextInt();

        if (girisyontemi == 1) {
            scan = new Scanner(System.in);
            System.out.println("Kart numaranızı giriniz");
            Integer kartnu = scan.nextInt();
            sayack++;
            while (!KartNumaralarListesi.contains(kartnu)) {
                System.out.println("Kart numaranız yanlış girdiniz. Tekrar Giriniz ");break;
            }kartnu = scan.nextInt();
            System.out.println("55 Kart numaranız yanlış girdiniz. Tekrar Giriniz ");


        }System.out.println(sayack + 1 + "kere yanlış girdiniz Kartınız bloke edilmiştir. \n Müşteri Temsilcisi ile görüşün");

        if (girisyontemi == 2) {
                //  ********* Kart Şifresi Girme **********
                scan = new Scanner(System.in);
                System.out.println("Kart şifrenizi giriniz");
                Integer girilenSifre = scan.nextInt();

                while (!sifreListesi.contains(girilenSifre)) {
                    System.out.println("Şifrenizi yanlış girdiniz");
                    Integer kartnu = scan.nextInt();
                    sayacs++;
                    System.out.println(sayacs);
                    if (sayacs == 3) {
                        System.out.println("Kartınız bloke edilmiştir. \n Müşteri Temsilcisi ile görüşün"); break;
                    }else;

                }
            }

            // Ana Menü Listesi
            List<String> yapilacaklarListesi = new ArrayList<>();
            yapilacaklarListesi.add("1. Bakiye sorgulama");
            yapilacaklarListesi.add("2. Para yatırma");
            yapilacaklarListesi.add("3. Para çekme");
            yapilacaklarListesi.add("4. Para gönderme");
            yapilacaklarListesi.add("5. Şifre değiştirme");
            yapilacaklarListesi.add("6. Çıkış");

            // *********Ana Menüyü Çağırma ************
            //System.out.println("Ana Menü gitmek için lütfen 0 basınız");
            // scan = new Scanner(System.in);
            //  int AnaMenu = scan.nextInt();
            //if (AnaMenu == 0) {
            System.out.println(yapilacaklarListesi);
            System.out.println("Lütfen yapmak istediğiniz işlemin başındaki sayıyı giriniz: ");
            islemSecme = scan.nextInt();

            //  System.out.println(yapilacaklarListesi);
            //  System.out.println("Lütfen yapmak istediğiniz işlemin başındaki sayıyı giriniz: ");

            // islemSecme = scan.nextInt();
            int bakiye = 100000;
            if (islemSecme == 1) {
                System.out.println("Bakiye Sorgulamayı Seçtiniz");
                System.out.println("Bakiyeniz: " + bakiye + " TL");
            }

            // ********Para Yatırma *******
            if (islemSecme == 2) {
                System.out.println("Para Yatırmayı Seçtiniz");
                System.out.println("Bakiyeniz: " + bakiye + " TL");
                scan = new Scanner(System.in);
                System.out.println("Yatırmak istediğiniz mitarı giriniz");
                Integer yatirilacakolan = scan.nextInt();
                System.out.println(yatirilacakolan + " TL yatırmak istiyorsunuz");
                bakiye += yatirilacakolan;
                System.out.println("Yeni bakiyeniz: " + bakiye + "TL");
            }


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
            }

            // *********** PARA GÖNDERME **************
            if (islemSecme == 4) {
                System.out.println("Para Göndermeyi Seçtiniz");
                System.out.println("Bakiyeniz: " + bakiye + " TL");
                scan = new Scanner(System.in);
                System.out.println("Göndermek istediğiniz mitarı giriniz");
                Integer gonderilecekolan = scan.nextInt();
                scan = new Scanner(System.in);
                System.out.print("Alıcı IBAN Başında TR olarak giriniz : ");
                String AliciIBAN = scan.nextLine();
                if (AliciIBAN.substring(0, 2).equals("TR")) {
                    System.out.println(AliciIBAN.substring(0, 2) + "***********************");
                } else {
                    System.out.println("IBAN TR ile Başlamalıdır.");
                }
                if (AliciIBAN.length() == 26) {
                    System.out.println("IBAN numaranız doğrudur");
                } else {
                    System.out.println("IBAN numarasını yanlış girdiniz");
                }
            }
        }
    }















       /* int girişHakki = 2;
        System.out.println("*** Hoş geldiniz ***");
        while (true) {
            System.out.println(" Kart şifrenizi giriniz ");
            int girilenSifre = scan.nextInt();

            if (sifreListesi.equals(girilenSifre)) {
                System.out.println("Başarılı giriş yaptınız..");
                break;
            } else {
                System.out.println("Yanlış giriş yaptınız");
                girişHakki--;
                System.out.println("kalan giriş hakkınız : " + girişHakki);
            }
            if (girişHakki == 0) {
                System.out.println("giriş hakkı kalmadı kartınız bloke oldu");
                break;*/




