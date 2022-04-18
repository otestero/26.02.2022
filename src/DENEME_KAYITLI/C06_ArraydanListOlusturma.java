package DENEME_KAYITLI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ArraydanListOlusturma {
    public static void main(String[] args) {
        // verilen bir array'i listeye cevirin

        String arr[]={"A" , "B" , "C"};
        List<String> arraydenList= Arrays.asList(arr);

        // arrayden liste cevirdigimiz zaman yeni listin uzunlugunu degistiremeyiz
        // dolayisiyla yeni list ile add() , remove(), clear() gibi method'lar calistirmak
        // istedigimizde Exception olusur

        // arraydenList.add("J"); // UnsupportedOperationException
        System.out.println("19.satirda list :" + arraydenList);

        arr[1]="F";  //Arr yi değiştirerek Listi değiştirebiliriz

        System.out.println("23.satirda Array : " + Arrays.toString(arr));
        System.out.println("24.satirda list :" + arraydenList);

        arraydenList.set(0,"Y");

        System.out.println("28.satirda Array : " + Arrays.toString(arr));
        System.out.println("29.satirda list :" + arraydenList);

    }
}