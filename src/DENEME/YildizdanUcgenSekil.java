package DENEME;

import java.util.Scanner;

public class YildizdanUcgenSekil {
    public static void main(String[] args) {
        // Kullanıcıdan pozitif bir rakam girmesini isteyin ve
        // girilen rakama göre aşağıdaki şekli yıldız olark çizdirin
//*
//* *
//* * *
//* * * *
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayı girin");
        Integer input=scan.nextInt();

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }
    }
}
