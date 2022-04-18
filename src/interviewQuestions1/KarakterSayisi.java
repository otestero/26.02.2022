package interviewQuestions1;

import java.util.Arrays;
import java.util.Scanner;

public class KarakterSayisi {
    public static void main(String[] args) {
        /*
  Kullanicidan bir String aliniz.
  String'de var olan her character'in sayisini ekrana yazdiriniz.
  Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
         abaa   ==> a=3  b=1
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir string giriniz  : ");
        String str=scan.nextLine();

        //split() ayırma
        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr)); //[a, a, b, b, d, a]
        // sort() sıralama
        Arrays.sort(arr);  // sıralar [a, a, a, b, b, d]
        System.out.println(Arrays.toString(arr));
        // sayac olustur
        int counter=0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1].equals(arr[i])){  // karşılaştırmalarda i+1 kullanılır
            counter++; }else{
                System.out.println(arr[i-1] +" sayisi " + (counter+1));
                counter=0;
    } if (i==arr.length-1){// en sona geldiğinde
                System.out.println(arr[i]+ " sayisi " + (counter+1));

}}}}
