package DENEME;

public class substring {
    public static void main(String[] args) {

        //Soru:
        // 1-48 of 104 result for "nutella"
        //bulunana sonuç sayısı 100 den çok ise super
        // az ise "az sonuç bulundu"

        String str="1-48 of 75 result for \"nutella\"";

        int ilkspace=str.indexOf(" "); // 4
        int ikincispace=str.indexOf(" ",ilkspace+1);    //
        int ucuncuspace=str.indexOf(" ",ikincispace+1); //

        String aramaSonucSayisiStr= str.substring(ikincispace+1,ucuncuspace);
        int aramaSonucSayisiInt= Integer.valueOf(aramaSonucSayisiStr);

        System.out.println(aramaSonucSayisiInt);

        if (aramaSonucSayisiInt>100){
            System.out.println("Süper");} else {System.out.println("az sonuç bulundu");



    }
}}
