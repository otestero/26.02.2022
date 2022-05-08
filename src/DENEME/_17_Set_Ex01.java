package DENEME;

import java.util.HashSet;

public class _17_Set_Ex01 {
    public static void main(String[] args) {
        /* TASK:
    parametresi Integer set ve integer array ve adi elementEkle
    olan array elemanalrı set'e convert edn bir method create ediniz .
    yine set icindekileri yazdiracak ayrica bir metod daha create edip print ediniz.
*/
        int [] set={1,2,3,4,5,6,7};
        int [] arr={34,35,45,61,38,41};
        elementtEkle(set,arr);
    }
    private static void elementtEkle(int[] set, int[] arr) {
        HashSet<Integer>setlist=new HashSet<>();
      for (int i = 0; i < set.length; i++) {
            setlist.add(set[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            setlist.add(arr[i]);
        }
       yazdir(setlist);
    }
       private static void yazdir(HashSet<Integer> setlist) {
        System.out.println(setlist);
    }
}
