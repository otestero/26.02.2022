package Day_18_nestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {
        // kullanıcıdan kaç sayı toplamak istediğini alın.
        //bu sayıları alın ve sayıların toplamaını ekrana yazdırın
        int sayiAdedi=5;
        Scanner scan=new Scanner(System.in);  // obje
int sayi=0;
int toplam=0;
        for (int i = 1; i <=sayiAdedi ; i++) {
            System.out.println("Lütfen bir sayı giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;


        }
        System.out.println("girilen " +  sayiAdedi  + "sayıların toplamı :  "+ toplam);
// while le yapılırsa

        sayi=0;
        toplam=0;
        int sayac=1;

        while (sayac<=sayiAdedi){
            System.out.println( "Lütfen bir sayı giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;

        }
    }
}
