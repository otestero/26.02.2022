package Practise_Haluk_10_List.Practise_10_List;

import java.util.Locale;
import java.util.Scanner;

public class BenimUcusPlanim {/*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:     km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz

 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nereye gitmek istiyorsunuz: \n B: C: D: şehirlerinden birini seçiniz");
        // Integer secenek= scan.nextInt();
        String city = scan.nextLine().toUpperCase();
        System.out.println("Tek yön için 1: gidiş döüş için 2: seçiniz");
        Integer flytype = scan.nextInt();
        System.out.println("Yolcunun yaşını giriniz");
        Integer yas = scan.nextInt();
        //Bilet Tarifesi
        double priceB = 0.10 * 500;
        double priceC = 0.10 * 700;
        double priceD = 0.10 * 900;

        if (city.equals("B") || city.equals("C") || city.equals("D")) { // uçuş güzergahı
            // ************** 65 YAŞ ÜSTÜ ***********
            if (yas >= 65) {
                //*** BBBBBBBBBBBBBBBBBBBb  *** 65 yaş üstü
                if (city.equals("B")) {                               // B rotası ise
                    if (flytype == 1) {                                    // tek yön ise
                        System.out.println("*****");
                        System.out.println("uçuşunuz için bilet ödemeniz: " + (priceB * 0.7) + "$");

                    } else if (flytype == 2) {
                        System.out.println("*******");
                        System.out.println("uçuşunuz için bilet ödemeniz: " + (priceB * 0.7 * 0.8) * 2 + "$");

                    } else System.out.println("Hatalı veri girdiniz");
                } //***CCCCCCCCCCCCCCC  *** 65 yaş üstü
                if (city.equals("C")) {                               // C rotası ise
                    if (flytype == 1) {                                    // tek yön ise
                        System.out.println("*****");
                        System.out.println("uçuşunuz için bilet ödemeniz: " + (priceC * 0.7) + "$");

                    } else if (flytype == 2) {
                        System.out.println("*******");
                        System.out.println("uçuşunuz için bilet ödemeniz: " + (priceC * 0.7 * 0.8) * 2 + "$");

                    } else System.out.println("Hatalı veri girdiniz");
                }
                //*** DDDDDDDDDDDDDDD  *** 65 yaş üstü
                if (city.equals("D")) {                               // D rotası ise
                    if (flytype == 1) {                                    // tek yön ise
                        System.out.println("*****");
                        System.out.println("uçuşunuz için bilet ödemeniz: " + (priceD * 0.7) + "$");

                    } else if (flytype == 2) {
                        System.out.println("*******");
                        System.out.println("uçuşunuz için bilet ödemeniz: " + (priceD * 0.7 * 0.8) * 2 + "$");

                    } else System.out.println("Hatalı veri girdiniz");
                }
            }
        }// ************** 12 YAŞ ALTI ***********

        if (yas < 12) {
            //*** BBBBBBBBBBBBBBBBBBBb  *** 12  yaş altı
            if (city.equals("B")) {                               // B rotası ise
                if (flytype == 1) {                                    // tek yön ise
                    System.out.println("*****");
                    System.out.println("uçuşunuz için bilet ödemeniz: " + (priceB * 0.5) + "$");

                } else if (flytype == 2) {
                    System.out.println("*******");
                    System.out.println("uçuşunuz için bilet ödemeniz: " + (priceB * 0.5 * 0.8) * 2 + "$");

                } else System.out.println("Hatalı veri girdiniz");
            } //***CCCCCCCCCCCCCCC  *** 12 yaş Altı
            if (city.equals("C")) {                               // C rotası ise
                if (flytype == 1) {                                    // tek yön ise
                    System.out.println("*****");
                    System.out.println("uçuşunuz için bilet ödemeniz: " + (priceC * 0.5) + "$");

                } else if (flytype == 2) {
                    System.out.println("*******");
                    System.out.println("uçuşunuz için bilet ödemeniz: " + (priceC * 0.5 * 0.8) * 2 + "$");

                } else System.out.println("Hatalı veri girdiniz");
            }
            //*** DDDDDDDDDDDDDDD  *** 12 yaş Altı
            if (city.equals("D")) {                               // D rotası ise
                if (flytype == 1) {                                    // tek yön ise
                    System.out.println("*****");
                    System.out.println("uçuşunuz için bilet ödemeniz: " + (priceD * 0.5) + "$");

                } else if (flytype == 2) {
                    System.out.println("*******");
                    System.out.println("uçuşunuz için bilet ödemeniz: " + (priceD * 0.5 * 0.8) * 2 + "$");

                } else System.out.println("Hatalı veri girdiniz");
            }
        }
        //  *************  12 ile 24 YAŞ  Arasında **************
        if (24 >= yas && yas >= 12) {
            //*** BBBBBBBBBBBBBBBBBBBb  *** 12- 24 YAŞ ARALIĞI
            if (city.equals("B")) {                               // B rotası ise
                if (flytype == 1) {                                    // tek yön ise
                    System.out.println("*****");
                    System.out.println("uçuşunuz için bilet ödemeniz: " + (priceB * 0.9) + "$");

                } else if (flytype == 2) {
                    System.out.println("*******");
                    System.out.println("uçuşunuz için bilet ödemeniz: " + (priceB * 0.9 * 0.8) * 2 + "$");

                } else System.out.println("Hatalı veri girdiniz");
            } //***CCCCCCCCCCCCCCC  *** 12- 24 YAŞ ARALIĞI
            if (city.equals("C")) {                               // C rotası ise
                if (flytype == 1) {                                    // tek yön ise
                    System.out.println("*****");
                    System.out.println("uçuşunuz için bilet ödemeniz: " + (priceC * 0.9) + "$");

                } else if (flytype == 2) {
                    System.out.println("*******");
                    System.out.println("uçuşunuz için bilet ödemeniz: " + (priceC * 0.9 * 0.8) * 2 + "$");

                } else System.out.println("Hatalı veri girdiniz");
            }
            //*** DDDDDDDDDDDDDDD  *** 12- 24 YAŞ ARALIĞI
            if (city.equals("D")) {                               // D rotası ise
                if (flytype == 1) {                                    // tek yön ise
                    System.out.println("*****");
                    System.out.println("uçuşunuz için bilet ödemeniz: " + (priceD * 0.9) + "$");

                } else if (flytype == 2) {
                    System.out.println("*******");
                    System.out.println("uçuşunuz için bilet ödemeniz: " + (priceD * 0.9 * 0.8) * 2 + "$");

                } else System.out.println("Hatalı veri girdiniz");
            }

        }

        // **************24 ile 65 yaş arası***************
        if (25 <= yas && yas < 65) {
            //*** BBBBBBBBBBBBBBBBBBBb  *** 25-65 YAŞ ARALIĞI
            if (city.equals("B")) {                               // B rotası ise
                if (flytype == 1) {                                    // tek yön ise
                    System.out.println("*****");
                    System.out.println("uçuşunuz için bilet ödemeniz: " + (priceB ) + "$");

                } else if (flytype == 2) {
                    System.out.println("*******");
                    System.out.println("uçuşunuz için bilet ödemeniz: " + (priceB * 0.8) * 2 + "$");

                } else System.out.println("Hatalı veri girdiniz");
            } //***CCCCCCCCCCCCCCC  *** 25-65  YAŞ ARALIĞI
            if (city.equals("C")) {                               // C rotası ise
                if (flytype == 1) {                                    // tek yön ise
                    System.out.println("*****");
                    System.out.println("uçuşunuz için bilet ödemeniz: " + (priceC ) + "$");

                } else if (flytype == 2) {
                    System.out.println("*******");
                    System.out.println("uçuşunuz için bilet ödemeniz: " + (priceC * 0.8) * 2 + "$");

                } else System.out.println("Hatalı veri girdiniz");
            }
            //*** DDDDDDDDDDDDDDD  *** 25-65 YAŞ ARALIĞI
            if (city.equals("D")) {                               // D rotası ise
                if (flytype == 1) {                                    // tek yön ise
                    System.out.println("*****");
                    System.out.println("uçuşunuz için bilet ödemeniz: " + (priceD ) + "$");

                } else if (flytype == 2) {
                    System.out.println("*******");
                    System.out.println("uçuşunuz için bilet ödemeniz: " + (priceD * 0.8) * 2 + "$");

                } else System.out.println("Hatalı veri girdiniz");
            }

        }
    }
}