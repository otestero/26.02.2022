package Ornek_Cozumler;

import java.util.Arrays;
import java.util.Scanner;

public class KarakterSayisiBulma {
    public static void main(String[] args) {
        /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1   */
        Scanner scan=new Scanner(System.in);         // "kader"            Kelimeyi aldık
        System.out.println("Bir kelime giriniz");
        String karaktersayisi= scan.nextLine();

        String arr[] = karaktersayisi.split(""); // [k, a, d, e, r]  Kelimeyi harflere ayırdık
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);                            // [a, d, e, k, r]    harfleri sıraladık
        System.out.println(Arrays.toString(arr));

        // SAYAC
        int counter=0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1].equals(arr[i])) {
                counter++;

            }else{
                System.out.println(arr[i-1] + " harfi " + (counter+1) + " adet");
                counter=0;
            }
            if (i== arr.length-1){
                System.out.println(arr[i] + " harfi " + (counter+1)+ " adet ");
            }
            /*
            if (arr[i-1].equals(arr[i])) { [a, d, e, k, r]   için
        i=1        0            1          a != d  counter'ı bir artır  a harfi  1 adet   counter'ı sıfırla
        i=2        1            2          d != e  counter'ı bir artır  d harfi  1 adet   counter'ı sıfırla
        i=3        2            3          e != k  counter'ı bir artır  e harfi  1 adet   counter'ı sıfırla
        i=4        3            4          k != r  counter'ı bir artır  k harfi  1 adet   counter'ı sıfırla
            if (i== arr.length-1)
        i=4        4            4          r = r    r sayısı  1 adet
*/
        }

    }
}
