package Day_11;

import java.util.Locale;
import java.util.Scanner;

public class StringManpilation {
    public static void main(String[] args) {

        String str= "Java Güzeldir";

        // Biz string metotlarını arka arakaya kullanabiliriz
        // İkince kelimenin ilk harfini küçük olarak yazdıralım

        // str.charAt() böyle yazdığımız da sonuç artık string değil char olacaktır
        // dolayısıyla stringde yapmak istediğimiz tüm değişiklilkleri önce yapıp sonra
        // charAT metodunu kullanmalıyız.

        System.out.println(str.toLowerCase().charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));//JAVA GÜZELDİR
        System.out.println(str.toUpperCase(Locale.forLanguageTag("fr")));// JAVA GUZELDIR





    }

}
