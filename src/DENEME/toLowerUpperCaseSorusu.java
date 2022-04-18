package DENEME;

import java.util.Scanner;

public class toLowerUpperCaseSorusu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("İsminizi giriniz");
        String isim= scan.nextLine();

        System.out.println(isim=isim.toUpperCase());
String str= "Ayhan Beyhan";
        System.out.println(str.replace("han", "ol"));

        String str1="Ali";
        String str2="ali";
        System.out.println(str2.equalsIgnoreCase(str1));
        System.out.println(str1.equals(str2));



    }
}
