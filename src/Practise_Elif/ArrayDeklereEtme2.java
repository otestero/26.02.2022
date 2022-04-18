package Practise_Elif;

import java.util.Arrays;

public class ArrayDeklereEtme2 {
    public static void main(String[] args) {
        String arr1[]={"Ali", "Veli", "Ayşe"};
        System.out.println(arr1[0]); // Ali
        System.out.println(arr1[1]); // Veli
        System.out.println(arr1[2]); // Ayşe

        arr1[0]="Bugün";
        arr1[1]="Esila";
        arr1[2]="Gel";
        System.out.println(arr1[0]+ " " + arr1[1]+ " " + arr1[2]);

        int arr2[]=new int[4];
        System.out.println(arr2[1]); //0
        System.out.println(arr2[3]); //0
        System.out.println(" ");
        System.out.println(arr2);    //[I@1d81eb93
        for (int i = 0; i < 4; i++) {                     // bu for loop'u yerine
            System.out.print(arr2[i]+ " 23 ");              // toString() methodu kullanılır.

        } System.out.println("25. satır" + Arrays.toString(arr2));   //[0, 0, 0, 0]

        arr2[1]=11;
        arr2[3]=20;
        arr1[2]="Can";
        System.out.println("30" +Arrays.toString(arr2));
        System.out.println("31"+ Arrays.toString(arr1));
    }
}
