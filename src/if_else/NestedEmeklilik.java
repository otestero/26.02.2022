package if_else;

import java.util.Scanner;

public class NestedEmeklilik {
    public static void main(String[] args) {
        //Eğer açlılan kadındsa

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen Cinsiyetinizi Yazınız"+
                "\nkadın için K \nerkek için E harfi giriniz");
        char cinsiyet= scan.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yasınızı giriniz");
        double  yas=scan. nextDouble();

        if (cinsiyet=='K'){

            if (yas<0 || yas>20){
                System.out.println("girdiğiniz yas değerini kontrol ediniz");
            } else if(yas<60){
                System.out.println("emekli olamazsın \nDaha   "+ (60-yas) + "yıl yıl çalışman gerekir");
            } else System.out.println("Emekli olabilirsin");

        } else if (cinsiyet=='E'){

        } else {

            System.out.println("lütfen Cinsiyet için geçerli bir harf giriniz");
        }
    }
}
