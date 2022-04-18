package day_09_turenryAndSwich;

import java.util.Scanner;

public class Co2_Turnery {
    public static void main(String[] args) {

        // kullanıcıdan bir tam sayı alıp tek mi çiftmi yazdıran bir kos yazalım
        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bir sayı giriniz");
        int sayi = scan.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("sayi çift");
        } else {
            System.out.println("sayı tek");
        }
        System.out.println(sayi%2==0 ? "sayi çift" : "sayı tek");
    }
}
