package Day_14;

import java.util.Scanner;

public class SifreKontrol {
    public static void main(String[] args) {
        //Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa
        // “Sifre basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //    - Ilk harf buyuk harf olmali
        //    - Son harf kucuk harf olmali
        //    - Sifre bosluk icermemeli
        //    - Sifre uzunlugu en az 8 karakter olmali

        Scanner scan = new Scanner(System.in);
        System.out.println("Yeni şifre oluşturunuz");
        String yenisifre = scan.next();
        //System.out.println(yenisifre);

        boolean ilkharf = false;

        if (yenisifre.charAt(0) >= 'A' && yenisifre.charAt(0) <= 'Z') {
            ilkharf = true;
        } else {
            System.out.println("Şifrenizin ilk harfi büyük olmalı");
        }

        boolean sonharf = false;
        if (yenisifre.charAt(yenisifre.length() - 1) >= 'a' && yenisifre.charAt(yenisifre.length() - 1) <= 'z') {
            sonharf = true;
        } else {
            System.out.println("Şifrenizin son harfi küçük olmalı");
        }

        boolean bosluk = false;
        if (!yenisifre.contains(" ")) {
            bosluk = true;
        } else {
            System.out.println("Şifrenizde boşluk olmamalı");
        }

        boolean uzunluk = false;
        if (yenisifre.length() >= 8){
            uzunluk = true;
        } else {
            System.out.println("Sifre uzunlugu en az 8 karakter olmali");
        }

    }
}