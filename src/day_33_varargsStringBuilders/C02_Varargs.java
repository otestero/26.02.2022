package day_33_varargsStringBuilders;

public class C02_Varargs {
    public static void main(String[] args) {
        // Parametere olarak bir int
        // ve istediğimiz kadar String alan
        // en uzun kelimenin harf sayisi ile int parametre değerini
        // çarpıp sonucu yazdıran bir method oluşturun


        int sayi =5;
        String str1 = "Zulal";
        String str2= "Zeynep";
        carpim(sayi,str1,str2);

    }

    private static void carpim(int sayi, String... str) {

        String enUzunStr="";

        for (String each:str
        ) {
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;

            }

        }
        System.out.println(enUzunStr.length()*sayi);

    }
}
