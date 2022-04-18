package DENEME;

import java.util.Scanner;

public class ForLoopWsWhileLoop {
    public static void main(String[] args) {

        //kullanıcıdan toplamak istediği sayıları alın
        //ve kullanıcı 0 a basıncaya kadar devam edin
        //kullanıcı 0 a bastığında
        //girdiği tüm sayıları n toplamını yazdır,

       // Scanner scan=new Scanner(System.in);
       // System.out.println("Lütfen bir sayi giriniz");
       // int sayi=0;
      //  int toplam=0;
       // System.out.println(toplam);
        Scanner scan=new Scanner(System.in);
    int  sayi=1;
    int  toplam=0;

        while (sayi!=0) {
            System.out.println("Lütfen Bir Sayı Giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
        }
        System.out.println(toplam);
    }
}
