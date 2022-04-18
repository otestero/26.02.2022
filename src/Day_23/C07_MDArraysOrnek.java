package Day_23;

import java.util.Scanner;

public class C07_MDArraysOrnek {
    public static void main(String[] args) {
        // soru 5 kullanıcadan bir cünmle isteyince cümlenin kelime sayıasını yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cumle=scan.nextLine();

        String arr[]=cumle.split(" ");
        System.out.println("girdiğiniz cümledeki kelime sayısı : " + arr.length);
    }
}
