package day46_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03_ListeyiTerstenYazdirma {
    public static void main(String[] args) {
        // bir listeyi, sondan başa doğru yazdırma

        List<Integer> liste = new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(6);
        liste.add(8);
        liste.add(9);
        // once iteratoru  oluşturup sona yollama
        ListIterator itr=liste.listIterator();
        while (itr.hasNext()){
            itr.next();
        }
        while (itr.hasPrevious()){
            System.out.print(itr.previous() +" "); // 9 8 6 7 5
        }
    }

}
