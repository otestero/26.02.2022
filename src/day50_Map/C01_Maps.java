package day50_Map;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap=MapOlustur.myMap();
        System.out.println(sinifListMap);

        Set<Integer> sinifKeySeti=sinifListMap.keySet();
        List<Integer>keyList=new ArrayList<>();
        keyList.addAll(sinifKeySeti);
        System.out.println(keyList.get(2));

        Collection<String>sinifValueColl=sinifListMap.values();
        System.out.println(sinifValueColl);

        List<String>sinifValueList= new ArrayList<>();
        sinifValueList.addAll(sinifValueColl);
        System.out.println("sinifValueList = " + sinifValueList); //[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]

        int outerArrayBoyut=sinifValueList.size();
        System.out.println("outerArrayBoyut = " + outerArrayBoyut);//3,

        String ilkValue=sinifValueList.get(0);
        System.out.println("ilkValue = " + ilkValue);

        String ilkValueArray[]=ilkValue.split(", ");
        int innerArrayBoyut=ilkValueArray.length;

        String valueMDA[][]=new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i < outerArrayBoyut; i++) {
            String temp[]= sinifValueList.get(i).split(", ");
            for (int j = 0; j < innerArrayBoyut; j++) {

                valueMDA[i][j]=temp[j];
            }
        }
        for (int i = 0; i < keyList.size(); i++) {
            System.out.print( "keyList.get(i) = " + keyList.get(i)+" ");
            for (int j = 0; j < innerArrayBoyut; j++) {
                System.out.print( valueMDA[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
