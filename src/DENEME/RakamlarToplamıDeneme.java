package DENEME;

import java.util.Scanner;

public class RakamlarToplamıDeneme {
    public static void main(String[] args) {

        // Kullanıcıdan bie sayı alın ve
        // bu sayının rakamlarını toplamaını yazdırı

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 0 dan büyük bir sayı giriniz");
        Integer sayi=scan.nextInt();
       int rakam=0;
       int rakamlartoplami=0;


        while (sayi>0) {
            rakam = sayi % 10;
            rakamlartoplami += rakam;
            sayi /= 10;
        }
        System.out.println(rakamlartoplami);

    }
}
