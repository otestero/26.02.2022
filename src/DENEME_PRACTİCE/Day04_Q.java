package DENEME_PRACTİCE;

import java.util.Arrays;

public class Day04_Q {
    public static void main(String[] args) {
        /*
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */
        int sayi[]={2,6,4,5,8,9};
        int sayi1[] = new int[0];
        System.out.println(Arrays.toString(sayi));
        for (int i = 0; i < sayi.length ; i++) {
            sayi[i]*=sayi[i];
           sayi1=sayi;
        }
        System.out.println("Elemanların karesi: "+ Arrays.toString(sayi));
        for (int i = 0; i < sayi.length; i++) {
            sayi[i]*=sayi[i];
        }
        System.out.println("Elemanların karesi: "+ Arrays.toString(sayi));
    }
}
