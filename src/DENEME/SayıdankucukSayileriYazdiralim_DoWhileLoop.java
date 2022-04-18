package DENEME;

import java.util.Scanner;

public class SayıdankucukSayileriYazdiralim_DoWhileLoop {
    public static void main(String[] args) {
       // kullanıcıdan pozitif bir tam sayı alalım
       // while loop ile sayıdan küçük pozitif tam sayıları yazdıraım

        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir tam sayı giriniz");
        Integer sayi=scan.nextInt();

        int kucuk=1;
        int kucuktamsayilartop=0;
        while (kucuk<sayi) {
            System.out.print( kucuk + " ");
            kucuktamsayilartop+=kucuk;
            kucuk++;

        }
        System.out.println("");
        System.out.println("KSayılar toplamı: " + kucuktamsayilartop);
    }
}
