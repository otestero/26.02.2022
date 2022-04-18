package Practise_Elif.interviewQ2;

import java.util.Scanner;

public class Q01_ArmstrongNumber {
    public static void main(String[] args) {
        /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
      gösteren program yazınız */
        Scanner scan =new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi=scan.nextInt();
        amstrong(sayi);
        girilensayiyakadarolanAmstrongSayilar(sayi);
    }



    private static void amstrong(int n) {
        int sayininküpleritoplami=0;
        int basamaktakiSayi=0;
        int girilenSayi=n;


        while (n>0){
            basamaktakiSayi=n%10;
            sayininküpleritoplami=sayininküpleritoplami +(basamaktakiSayi*basamaktakiSayi*basamaktakiSayi);
            n=n/10;
        }




        if (girilenSayi==sayininküpleritoplami){
            System.out.println(girilenSayi+ "sayisi amastrong sayıdır.");
        }else System.out.println(girilenSayi+ "sayi amstrong değildir.");
        System.out.println("************************************");



    }// soru 2 için
private static void girilensayiyakadarolanAmstrongSayilar(int sayi) {
    for (int i = 1; i <=sayi ; i++) {
        amstrong(i);//recursive metod cağırma

    }
}
}
