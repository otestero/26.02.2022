package DENEME;

import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {


        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin

        // 1. adım Kullanicidan email adresini girmesini isteyin,
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen gmail adresinizi yazınız");
        String emailadres= scan.nextLine();

        //2. adım mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        String arananMetin="@gmail.com";
        if (!emailadres.contains(arananMetin)) {
            System.out.println("Lutfen gmail adresi giriniz");

        //3. adım  @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “
        } else if (emailadres.contains(arananMetin)) {
            System.out.println("email adresiniz kaydedildi");

            //4. adım  @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin
        } else {
            System.out.println("Lütfen adresinizi kontrol ediniz");











    }

}}
