package DENEME;

import java.util.Scanner;

public class DoWLoopIleTamSayıToplama {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin ve
        //  bu sayinin rakamlari toplamini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");

        int input= scan.nextInt();
        int rakam=0;
        int rakamtoplam=0;

        while (input>0){

            rakam=input%10;
            rakamtoplam+=rakam;
            input/=10;
        }
        System.out.println("Rakamların Toplama; " + rakamtoplam);
        }

    }


