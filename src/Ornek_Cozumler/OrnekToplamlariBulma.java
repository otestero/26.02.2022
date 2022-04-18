package Ornek_Cozumler;

public class OrnekToplamlariBulma {
    public static void main(String[] args) {
        /*
         * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
         * Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.

         */
        int arr1[][] = {{0, 2, -1}, {3, 8, 9}, {7}};
        int arr2[][] = {{-7, 6, -9}, {0, 12}, {19}};
        int toparr1 = 0;
        int toparr2 = 0;
        int toplam=   0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                toparr1 += arr1[i][j];
                for (int k = 0; k < arr2.length; k++) {
                    for (int l = 0; l < arr2[k].length; l++) {
                        toparr2=arr2[k][l];
                        toplam=toparr1+toparr2;
                    }
                }
            }
        }
        System.out.println("toparr1 = " + toparr1);
        System.out.println("toparr2 = " + toparr2);
        System.out.println("toplam = " + toplam);
    }
}