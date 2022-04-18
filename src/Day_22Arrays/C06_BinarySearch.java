package Day_22Arrays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {
        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=-35;
        // Eğer Javadan hazir BinarySerash ile yapmakistersek
        // önce sort methodunu kullanıp, sonrabinarySerch  yapmalıyız.
        // binarySerch() metodu bize istene sayının olduğu indeksi verir.
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        System.out.println(Arrays.binarySearch(arr, istenenSayi)); //2 bize istediğimiz elementin indeksini döner

        // Eğer olmayan bir elemneti aratırsak.
        // Java bulamadığını göstermek için - işareti koyar
        // sonrada o sayı olsaydı sıralaması ne olurdu ise o sırayı bize verir
    }
}
