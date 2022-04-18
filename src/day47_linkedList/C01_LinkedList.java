package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll1=new LinkedList<>();
        ll1.add(10); //LinkedList

        List<Integer>ll2=new LinkedList<>();
        ll2.remove(0);

        Deque<Integer>ll3=new LinkedList<>();

        ll3.addLast(20);
        ll3.addFirst(1);


    }
}
