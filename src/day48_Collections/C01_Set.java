package day48_Collections;

import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        // verilen bir arayyin tekrar eden elementlerini
        // sadece bir kere yazdıran bir metot oluşturunuz.
        Integer [] arr={3,5,4,6,3,1,2,7,8,6,1,4,2,8};
        arriTekrarsizYazdir(arr);
    }
    private static void arriTekrarsizYazdir(Integer[] arr) {
        Set<Integer> tekrarsizElementKumesi=new HashSet<>();
        for (Integer each: arr
             ) {tekrarsizElementKumesi.add(each);
        }
        System.out.println(tekrarsizElementKumesi);
    }
}
