package Practise_Elif;

import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
        int sayi[];
        sayi =new int[6];
        System.out.println(Arrays.toString(sayi)); //[0, 0, 0, 0, 0, 0]
        System.out.println(sayi.length);           // 6
        for (int i = 0; i < sayi.length; i++) {
            sayi[i]+=i;
        }
        System.out.println(Arrays.toString(sayi)); // [0, 1, 2, 3, 4, 5]
        System.out.println(sayi[sayi.length-1]);   // 5
    }
}
