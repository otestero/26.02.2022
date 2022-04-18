package interviewQuestions6;

import java.util.Scanner;

public class Q03_OddIndex {
    public static void main(String[] args) {

       // indexi tek sayi olan karakterleri yazdıran vir code create ediniz

        Scanner scan=new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String str=scan.nextLine();

        int index=0;
        do {
            if (index % 2 == 1) {

                System.out.print(str.charAt(index) + " ");
            }
            index++;
        }while (index<str.length());

    }
}
