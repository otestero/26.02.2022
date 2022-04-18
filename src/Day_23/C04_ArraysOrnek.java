package Day_23;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArraysOrnek {
    public static void main(String[] args) {
        // kullanıcıya kaç elementlik bir array oluşturacağını sorun
        //Arrayi oluşturup elementleri kullanıcıdan alıp arraye atayın
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfe Kaç elementli bir array istediğiniz yazınız");
        int uzunluk= scan.nextInt(); // 5
        int arr[]=new int[uzunluk];  // [0,0,0,0,0]

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Array için "+ (i+1) + ". elemanı giriniz");
            arr[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
