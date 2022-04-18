package if_else;

import java.util.Scanner;

public class once_if {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int sayi = scan.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("girilen sayı çift sayıdır");
        }

        if (sayi % 2 != 0) {
            System.out.println("Girilen sayı tek sayıdır");
    }
}
}

