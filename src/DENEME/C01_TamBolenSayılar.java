package DENEME;

public class C01_TamBolenSayılar {
    public static void main(String[] args) {
        // kullanıcıdan bir sayı alın ve
        // bu sayıyı tam bolen sayıları ve toplam kaç adet olduklarını ekranda yazdırın

        int input = 47;
        int bolen = 1;
        int sayac = 0;
        int toplamsayi=0;

        while (bolen <= input) {
            if (input % bolen == 0) {
                System.out.print(bolen + " ");
                sayac++;
                toplamsayi+=bolen;

            }
            bolen++;}
            System.out.println("");
            System.out.println(input +" sayını bolen " + sayac + " adet sayı vardır");
            System.out.println("Bölen Sayıların Toplamı:  " + toplamsayi );


        }
    }

