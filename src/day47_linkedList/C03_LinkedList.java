package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_LinkedList {
    public static void main(String[] args) {
        Deque<Integer> ll1= new LinkedList<>();

        System.out.println(ll1);
        //ll1.remove();
        //System.out.println(ll1.remove());
        ll1.push(10);
        ll1.push(20);
        ll1.push(30);
        System.out.println(ll1);
        System.out.println(ll1.remove());
        System.out.println(ll1);
        ll1.removeFirstOccurrence(ll1);
    }
}
