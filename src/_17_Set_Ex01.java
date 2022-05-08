import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class _17_Set_Ex01 {
    public static void main(String[] args) {


    /* TASK:
parametresi Integer set ve integer array ve adi elementEkle
olan array elemenalrı set'e convert eden bir method create ediniz .
yine set icindekileri yazdiracak ayrica bir metod daha create edip print ediniz.
 */

        Integer set;
        int arr[] = new int[]{1, 2, 3, 4, 5, 6};
        HashSet<Integer> hs = new HashSet<>();

        elementEkle(hs, arr);
    }

    private static void elementEkle(HashSet<Integer> hs, int[] arr) {
        HashSet<Integer> hs2 = new HashSet<>();
        for (Integer each : arr
        ) {
            hs.add(each);

        }
        }
    }