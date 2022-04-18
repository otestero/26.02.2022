package DENEME;

public class StringSayilariToplama {
    public static void main(String[] args) {

        //Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String str1 = “$13.99”
        // String str2 = “$10.55”
        // ipucu : Double.parseDouble() methodunu kullanabilirsiniz.

        String str1="$13.99";
        String str2="10.55";

        str1=str1.replaceAll("\\D", "");
        str2=str2.replaceAll("\\D", "");
        System.out.println(str1);
        System.out.println(str2);

        double str1sayi= Double.valueOf(str1);
        double str2sayi= Double.parseDouble(str2);

        System.out.println(str1sayi);
        System.out.println(str2sayi);

        double sonuc= (str1sayi+str2sayi)/100;

        System.out.println("$"+ sonuc);
    }
}
