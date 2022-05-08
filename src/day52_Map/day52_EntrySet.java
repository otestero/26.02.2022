package day52_Map;

import day49_maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class day52_EntrySet {
    public static void main(String[] args) {
       Map<Integer,String> sinifListMap= MapOlustur.myMap(); //MapOlustur call ettik
        System.out.println(sinifListMap);

        Set<Map.Entry<Integer, String>> sinifListSeti=sinifListMap.entrySet();

      for (Map.Entry<Integer,String> each: sinifListSeti){
         Integer entryKey=each.getKey();
         String valueStr=each.getValue();

         String valueArr []=valueStr.split(", ");
          System.out.printf("%-4d %-6s %-9s %-6s \n", entryKey,valueArr[0], valueArr[1], valueArr[2]);

      }
    }
}
