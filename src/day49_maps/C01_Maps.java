package day49_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {
        List<Object>list=new ArrayList<>();
        list.add("Ergin");
        list.add(10);
        list.add(10.2);
        System.out.println(list);
        list.set(1,(Integer)(list.get(1))+10);
        Map<Integer,String> sinifList= new HashMap<>();
        sinifList.put(101,"Ali, Can, Dev, 1453");
        sinifList.put(102,"Veli, Yan, QA, 1990");
        sinifList.put(103,"Ali, Yan, Dev, 200");
        sinifList.put(104, "Ayse, Kan, C#, 2002");
        System.out.println("sinifList          = " + sinifList);          //{101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, Dev}
        System.out.println("sinifList.keySet() = " + sinifList.keySet()); //[101, 102, 103]
        System.out.println("sinifList.values() = " + sinifList.values()); //[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, Dev]

    }
}
