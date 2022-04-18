package Practise_Elif._Day05;

import java.util.Scanner;

public class Instance_Variable {
    /*
 * - Main method icerisinde bir ogrenciye ait variable’lar olusturun ve bu
 * variable’lara atama yapin
 *
 * - isimDegistir adinda bir method olusturun, parametre olarak ogrenci
 * bilgilerini alsin ve methodun icinde tum bilgileri degistirip, yeni bilgileri
 * yazdirsin
 *
 * - Main method icinde isimDegistir methodunu cagirdigimiz satirin hemen
 * sonrasinda yeniden ogrenci bilgilerini yazdirin
 *
 * -Soyisimdegistir isminde bir method olusturun, bu method parametre olarak "soyisim"
 * variable'ini alsin. method'un icinde kullaniciya yeni soyisim girmesini istesin ve
 * eski soyismi degistirsin.
 *
 * Not :Instance variable'lar object'lere aittir ve diger adi object variable'dir
 */
    public static void main(String[] args) {//variableler oluştu ve atama yapıldı
        String ogrenciisim="Ali";
        String ogrencisoyisim="Can";
        String tel="123456789";

        isimdegistir(ogrenciisim, ogrencisoyisim,tel); // metot oluşturduk
        System.out.println("ogrenciisim: "  + ogrenciisim + " soyisim : " + ogrencisoyisim + "tel : "+ tel);

        soyisimdegistir(ogrencisoyisim);
        ogrencisoyisim=soyisimdegistir(ogrencisoyisim);
        System.out.println("isim: " + ogrenciisim + "soyisim : " + ogrencisoyisim + "tel :"+ tel);

    }
    private static String soyisimdegistir(String ogrencisoyisim) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Yeni Soyismi gir:");
        String yenisoyismi= scan.nextLine();
        return yenisoyismi;
    }

    public static void isimdegistir(String ogrenciisim, String ogrencisoyisim, String tel) {
        ogrenciisim="Mehmet";
        ogrencisoyisim= "bulut";
        tel="987654321";
        System.out.println("ogrenciisim: "  + ogrenciisim + " soyisim : " + ogrencisoyisim + "tel : "+ tel);

    }
}
