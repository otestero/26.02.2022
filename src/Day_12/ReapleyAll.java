package Day_12;

import java.util.Scanner;

public class ReapleyAll {
    public static void main(String[] args) {
        //Kullanıcıdan isim soyad bilgisini alıp
        // bütün harfleri * yapalım

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isim ve soyisminizi girin");
        String isimSoyisim= scan.nextLine();


        System.out.println(isimSoyisim.replaceAll("\\s", "*"));
    }
}
