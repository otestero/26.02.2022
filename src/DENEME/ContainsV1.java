package DENEME;

import java.util.Scanner;

public class ContainsV1 {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("e-mail adresinizi giriniz?");
        String email=scan.nextLine();
        String gmail= "@gmail.com";

        if (!email.contains(gmail)) {
            System.out.println("lutfen gmail adresi giriniz");
        } else if(email.lastIndexOf(gmail)==(email.length()-10)) {
                System.out.println("Email adresiniz kaydedildi");
            } else {
            System.out.println("lutfen yazimi kontol edin");

    }
}}
