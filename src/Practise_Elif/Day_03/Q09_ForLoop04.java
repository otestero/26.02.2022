package Practise_Elif.Day_03;

import java.util.Scanner;

public class Q09_ForLoop04 {
    public static void main(String[] args) {
           /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
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
     we  yada  %
     Beklenen Çıktı:
     Yanlis karakter girdiniz!
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        String girilen= scan.nextLine();

        String Sesliharfler= "aeıou";
        String Sessizharfler= "qwrtyplkjhgfdszxcvbnm";

       // for (int i = 1; i <Sesliharfler.length(); i++) {
            if (Sesliharfler.contains(girilen)){
                System.out.println(girilen + "harfi Sesli harftir");
       }else if (Sessizharfler.contains(girilen)){
                System.out.println(girilen + "harfi Sessiz harftir");
            }else System.out.println("yanlış değer  girdiniz");

       // }






  /////////////////
    }
}
