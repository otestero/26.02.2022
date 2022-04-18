package if_else;

import java.util.Scanner;

public class Haftaningunlerı {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen gün ismini giriniz");
        String gunIsmi=scan.next();//.toUpperCase();

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("girdiğiniz gün hafta sonu");

        }  else if (gunIsmi.equals("ptesi") || gunIsmi.equals("salı") || gunIsmi.equals("çarşamba") || gunIsmi.equals("perşembe") ||gunIsmi.equals("cuma")){
System.out.println("girdiğiniz gün hafta içi");
        }   else {

            System.out.println("lütfen  geçerli bir gün giriniz");
        }}}