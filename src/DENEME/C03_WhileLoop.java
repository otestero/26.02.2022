package DENEME;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {
       //int input=5;
       Scanner scan=new Scanner(System.in);
       System.out.println("lütfen pozitif bir tam sayı giriniz");
       Integer input=scan.nextInt();

       int sayi=1;
int toplam=0;
        while (sayi<input) {
           System.out.print(sayi + " ");
           toplam+=sayi;
           sayi++;
        }
        System.out.println("");
        System.out.println("toplam sayı: "+ toplam);
    }
}
