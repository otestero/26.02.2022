package Practise_Elif;

import java.util.Scanner;

public class SayilarinKarelerininToplami {
    public static void main(String[] args) {
        /*Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
        ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
        hesaplayan kodu yazınız.*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir TamSayı Giriniz");
        int input= scan.nextInt();
        int KarelerToplami=0;
        System.out.println("Girilen Sayı = " + input);
        for (int i = 1; i <input ; i++) {
            KarelerToplami+=i*i;
        }
        System.out.println("KarelerToplami = " + KarelerToplami);

    }
}
