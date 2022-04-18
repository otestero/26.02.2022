package day_09_turenryAndSwich;

public class Co4_NestedTurnery {
    public static void main(String[] args) {
// verilen sayinin pozitif mi negatif mi oldugunu kontrol edip
// pozitif sayi ise tek veya cift
// negatif sayi ise -100 den buyuk veya kucuk
// olduunu belirleyen bir ternary yaziniz.

        int sayi = -121;
        if (sayi >=20)
        { if (sayi %2==0) { System.out.println("sayı pozitif çift");}
          else { System.out.println("sayı pozitif tek");}
          if (sayi<=-100) {System.out.println("sayi -100 den küçük negatis sayı");}
          else {System.out.println("sayı -100 den büyük negatif sayı");}}
        String sonuc=sayi>=0 ?
                (sayi%2==0 ? "pozitif çift sayi" : "pozitif tek sayı 0 veya pozitifse") :
                (sayi<-100 ? "-100 den küçük negatif sayı"  : "-100 den büyük negatif");
        //System.out.println(sonuc);
        }
    }
