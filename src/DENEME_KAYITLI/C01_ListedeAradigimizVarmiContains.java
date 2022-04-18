package DENEME_KAYITLI;

import java.util.ArrayList;
import java.util.List;

public class C01_ListedeAradigimizVarmiContains {
    public static void main(String[] args) {
        List<String>harfler= new ArrayList<>();
        harfler.add("D");
        harfler.add("M");
        System.out.println(harfler);    // [D, M]
        harfler.add(1, "T");
        System.out.println(harfler);   //  [D, T, M]
        harfler.add(0,"t"); //[t, D, T, M]
        System.out.println(harfler);

        System.out.println("Girdiğiniz harf Listede var mı? = " + harfler.contains("t")); // true
        System.out.println("Girdiğiniz harf Listede var mı? = " + harfler.contains("k")); // false

        List<String>karakterler=new ArrayList<>();
        karakterler.add("A");
        karakterler.add("y");
        System.out.println(karakterler.containsAll(karakterler)); //true
        System.out.println("Girdiğiniz karakterler Listede var mı = " + karakterler.containsAll(karakterler));
    karakterler.add("u");
        System.out.println(karakterler.containsAll(karakterler));
    }
}
