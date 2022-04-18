package Practise_Elif.Practise_Elif_Day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q12_ArrayList {
    public static void main(String[] args) {
        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("uzunluğu giriniz;   ");
        int listuzunluk =scan.nextInt();

        List<Integer> list=new ArrayList<>();
        System.out.println(" Eleman ekleyiniz");
        for (int i = 0; i < listuzunluk; i++) {
            list.add(scan.nextInt());

        }
        tekrarliEleman(list);
    }

    private static void tekrarliEleman(List<Integer> list) {

    }
}
