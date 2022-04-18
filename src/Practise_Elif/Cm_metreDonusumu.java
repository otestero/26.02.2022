package Practise_Elif;

import java.util.Scanner;

public class Cm_metreDonusumu {
    public static void main(String[] args) {
    // cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Çevireceğiniz Uzunluğu CM olarak giriniz");
        double uzunluk= scan.nextDouble();
        santimetreyiDonustur(uzunluk);

    }    private static void santimetreyiDonustur(double uzunluk) {
        double metre=uzunluk/100;
        double kilometre=uzunluk/100000;
        System.out.println(metre+"m");
        System.out.println(kilometre + "km");
        System.out.println("sizin girdiginiz "  + uzunluk + " cm degeri :" +metre + " metredir, " +kilometre  + " kilometredir"
        );}

}

