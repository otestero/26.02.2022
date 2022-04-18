package DENEME;

import java.util.Scanner;

public class carpımTablosu {
    public static void main(String[] args) {
        // Kullanıcıdan bir rakam isteyelim ve
        // Çarpım tablosu oluşturalım

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen çapım tablosu için ondan küçük bir sayı giriniz");
        Integer input=scan.nextInt();

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=input ; j++) {
                System.out.print((i*j)+ " ");

            }
            System.out.println("");

        }

       /* for (int i = 1 ; i <=input ; i++) {
            for (int j = 1; j <=input ; j++) {
                System.out.print((i*j)+ " ");
            }
            System.out.println("");*/

        }


    }

