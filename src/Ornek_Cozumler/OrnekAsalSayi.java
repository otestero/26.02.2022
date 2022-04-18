package Ornek_Cozumler;

import java.util.Scanner;

public class OrnekAsalSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        Integer sayi = scan.nextInt();

        boolean asalmi = true;
        if (sayi >= 2) {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    asalmi = false;
                    System.out.println(asalmi);
                    break;
                }
            }
            if (asalmi) System.out.println("sayi asaldır");
            else System.out.println("Asal DEĞİLDİR");
        }
    }
}