package DAY_19;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        //Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        //Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        // ve “Negatif sayi giremezsiniz” yazdirip basa donun
        // Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        // yanlislikla kac negative sayi girdigini
        // ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;  //konteynır
int sayacPozitif=0;
int sayacNegatif=0;
        do {
            System.out.println("Lütfen Pozitif Bir TAm Sayı Giriniz \n bitirmek için 0'a basın");
            sayi = scan.nextInt();
            if (sayi < 0) {
                System.out.println("Negatif sayi giremezsiniz");
                sayacNegatif++;
            } else if (sayi > 0) {
                toplam += sayi;
                sayacPozitif++;
            }
        } while (sayi != 0);
        System.out.println("Yanlışlıkla girilen Negati fsayı adedi: "+ sayacNegatif);
        System.out.println();
        System.out.println("Girilen Sayıların toplamı: " + toplam);
    }
}
