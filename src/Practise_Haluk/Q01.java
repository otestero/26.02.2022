package Practise_Haluk;

import java.util.ArrayList;
import java.util.Arrays;

public class Q01 {
    public static void main(String[] args) {
        ArrayList<String>isimler=new ArrayList<String>(Arrays.asList("Ali", "Veli", "Ayse","Fatma","Omer"));
        ArrayList<String>aOlmayanlarListesi=new ArrayList<String>();

        for (String w: isimler){
             if (!w.toLowerCase().contains("a")){
                 aOlmayanlarListesi.add(w);
             }

        }
        System.out.println("a olamayanların isimleri: " + aOlmayanlarListesi); //[Veli, Omer]
        isimler.clear();
        isimler.addAll(aOlmayanlarListesi);
        System.out.println(isimler);
    }
}
