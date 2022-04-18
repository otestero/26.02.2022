package Practise_Haluk;

import java.util.Arrays;
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("agam bir metin gir: ");//Hayat java ile çok kolay
        String arr[] = scan.nextLine().split("");
        System.out.println(Arrays.toString(arr)); //[H, a, y, a, t,  , j, a, v, a,  , i, l, e,  , ç, o, k,  , k, o, l, a, y]
        String enCokTekrarEden = "";
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int maxSayac = 0; //en cok kullanılan harfin sayısı
        int sayac = 0;

      /*  for (int i = 1; i < arr.length; i++) {
            if (arr[i-1].equals(arr[i])) {
                sayac++; */
       for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])) {
                    sayac++;
                }

            }
            if (sayac > maxSayac) {
                maxSayac = sayac;
                enCokTekrarEden = arr[i];
            } else if (sayac == maxSayac) {
                enCokTekrarEden += ", " + arr[i];

            }
            sayac = 0;
        }
        System.out.println("en çok bu harf: "+ enCokTekrarEden);
    }
}
