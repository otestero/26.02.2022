package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C02_ListeninElemtleriniArtırma {
    public static void main(String[] args) {
        //verilen listedki herelemnti 3 artırma

        List<Integer> liste = new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(6);
        liste.add(8);
        liste.add(9);
        System.out.println(liste); //[5, 7, 6, 8, 9]
       // Iterator itr = liste.iterator();
        ListIterator itr1 =liste.listIterator();

        while (itr1.hasNext()) {
           Object sayi= itr1.next();
            itr1.set((Integer)sayi+3);
        }System.out.println(liste);
    }
}