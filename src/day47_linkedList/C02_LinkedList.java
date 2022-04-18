package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        Deque<Integer> ll1=new LinkedList<>();
        ll1.addFirst(10);

        ll1.addLast(20);
        //ll1.element();
        System.out.println(ll1);
        System.out.println(ll1.element());
        System.out.println(ll1.getLast());
        ll1.offer(30);
        System.out.println(ll1);
        ll1.offerFirst(50);
        System.out.println(ll1);
        ll1.offerFirst(45);

        System.out.println(ll1);
        ll1.peek();
        System.out.println("ne dönecek  "+ ll1.peek());
        ll1.poll();
    }
}
