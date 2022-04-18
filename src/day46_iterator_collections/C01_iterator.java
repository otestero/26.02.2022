package day46_iterator_collections;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_iterator {
    public static void main(String[] args) {
        List<Integer> liste=new ArrayList<>();
        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(9);
        System.out.println(liste);

        Iterator itr= liste.iterator();

        System.out.println(itr.hasNext());// true  [(itr)5, 6, 7, 8, 9]
        System.out.println(itr.next());//5
        System.out.println(itr.next());//6
        System.out.println(itr.next());//7
        itr.remove();//5 6 7
    }
}
