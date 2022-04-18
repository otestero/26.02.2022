package Day_26forEachLoop_Concrator;

import java.util.ArrayList;
import java.util.List;

public class C02_foreachLoop {
    public static void main(String[] args) {
        //10 elemantli bi r list oluşturalım
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> sayilar = new ArrayList<>();
        for (int each : arr
        ) {
            sayilar.add(each);
        }
        System.out.println(sayilar); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        for (int each : sayilar
        ) {
            if (each % 3 != 0) {
                System.out.print( each + " ");
            }
        }
    }
}
