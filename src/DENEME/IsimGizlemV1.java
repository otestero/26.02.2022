package DENEME;

import java.util.Scanner;

public class IsimGizlemV1 {
    public static void main(String[] args) {

        //Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //isim-soyisim : M***** B*******
        //kart no : **** **** **** 1234

       Scanner scan=new Scanner(System.in);
       System.out.println("İsminizi giriniz");
       String ad= scan.nextLine();
       System.out.println("Soyisminizi giriniz");
       String soyad= scan.nextLine();
       System.out.println("Kredi Kartı Numaranızı giriniz");
       String kkno= scan.nextLine();

       String yad= ad.substring(0,1).toUpperCase()+ad.substring(1).replaceAll("\\S", "*");
       String ysoyad= soyad.substring(0,1).toUpperCase()+soyad.substring(1).replaceAll("\\S", "*");
       String KKNO= "**** **** **** " + kkno.substring(12);

       System.out.println("İsim Soyisim : " + yad+" " + ysoyad);
       System.out.println("Kart No:  " + KKNO);


    }
}
