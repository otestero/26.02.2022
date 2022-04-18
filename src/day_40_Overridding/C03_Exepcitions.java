package day_40_Overridding;

import java.util.Scanner;

public class C03_Exepcitions {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bölmek istediğin sayıyı girin");
        int sayi1= scan.nextInt();

        System.out.println("Kaça Bölmek istediğini yaz");
        //6/0 yapınca sonuç
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at day_40_Overridding.C03_Exepcitions.main(C03_Exepcitions.java:12)

        int sayi2= scan.nextInt();
        System.out.println("sonuç =    " + sayi1/sayi2 );


    }



}
