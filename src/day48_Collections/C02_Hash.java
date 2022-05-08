package day48_Collections;

import java.util.HashSet;
import java.util.Set;

public class C02_Hash {
    public static void main(String[] args) {
        String str= "Java çok güzel";
        System.out.println(str.hashCode());//1456613201
        String str2="Hava çok güzel";
        System.out.println(str2.hashCode());// -1827236845

        Set<Integer> sayiKumesi=new HashSet<>();
        System.out.println(sayiKumesi.hashCode());// 0
        sayiKumesi.add(10);
        System.out.println(sayiKumesi.hashCode()); // 10
        sayiKumesi.add(20);
        System.out.println(sayiKumesi.hashCode()); //30


    }
}
