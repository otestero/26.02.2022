package DENEME_PRACTİCE;

public class Q04_ArraydaToplamlariEsitOlanSayiCiftleriniYazdirma {
    public static void main(String[] args) {
        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
         * istenenToplam=9;
         */
        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenentoplam=9;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) { // j=i+1 1+8 yazdıktan sonra
                                                        // 8+1 tekrar yazmasın diye yazıldı
                if (istenentoplam==arr[i]+arr[j]){

                    System.out.print("ikililer: "+ arr[i] +"+"+arr[j] + "="+ "9");
                    System.out.println("");
                    // System.out.println("toplamı9 a eşit olanlar = " + j)
            }

        }

        }

    }
}
