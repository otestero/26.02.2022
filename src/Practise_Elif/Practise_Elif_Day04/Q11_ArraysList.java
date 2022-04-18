package Practise_Elif.Practise_Elif_Day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q11_ArraysList {
    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
         */

        // 1. Kullanicidan ismini isteyelim
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz");
        String girilenisim = scan.nextLine();

        //2. Kullanici adindaki bosluklari silelim.
        girilenisim = girilenisim.replace(" ", "").trim();
        //System.out.println(girilenisim);

        List<String> kullaniciisimlistesi = new ArrayList<>();
        kullaniciisimlistesi.add("Ayşe");
        kullaniciisimlistesi.add("Ahmet");
        kullaniciisimlistesi.add("Hasan");
        kullaniciisimlistesi.add("Ali");
        kullaniciisimlistesi.add("Mehmet");
        kullaniciisimlistesi.add("Derya");
// 3. Kullanici adinin alinabilir olup olmadigina bakalim.
        if (kullaniciisimlistesi.contains(girilenisim)) {
            System.out.println("Yeniden Deneyiniz");
        }

// 4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdig

        else {
            kullaniciisimlistesi.add(girilenisim);
        }
        System.out.println("Girdiğiniz İsmi Kullanabilirsiniz " + girilenisim);

        if (!kullaniciisimlistesi.contains(girilenisim)) {
            int rastgelesayi= new Random().nextInt(100);
            girilenisim=girilenisim+""+rastgelesayi;
            System.out.println("Yeni kullanıcı adınız : " + girilenisim);
        }

    }
}
