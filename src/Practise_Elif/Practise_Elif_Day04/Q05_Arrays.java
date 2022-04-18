package Practise_Elif.Practise_Elif_Day04;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays {
    public static void main(String[] args) {
         /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
int[] sayi = new int[8];

        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < sayi.length; i++) {
            System.out.print(i+1 + ". sayıyı giriniz: ");
             sayi[i]=scan.nextInt();

        } int counter=0;
        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i]%3==0){
                counter++;
            }


        }

        System.out.println("Bolunebilen sayı adedi = " + counter);
    }
}
