package DENEME_KAYITLI;

import java.util.Scanner;

public class day04_Q05 {
    public static void main(String[] args) {
        /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

        int arr[]=new int[8];
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + ".indexi sayiyi giriniz; ");
            arr[i]=scan.nextInt();
        }
        int counter=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%3==0){
                counter++;
            }
        }System.out.println("3 ile bölünebilen sayi = " + counter);




    }

}
