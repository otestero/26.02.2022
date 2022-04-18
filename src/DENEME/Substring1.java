package DENEME;

public class Substring1 {
    public static void main(String[] args) {

        //Soru:
        // 1-48 of 104 result for "nutella"
        //bulunana sonuç sayısı 100 den çok ise super
        // az ise "az sonuç bulundu"

        String str= "1-48 of 144 result for \"nutella\"";

        int ilkbosluk= str.indexOf(" ");                                 // 1-48 ile 0f arası (ilk boşluğu bul)
        int ikincibosluk= str.indexOf(" ", ilkbosluk+1);    // of ile 104 arası (" " boşluğu bul, ilk boşluktan itibaren)
        int ucuncubosluk= str.indexOf(" ", ikincibosluk+1); // 104 ile result arası (" " boşluğu bul ikinci boşluktan  itibaren)

        String aramaSonucuBulunanDeger= str.substring(ikincibosluk+1, ucuncubosluk); //ikincibosluk+1,
                                                                                    // buradaki +1,
                                                                                    //(250) için 2 den başla demek

        int aramaSonucuBulunanDegerInt=Integer.valueOf(aramaSonucuBulunanDeger);
        System.out.println(aramaSonucuBulunanDegerInt);

        if (aramaSonucuBulunanDegerInt>150){
            System.out.println("Süper");
        }   else {
            System.out.println("daha çok çalışmalısın");


    }
}}
