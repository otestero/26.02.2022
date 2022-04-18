package Swich;

import java.util.Scanner;

public class SwichCase {
    public static void main(String[] args) {
        //kullanıcıdan ay numarasını alıp
        //istenen ay ismini yazdıran bir program yazınız.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen kaçıncı ay olduğunu giriniz");
        int ayNo=scan.nextInt();

        switch (ayNo) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisam");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Ağustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım"); break;
            case 12:
                System.out.println("Aralık"); break;

            default:
                    System.out.println("Lütfen geçerli bir ay numarası giriniz");

                //swich içine yazılan veriableın değerine göre ilgili case i bulur ve break görene kadar kodu çalıştırır.
                //eğer break yoksa ilgili caseden aşağı dogru tum caseler calısır.
                //if else deki son else gibi geriye kalan

        }
    }
}
