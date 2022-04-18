package Ornek_Cozumler;

import java.util.Scanner;

public class AsalSayiKontrolu {
    public static void main(String[] args) {
        // Asal sayılar, sadece iki pozitif tam sayı böleni olan doğal sayılardır.
        // Sadece kendisine ve 1 sayısına kalansız bölünebilen 1'den büyük tam sayılardır.
        // En küçük asal sayı 2'dir.
    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        Integer input = scan.nextInt();

        boolean asalMi = true;              // true atanma nedeni: Asal sayı sadece kendisine kalansız bölünür.
        if (input <= 1) {                //Bu nedenle tek bir cevap vardır. Bundan Dolayıda "TRUE" değeri atanır.
            System.out.println("enküçük asal Sayı 2 dir.");
            System.out.println("Lütfen 1 den Büyük bir sayı giriniz :");
            input = scan.nextInt();
        } else {
            if (input >= 2) {
                for (int i = 2; i < input; i++) {

                    if (input % i == 0) {
                        asalMi = false;
                        break;
                    }

                }
                if (asalMi) System.out.println("Sayi asaldır");
                else System.out.println("sayı asal DEĞİLDİR");


            }


        }
    }
}
