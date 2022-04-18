package DENEME;

import java.util.Scanner;

public class SayiyiTamBolenSayiler {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin ve
        // bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin
        // 1. adım
        Scanner sacn = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        Integer input = sacn.nextInt();
        // 2. adım
        int tambolen = 1;
        int sayac = 0;

        while (tambolen <= input) {
            if (input % tambolen == 0) {
                System.out.print(tambolen + " " );
                sayac++;
            }
            tambolen++;
        }
        System.out.println("");
        System.out.println( "sayac:  " + sayac);

    }
}

