package DENEME;

import java.util.Scanner;

public class SifreKontroluV1 {
    public static void main(String[] args) {
        //Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa
        // “Sifre basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //    - Ilk harf buyuk harf olmali
        //    - Son harf kucuk harf olmali
        //    - Sifre bosluk icermemeli
        //    - Sifre uzunlugu en az 8 karakter olmali


        // 1. adım: Kullanicidan bir sifre girmesini isteyin.
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Şifrenizi Oluşturun");
        String yenisifre= scan.next();

        // 2. adım:  ilk harf buyuk harf olmali

      boolean ilkharf= false;
        if (yenisifre.charAt(0)>='A' && yenisifre.charAt(0)<='Z' ) { ilkharf=true;}
        else { System.out.println("İlk harf BÜYÜK olmalı");}


        // 3. adım: Son harf kucuk harf olmali

      boolean sonharf= false;
        if (yenisifre.charAt(yenisifre.length()-1)>='a' && yenisifre.charAt(yenisifre.length()-1)<='z') {sonharf=false;}
        else { System.out.println("Son harf kucuk harf olmali");}

        //    4. adım: Sifre bosluk icermemeli

        boolean bosluk= false;
        if (!yenisifre.contains(" ")){bosluk=true;}
        else {
            System.out.println("Sifre bosluk icermemeli");}


    }
}
