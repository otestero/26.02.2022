package Day_11;

import java.util.Locale;
import java.util.Scanner;

public class lenght {
    public static void main(String[] args) {
        // kullanıcıdan ismini alıp bas harfini ve
        // son harfini büyük harflerle yazıdırın
        Scanner scan= new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String  isim= scan.nextLine();

        System.out.println("ilk Harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));

        String str1="";
        System.out.println(str1.length());// 0
        String str2=null;
        System.out.println(str2.length());

        //String str2=null;
       // System.out.println(str2);

        //String str3;
       // System.out.println(str3);

    }

}
