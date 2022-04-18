package Day_21rray;

import java.util.Arrays;

public class C02_Arryas {
    public static void main(String[] args) {
        String arr1[]={"Ali", "Veli","Ayse"}; //array içindeki elementere ulaşabilmek için index kullanırız
        System.out.println(arr1[0]); // Ali
        arr1[1]="Esila";
        System.out.println(arr1[1]); //Esila  arrayin içindeki index kullanarak elementlere
                                        // ulaşabilir ve update edebiliriz
        int arr2[]= new int[4];
        System.out.println(arr2[1]);//0
        System.out.println(arr2[3]);//0
        System.out.println(arr2);   // refaeransı verir. [I@58372a00  arratler non primitive olduğundan
        System.out.println(Arrays.toString(arr1));//[Ali, Esila, Ayse]
        System.out.println(Arrays.toString(arr2)); //[0, 0, 0, 0]
    }
}
