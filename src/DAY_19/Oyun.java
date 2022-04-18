package DAY_19;

import java.util.Random;
import java.util.Scanner;

public class Oyun {
    public static void main(String[] args) {

        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        Random rnd=new Random();
        int sayi= rnd.nextInt(100);//
        Scanner scan=new Scanner(System.in);
        int tahmin=0;
        int sayac=0 ;

        while (sayi!=tahmin){
            System.out.println("Lütfen bir sayı giriniz");
            tahmin=scan.nextInt();
            if (tahmin>sayi){
                System.out.println("daha küçük bir sayı girmelisin");
            }else if (tahmin<sayi) {
                System.out.println("daha büyük bir sayı girmelisin");;
            }
            sayac++;
        }
        System.out.println("Tuttuğum sayıyı " + sayac + " tahminde buldunuz");
    }
}
