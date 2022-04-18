package Day_21rray;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        int arr[]; //değer atamadık ama java kabul eder
                    //Ancak kullanmamıza izin vermez.
                    // Arrayın tamamaının defoultu aolmaz
        arr=new int [6];
        System.out.println(Arrays.toString(arr)); //[0, 0, 0, 0, 0, 0]
        System.out.println(arr.length);   // 6 arrayın element sayısını verir
                                            // string deki lenght() parantez vardır. arrayde yoktur
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=i;

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-1]);
    }
}
