package Ornek_Cozumler;

public class SayiCiftleriBulma {
    public static void main(String[] args) {
        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
         * istenenToplam=9;
         */
        int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};
        int toplam = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-1; j++) {
                if (toplam == arr[i] + arr[j]) {
                    System.out.print(" "+ arr[i] + "+" + arr[j] + "=" +"9");

                }

            }
        }

    }
}