package Practise_Haluk;

import java.util.ArrayList;

public class Q10 {
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        System.out.println(ardisikTopla(arr));
    }

    private static ArrayList<Integer> ardisikTopla(int[] arr) {
        ArrayList<Integer> toplananSayilarList = new ArrayList<>();
        int count = 0;
        int toplananSayiAdedi = 1;
        while (arr.length - toplananSayiAdedi >= count) {
            int toplam = 0;
            for (int i = 0; i < count; i++) {
                toplam += arr[toplananSayiAdedi - 1 + i];


            }
        }
        return toplananSayilarList;
    }
}

