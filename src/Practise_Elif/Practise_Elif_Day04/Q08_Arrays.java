package Practise_Elif.Practise_Elif_Day04;

public class Q08_Arrays {
    public static void main(String[] args) {


        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */
        /*
         * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
         * Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.

         */
        int arr1 [][] = { {0,2,-1}, {3,8,9}, {7}};
        int arr2 [][]= {{-7,6,-9}, {0,12}, {19}};
        int toplam=0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                toplam+=arr1[i][j];
            }
        }
        System.out.println("toplam = " + toplam);
    }
}
