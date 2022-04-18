package Day_23;

import java.util.Arrays;

public class C06_ArraysOrnek {
    public static void main(String[] args) {
        // verilen bir arrray e yeni bir element ekleyen bir metot oluşturun
        int arr[]={3,5,7};
        int eklenecekElement=9;

        arr=arrayeElemanEkle(arr,eklenecekElement);
        arr=arrayeElemanEkle(arr,8);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayeElemanEkle(int[] arr, int eklenecekElement) {
        int yeniArray[]=new int[arr.length+1]; //[0,0,0,0]
        for (int i = 0; i < arr.length; i++) {
            yeniArray[i]=arr[i];

        }yeniArray[yeniArray.length-1]=eklenecekElement;
        return yeniArray;
    }
}
