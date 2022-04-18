package day46_iterator_collections;

import java.util.LinkedList;

public class C05_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(5);
        list.add(10);
        list.addFirst(11);
        list.addLast(12);
        System.out.println(list); //[11, 5, 10, 12]
        list.add(2,25);
        System.out.println(list);  //[11, 5, 25, 10, 12]
    }
}
