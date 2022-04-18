package DENEME;

public class Substring3 {
    public static void main(String[] args) {

        //Soru:
        // 1-48 of 104 result for "nutella" da 104 sayısının olduğu alanı bul
        //bulunana sonuç sayısı 100 den çok ise super
        // az ise "az sonuç bulundu"

        String str= "1-48 of 144 result for \"nutella\"";

        int ilkb= str.indexOf(" "); // önce ilk boşluğu ara,
        int ikincib= str.indexOf(" ", ilkb+1); //sonra ikinci baoşluğu ara,
        int ucuncub= str.indexOf(" ", ikincib+1); //sonra üçüncü boşluğu ara

        String asonucu=str.substring(ikincib+1, ucuncub); // sonra ikinci baoşluk ile üçüncü boşluk arasını bul
        Integer asonucuint= Integer.valueOf(asonucu); // string değeri integer değerine çevir

        System.out.println(asonucuint);


    }
}
