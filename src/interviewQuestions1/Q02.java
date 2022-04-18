package interviewQuestions1;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        /*
         * Kulanicidan alina bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir string giriniz  :");
        String str= scan.nextLine();

        System.out.println("Bir sayı giriniz     :");
        int sayi= scan.nextInt();
        ilksonharfmetoduolustur(str, sayi);
        System.out.println("ilk+son   " + ilksonharfmetoduolustur(str,sayi)); //ilk+son   sasasa

    }// main sonu

    private static String ilksonharfmetoduolustur(String str, int sayi) {
        String s=str.substring(0,1)+str.substring(str.length()-1);//ilk harf son harfi alma
        String cıkan="";

        for (int i = 0; i < sayi; i++) {
            cıkan+=s; // b=b+s

        }return cıkan;

    }
}
