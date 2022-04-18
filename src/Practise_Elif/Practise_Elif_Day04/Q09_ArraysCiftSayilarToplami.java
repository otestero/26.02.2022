package Practise_Elif.Practise_Elif_Day04;

import java.util.Arrays;

public class Q09_ArraysCiftSayilarToplami {
    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */
        int input [][]={{1,3,6},{2,8},{5,7,9,14}};
      çiftsayilarintopla(input);
    }

    private static void çiftsayilarintopla(int[][] input) {
        int sayac = 0;
        int toplam = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] % 2 == 0) {
                    toplam += input[i][j];
                    sayac++;
                int ciftler=input[i][j];

                int ddd[]= new int[ciftler];

                //int ddd[]= new int[ciftler];
                   ddd[0]=input[i][j];
                    //ddd[1]=input[i][j];
                   // ddd[2]=input[i][j];
                   // ddd[3]=input[i][j];
                    System.out.println(Arrays.toString(ddd));
                    System.out.println(ciftler);
                }
            }

        }System.out.println(" Arraydaki Çift sayıların Toplamı: " + toplam);
        System.out.println(sayac + " adet çift sayı vardır.");
    }}
