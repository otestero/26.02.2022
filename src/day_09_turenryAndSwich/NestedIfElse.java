package day_09_turenryAndSwich;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {

        // Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e
        //bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana "5’e bölünen
        //çift sayı" yazdırın. Son rakamı 0 değil ise "5’e bölünen tek sayı" yazdırın.
        //Girdiği password 5’e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.


        Scanner scan = new Scanner((System.in));
        System.out.println("Lütfen 4 basamaklı pozitif bir tamsayı giriniz");
        int sayi = scan.nextInt();
        if (sayi < 1000 || sayi > 9999) {

        } else if (sayi % 5 == 0) {// sayı 5 e tam bölünüyor

        } else // 4 basamaklı ve 5e bölünemiyor
            if (sayi % 10 == 0) {// 4 basamaklı olan ve 5 ile bölünebilen ve son rakamı 0 olan
                System.out.println("5 e bölünen çift sayı");
            } else { //4 basamklı, 5 ile bölünebilen ve son rakamı 0 olmayan
                System.out.println("5 e bölünen tek sayı");
            }

            System.out.println("tekrar deneyin");
        }
    }

