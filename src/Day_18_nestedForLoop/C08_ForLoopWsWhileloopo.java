package Day_18_nestedForLoop;

import java.util.Scanner;

public class C08_ForLoopWsWhileloopo {
    public static void main(String[] args) {
        //kullanıcıdan toplamak istediği sayıları alın
        //ve kullanıcı 0 a basıncaya kadar devam edin
        //kullanıcı 0 a bastığında
        //girdiği tüm sayıları n toplamını yazdır

        Scanner scan = new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        System.out.println(toplam);
        sayi=1;
        toplam=0;

        while (sayi!=0){
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println(toplam);

        // baslangic,bitis ve degisim degerleri net olan durumlarda for loop daha avantajlidir
        // ama adim sayisi belli olmayan durumlarda while loop daha avantajlidir

        /*       for (int i = 1; i <1000000 ; i++) {
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            if (sayi==0){
             break;
            } else {
                toplam+=sayi;
            }
        }
         */
    }
}
