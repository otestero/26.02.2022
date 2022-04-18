package DENEME_KAYITLI;

import java.util.Arrays;

public class day04_Q03 {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         */
        String str="HeySiri";
        str=str.replace("Hey","Bye");
        String arrstr []=new String[1];
        System.out.println(str);            // ByeSiri
        arrstr[0]=str;
        System.out.println(Arrays.toString(arrstr)); // [ByeSiri]
    }
}
