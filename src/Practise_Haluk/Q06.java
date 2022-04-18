package Practise_Haluk;

import java.util.*;

public class Q06 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1};
        List<Integer> tekrarsizList = new ArrayList<>();
        for (Integer s : arr) {//eleman yoksa add ile tekrarsız liste ekle eleman varsa geç
            if (!tekrarsizList.contains(s)) {
            tekrarsizList.add(s);

        }     Collections.sort(tekrarsizList);
        int tekrarsizArray[]=new int[tekrarsizList.size()];
        for (int i = 0; i < tekrarsizList.size(); i++) {
            tekrarsizArray[i]= tekrarsizList.get(i);

        }
            System.out.println( "ahanda sana her elemandan bir tane olan array  "+ Arrays.toString(tekrarsizArray));
    }

}
}
