package Day_23;

import java.util.Arrays;

public class C05_ArraysOrnek {
    public static void main(String[] args) {
        // verilen bir arrray e yeni bir element ekleyen bir metot oluşturun
        int arr[]={3,5,7};
        // arr[3]=8; arrayde olmayan bir indekse atmaa yapamayız
        arr=new int[4]; //[0, 0, 0, 0]
        System.out.println(Arrays.toString(arr));

        int arrYeni[] = new int[5];
        arr=arrYeni;
        System.out.println(Arrays.toString(arr));

        arrYeni[0]=2;
        arrYeni[3]=5;

        arr=arrYeni;
        System.out.println(Arrays.toString(arr));

    }
}
