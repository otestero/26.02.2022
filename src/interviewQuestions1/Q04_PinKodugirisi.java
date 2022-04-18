package interviewQuestions1;

import java.util.Scanner;

public class Q04_PinKodugirisi {
    public static void main(String[] args) {
        // String olan kodunuzu kontrol eden bir kod yazınız
        Scanner scan = new Scanner(System.in);
        //String girilenpin= scan.nextLine();
        String pin = "said.12345";
        int girişHakki = 4;
        System.out.println("*** Hoş geldiniz ***");
        while (true) {
            System.out.println("Pin kodu giriniz :");
            String girilenpin = scan.nextLine();

            if (pin.equals(girilenpin)) {
                System.out.println("Başarılı giriş yaptınız..");
                break;
            } else {
                System.out.println("Yanlış giriş yaptınız");
                girişHakki--;
                System.out.println("kalan giriş hakkınız : " + girişHakki);
            }
            if (girişHakki == 0) {
                System.out.println("giriş hakkı kalmadı sim kartınız bloke oldu");
                break;
            }
        }

    }
}