package Day_25;

import java.util.ArrayList;
import java.util.List;

public class C03_ListtenIstenmeyenElementleriSilme {
    public static void main(String[] args) {
        // verilen bir arraydan istenen elementi silip kalanları
        // yeni bir array olarak yazdıran bir metod oluşturun
        // Aynı sorutyu Listle yapacağız
        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyeneleman=3;

        istenmeyenElementiSilveYazdir(arr,istenmeyeneleman);
    }

    public static void istenmeyenElementiSilveYazdir(int[] arr, int istenmeyeneleman) {

        List<Integer>yeniList=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=istenmeyeneleman){
                yeniList.add(arr[i]);
            }
        }
        System.out.println(yeniList);
    }
}
