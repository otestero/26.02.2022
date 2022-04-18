package DENEME_PRACTİCE;

import java.util.Arrays;

public class Q03_ArrReplaceİleKelimeDegistirme {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */
        String str="HeySiri";
        str=str.replace("Hey","Bye"); //str den "hey"i çıkartıp ""bye"ı ekledik
        System.out.println("str = " + str); //ByeSiri //
        String arrstr[]=new String[1];                 // "ByeSiri" yi koyacağımız arrstr 1 elementlik arrayını oluşturduk
        arrstr[0]=str;                                  // arrstr arrayınının 0.indeksine str ("ByeSiri") yi atadık
        System.out.println("arrstr = " +(Arrays.toString(arrstr))); // [ByeSiri] yazdırdık


        // 2. yol
        // str1 stringini "HeySiri" olarak tanımlıyoruz.
        // arrstr1 isimli arraya split ile "y" den öncesini ayırıyoruz
        // arrstr1 arrayının1. elementine "Bye" atıyoruz
        // str1 e arrstr1 in 0. arrst1 in 1 elemanını atıyoruz
        // String olarak "ByeSiri" yazdırıyoruz
        // yeniarr isimli bir array oluşturup str1 stringini buraya atıyoruz.
        // yeniarr arrayını "ByeSiri" olarak yazdırıyoruz.
        String str1 ="HeySiri";
        String arrstr1 []=str1.split("y");
        arrstr1 [0]="Bye";
        str1=arrstr1[0]+arrstr1[1];
        System.out.println("str1 Bye = " + str1);
        String yeniarr[]=new String[1];
        yeniarr[0]=str1;
        System.out.println("yeni Stringin arrayı = " + Arrays.toString(yeniarr));


    }
}
