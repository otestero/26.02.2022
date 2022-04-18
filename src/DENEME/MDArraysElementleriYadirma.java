package DENEME;

import java.util.Arrays;

public class MDArraysElementleriYadirma {
    public static void main(String[] args) {
        int arr[][]={{3,1,7},{6,10,2}};
        System.out.println(arr[0][2]);//7
        System.out.println(arr[0][0]);//3
        System.out.println(arr[0][1]);//1
        System.out.println(arr[1][0]);//6
        System.out.println(arr[1][1]);//10
        System.out.println(arr[1][2]);//2

        // ilk inner array'in tum elementlerini yazdirin
        System.out.println(arr[0]); //[I@58372a00
        System.out.println(Arrays.toString(arr[0])); //[3, 1, 7]
        System.out.println(Arrays.toString(arr[0])+Arrays.toString(arr[1])); //[3, 1, 7][6, 10, 2]

        // MDArray'de tum elementleri bir array olarak yazdirmak istersek
        System.out.println(Arrays.deepToString(arr)); //[[3, 1, 7], [6, 10, 2]]
    }
}
