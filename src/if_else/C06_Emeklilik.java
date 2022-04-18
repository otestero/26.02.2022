package if_else;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scan.nextInt();

        if (yas >= 65) {
            System.out.println("Emekli olabilirsin");
        } else
            System.out.println("Emekli olamazsın");
        System.out.println(65-yas + "sene daha çalışmalısın");
    }
    }

