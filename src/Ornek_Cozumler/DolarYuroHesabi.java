package Ornek_Cozumler;

import java.util.Arrays;

public class DolarYuroHesabi {
    public static void main(String[] args) {
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */
        String arr[][] = {{"$10", "$10", "10$"}, {"€10", "€10", "$10"}, {"€10", "$10", "$10"}};

        double DolarToplam = 0.0;
        double YuroToplam = 0.0;
        double DolarYuroToplam=0.0;
        double sayi1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j].contains("$")) {
                    String sayidolar = arr[i][j].replace("$", " ");
                    DolarToplam += (Double.parseDouble(sayidolar));
                } else {
                    String sayiyuro = arr[i][j].replace("€", " ");
                    YuroToplam += (Double.parseDouble(sayiyuro));
                    //str1 ve str2 icerigi sayi olan String'lerdir.
                    // Eger iceriginin tamamen sayi oladugunu bildigimiz String varsa
                    // parseDouble() veya parseInteger() methodu kullanabiliriz
                    // ancak primitive data tipleri method'a sahip olmadiklarindan wrapper class kullanmak lazim
                }
            }
        }double Ytoplam=YuroToplam*4.2;
        double Dtoplam=DolarToplam*3.2;
       System.out.println("DolarToplam     = " + (Dtoplam));
       System.out.println("YuroToplam      = " + (Ytoplam ));
       DolarYuroToplam=(Dtoplam+Ytoplam);
       System.out.println("DolarYuroToplam = " + DolarYuroToplam);
    }
}