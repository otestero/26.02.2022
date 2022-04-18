package interviewQuestions1;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        /*
Ask user enter a positive number and check if it is prime or not
Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz :");
        int sayi= scan.nextInt();

        boolean asalMi= true;
        for (int i = 2; i <sayi ; i++) { // 1 in asal olması
            if (sayi%i==0){
                asalMi=false;
                break;
            }
        }
        if (asalMi) System.out.println("sayi asaldır");
        else System.out.println("sayı asal değildir");
    }
}
