package matematikselIslemler;

import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 4 basamkalı bir tam sayı giriniz");
        int sayi= scan.nextInt();

        int rakam       =0;
        int rakamlarToplamı=0;
        // 1. adımda r=0 rt=0 sayi=7532

        rakam=sayi%10;             //   2
        rakamlarToplamı += rakam;  //   2
        sayi=sayi/10;                  // 753

        // 2. adım r=2 rt=2 sayı= 753
        rakam=sayi%10;             //3
        rakamlarToplamı +=rakam;   //5
        sayi/=10;                  //75

        // 3. adım r=3 rt=5 sayı=75
        rakam=sayi%10;              //5
        rakamlarToplamı+=rakam;     //10
        sayi/=10;                   //7

        //4. adım r=5 rt=10 sayı=7
        rakam=sayi%10;              //7
        rakamlarToplamı+=rakam;
        sayi/=10;

        System.out.println("Girdiğiniz sayının rakamlar toplamı   " + rakamlarToplamı);


    }
}
