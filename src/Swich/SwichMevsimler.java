package Swich;

import java.util.Scanner;

public class SwichMevsimler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kaçıncı ay olduğunu giriniz");
        int ayNo = scan.nextInt();

        switch (ayNo) {
            case 12: case 1: case 2:
                System.out.println("Kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;

            default:
                System.out.println("Lütfen geçerli bir ay numarası giriniz");

        }
    }
}
