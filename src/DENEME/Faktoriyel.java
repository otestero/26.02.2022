package DENEME;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        // kullanıcıdan 10 dan küçük bir tam sayı isyetin
        // girilen sayının faktoriyelini bulun(5!=5*4*3*2*1)

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 10 dan küçük bir tamsayı giriniz");
        Integer input=scan.nextInt();

        int faktoriyel=1;
        String acikyazilim="";

        for (int i = input; i >=1  ; i--) {
            faktoriyel *=i;

            if (i==input) {
                acikyazilim = acikyazilim + i; //input
            } else
                acikyazilim=acikyazilim + "*" +i ; //3*2*1
                }
        System.out.println(input+" ! = " + acikyazilim + " = " + faktoriyel); //3 ! = 3*2*1 = 6
        }
    }

