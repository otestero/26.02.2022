package Day_23;

import java.util.Arrays;

public class C01_MultiDArray {
    public static void main(String[] args) {
        int arr[][]={{3,1,7},{6,10,2}};
        System.out.println(arr[0][2]);// 7
        System.out.println(arr[1][1]);//10

        // İlk inner arrayin tüm elementlerinie yazdırın
        System.out.println(arr[0]); // arr[0] bir array olduğundan direkt yazdırılamamaz[I@58372a00
        System.out.println(Arrays.toString(arr[0])); //[3, 1, 7]
        System.out.println(Arrays.toString(arr)); // [[I@58372a00, [I@4dd8dc3]

        //Multi Dimestion da tüm elementleri array olarak yazdırmak istersek

        System.out.println(Arrays.deepToString(arr)); //[[3, 1, 7], [6, 10, 2]]
    }
}
