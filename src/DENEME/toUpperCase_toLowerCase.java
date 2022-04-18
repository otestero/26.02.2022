package DENEME;

import java.util.Locale;

public class toUpperCase_toLowerCase {
    public static void main(String[] args) {
        String isim="TechProeDucation";

      //  System.out.println(isim.toUpperCase());
      //  System.out.println(isim.toLowerCase());

       // String isim= "TECHPROEDUCATİON";
        System.out.println(isim.toUpperCase(Locale.forLanguageTag("En")));
        System.out.println(isim.toLowerCase(Locale.forLanguageTag("En")));
        System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));
        System.out.println(isim.toUpperCase(Locale.forLanguageTag("Fr")));

    }
}
