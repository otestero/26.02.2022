package GeometrikSekiller;

import java.util.Scanner;

import static GeometrikSekiller.dikdortgen.kisakenar;

public class Hesaplamalar {




       public static double CemberAlanCevreHesapla(double yaricap, double pi) {
// Cember Hesabı

           Scanner scan = new Scanner(System.in);
           System.out.print("yarıçapı giriniz:    ");
           double r = scan.nextDouble();
           Cember CCA=new Cember(r,pi); // Cember.CemberinCevresi = 2 * r * pi;
           double CemberCevresi = 2 * r * pi;
           double CemberAlan = r * r * pi;
           System.out.println("Cemberin Alanı   = " + CemberAlan + "cm kare");
           System.out.println("Cemberin Cevresi = " + CemberCevresi + "cm");
           return CemberAlan;
       }
// Karenin Çevre ve Alan Hesabı

           public static double KareAlanCevreHesapla (double Kkenari) {
           Scanner scan = new Scanner(System.in);
           System.out.print("Kareni bir kenar uzunluğunu cm cinsinden giriniz:   ");
           double l = scan.nextDouble();
           Kare kareninbirkenari=new Kare(l);  //Kare.Kkenari = l;
               // kare clasından kareninbirkenari isimli bir obje oluşturduk
               // bu objeyle kare clasındaki Kkenari variable'na l yi, atadık.

               double KareAlani = l * l;
           double KareCevresi = l * 4;

           System.out.println("Karenin Alanı   = " + KareAlani + "cm kare");
           System.out.println("Karenin Cevresi = " + KareCevresi  + "cm");
               System.out.println("");
           return Kare.KareAlan;

      }
       // Dikdörtgen Hesabı

       public static double DikdortgenAlanCevreHesapla (double uzunkenar, double kısakenar) {

           Scanner scan = new Scanner(System.in);
           System.out.print("Dortgenin bir kısa kenar uzunluğunu cm cinsinden giriniz:    ");
           double ddkl = scan.nextDouble();
           System.out.print("Dortgenin bir kısa kenar uzunluğunu cm cinsinden giriniz:     ");
           double ddul = scan.nextDouble();
           dikdortgen DDA=new dikdortgen(ddkl,ddul); //
           // dikdörtgen clasından DDA isimli bir obje oluşturduk
           // bu objeyle dikdörtgen clasındaki uzunkenara ddul yi, kısakenara da ddkl atadık.

           double DDCevresi = 2 * (ddkl + ddul);
           double DDAlani   = ddkl * ddul;

           System.out.println("DD Alanı   = " + DDAlani   + "cm kare");
           System.out.println("DD Cevresi = " + DDCevresi + "cm");
           return DDAlani;
       }

    }


