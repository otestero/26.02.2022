package DENEME;

public class Substring4 {
    public static void main(String[] args) {
        //Soru:
        // 1-48 of 104 result for "nutella" da 104 sayısının olduğu alanı bul
        //bulunana sonuç sayısı 100 den çok ise super
        // az ise "az sonuç bulundu"

        String str= "1-48 of the 87 result for \"nutella\"";

        int bb= str.indexOf(" ");
        int ib= str.indexOf(" ", bb+1);
        int ub= str.indexOf(" ",ib+1);
        int db= str.indexOf(" ", ub+1);

        String arana= str.substring(ub+1, db);

        int arananint=Integer.valueOf(arana);
        System.out.println(arananint);

        if (arananint>150) {
            System.out.println("Gayet iyi");
        } else {
            System.out.println("çok çalışmalısın");
        }
    }
}
