package DENEME;

import java.util.Scanner;

public class IkiTamSayiArasiniYazdirma {
    public static void main(String[] args) {
        // kullanıcıdan iki tam sayı alıp bu sayıları ve
        // aralarındaki tüm sayıları yazdıran bir kod oluşturun
        Scanner scan = new Scanner(System.in);
        System.out.println("birinci tam sayıyı giriniz");
        int input1 = scan.nextInt();
        System.out.println("2 nci Sayıyı giriniz");
        int input2 = scan.nextInt();
//int sayilar=0;
       // while (input1 < input2) {
         //   System.out.print(sayilar = input1 + 1);

        for (int i = input1+1; i <input2 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        }
    }
