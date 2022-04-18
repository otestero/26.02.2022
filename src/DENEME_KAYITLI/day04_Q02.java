package DENEME_KAYITLI;

public class day04_Q02 {
    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * lari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */
        int input []={1,2,3,4,5,6,7};
        int toplam=0;
        double ortalama=0;

        for (int i = 0; i < input.length; i++) {
            toplam+=input[i];
            ortalama=toplam/input.length;
        }System.out.println("ortalama = " + ortalama);

        for (int i = 0; i < input.length; i++) {
            if (input[i]>ortalama){
                System.out.println("Ortalamadan büyükler = " + input[i]);
            }
        }
    }
}
