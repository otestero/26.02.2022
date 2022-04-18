package Ornek_Cozumler;

import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */

        Scanner scan = new Scanner(System.in);
        System.out.println("Üç basamaklı bir sayı giriniz");
        Integer girilen = scan.nextInt();
        //System.out.println("girilen = " + girilen);

        int basamaktakisayi = 0;
        int toplamlari = 0;
        int ilkgirilen=girilen;

        while (girilen > 0) {
            basamaktakisayi = girilen % 10;
            toplamlari= toplamlari+ (basamaktakisayi * basamaktakisayi * basamaktakisayi);
            girilen = girilen / 10;
        }
       // System.out.println("toplamlari = " + toplamlari);
       // System.out.println("girilen = " + girilen);
       // System.out.println("ilkgirilen = " + ilkgirilen);
        if (toplamlari == ilkgirilen)
            System.out.println(girilen + " Amstrong sayidır");
        else System.out.println(girilen + " Değildir");
    }
}