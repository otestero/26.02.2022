package Practise_Elif.InterviewQ4;

import java.util.Locale;
import java.util.Scanner;

public class IWQ03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir cümle girin");
        String cumle=scan.nextLine().toLowerCase(Locale.ROOT);
        hackerDili(cumle);



    }

    private static void hackerDili(String cumle) {
        String arr[]=new String[cumle.length()];
        for (int i = 0; i < cumle.length(); i++) {
            arr[i]=cumle.substring(i,i+1);
            System.out.print(arr[i]);
        }
        System.out.println("");
        for (int i = 0; i < cumle.length(); i++) {
            if (arr[i].contains("s")) {
                arr[i]="5";
            }
            if (arr[i].contains("a")) {
                arr[i]="4";
            }
            if (arr[i].contains("o")) {
                arr[i]="1";
            }
            if (arr[i].contains("i")) {
                arr[i]="2";
            }
            if (arr[i].contains("e")) {
                arr[i]="3";
            }
            System.out.print(arr[i]);
        }


    }
}
