package O7_ForLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
/*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
    Sesli harfler: a,e,i,o,u
    Test Data:
    a
    Beklenen Çıktı:
    a harfi sesli harfdir.
    Test Data:
    d
    Beklenen Çıktı:
    d harfi sesiz harftir.
    Test Data:
    we  yada %
    Beklenen Çıktı:
    Yanlis karakter girdiniz!
     */

// 1. adım;
      Scanner scan=new Scanner(System.in);
       System.out.println("Bir harf giriniz");
        String girilenHarf= scan.nextLine();

       String sesliHarfler= ("aeıiou");
       String sessizHarf ="bcdfghjklmnprstvyzxvq";

        System.out.print("harf giriniz: ");
        String kelime = scan.next();

        String sesliHarf = "aeuoi";

            for (int i = 0; i <= sessizHarf.length(); i++) {
                if (sesliHarf.contains(kelime)) {
                    System.out.println("sesli");
                    break;
                } else if (sessizHarf.contains(kelime)) {
                    System.out.println("sessiz");
                    break;
                } else System.out.println("Yanlis karakter girdiniz!!!");
                break;
            }
      //  } else System.out.println("Yanlis karakter girdiniz!!!");

       System.out.println(sesliHarfler);
        // 2. adım;
        for (int i = 0; i <= sesliHarfler.length(); i++) {
            if (sesliHarfler.contains(girilenHarf)) {
                System.out.println("Sesli harf");
                break;
            } else if (sesliHarfler.contains(girilenHarf) ) {
                System.out.println("SESSİZ");
                break;
            } else System.out.println("hepsi YANLIŞ");
           break;

                // if (sessizHarf.contains(girilenHarf));
            //  System.out.println(" Sessiz harf"); break;
        }

    // ******* ************ *********
    }
}
