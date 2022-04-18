package Practise_Elif._Day05;

import java.util.Scanner;

public class InstanceVariable {
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
    public static void main(String[] args) {
      //  1. Adım

        String OgrenciIsmi="Ali";
        String OgrenciSoyisim="Canay";
        String OrenciNu="1500";

        isimDegistir(OgrenciIsmi,OgrenciSoyisim,OrenciNu); //methot
        System.out.println("OgrenciIsmi    = " + OgrenciIsmi);
        System.out.println("OgrenciSoyisim = " + OgrenciSoyisim);
        System.out.println("OrenciNu       = " + OrenciNu);

        Soyisimdegistir(OgrenciSoyisim);
        OgrenciSoyisim=Soyisimdegistir(OgrenciSoyisim);
        System.out.println("OgrenciIsmi = " + OgrenciIsmi);
        System.out.println("OgrenciSoyisim = " + OgrenciSoyisim);
        System.out.println("OrenciNu = " + OrenciNu);

    }

    private static String Soyisimdegistir(String OgrenciSoyisim) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Yeni bir soyisim girin");
        String girilensoyisim= scan.nextLine();
        return girilensoyisim;


    }

    // 2. adım methodun icinde tum bilgileri degistirip, yeni bilgileri
//    yazdirsin
    private static void isimDegistir(String OgrenciIsmi, String OgrenciSoyisim,String OrenciNu){
      OgrenciIsmi   =OgrenciIsmi.replace("Ali","Veli");
      OgrenciSoyisim=OgrenciSoyisim.replace("Canay", "Kanay");
      OrenciNu      = OrenciNu.replace("1500", "2500");
        System.out.println("OgrenciIsmi    = " + OgrenciIsmi);
       System.out.println("OgrenciSoyisim = " + OgrenciSoyisim);
       System.out.println("OrenciNu       = " + OrenciNu);

        }

    }

