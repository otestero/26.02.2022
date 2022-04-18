package if_else;

import java.util.Scanner;

public class gunismin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gün ismi girin");//kullanıcıya mesaj verilir
        String gunIsmi = scan.next().toUpperCase();
        if (gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESİ")) {
            System.out.println("girdiğiniz gün haftasonu");
        } else {
            System.out.println("girdiğiniz gün hafta içi ");

        }
    }
}
