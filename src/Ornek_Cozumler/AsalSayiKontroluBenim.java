package Ornek_Cozumler;

import java.util.Scanner;

public class AsalSayiKontroluBenim {

    public static void main(String[] args) {
        // Asal sayılar, sadece iki pozitif tam sayı böleni olan doğal sayılardır.
        // Sadece kendisine ve 1 sayısına kalansız bölünebilen 1'den büyük tam sayılardır.
        // En küçük asal sayı 2'dir.
    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        Integer input1 = scan.nextInt();
        while (input1 <= 1){

            System.out.println("Lütfen 1 den Büyük bir sayı giriniz: ");
            input1= scan.nextInt();
        }
            int sayac = 0;
            if (input1 >= 2) {
                for (int i = 2; i <= input1; i++) {
                    if (input1 % i == 0) {
                        sayac++;
                    }
                }
            }
            if (sayac > 1) {
                System.out.println("Girdiğiniz " + input1 + " sayısı:" + " Asal DEĞİLDİR.");
            } else {
                System.out.println("Girdiğiniz " + input1 + " sayısı: " + " ASAL bir sayıdır.");
            }
        }
    }








