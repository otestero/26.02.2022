package DENEME;

import java.util.Locale;

public class ilkHarfiKucukYazdırma {
    public static void main(String[] args) {
        String str="Java Güzeldir";

        System.out.println(str.toLowerCase().charAt(5));
        System.out.println(str.toUpperCase().charAt(8));
        System.out.println(str.toUpperCase().charAt(10)+" "+ str.toUpperCase().charAt(9));

    }
}
