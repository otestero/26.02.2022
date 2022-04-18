package Day_22Arrays;

import java.util.Arrays;

public class C08_Split {
    public static void main(String[] args) {
        // verilen bir cümlede istene harfin
        // kaç defa kullanıldığını yazdıran bir methot oluşturun
        String cumle="Nerede o 'hello world' yazdiramayan ogrenciler?";
        String harf="e";
        harfKacKereKullanilmiş(cumle, harf); // bizim yaptığımız methodumuz

    }

    private static void harfKacKereKullanilmiş(String cumle, String harf) {
        int sayac=0;
        String karakterler[]=cumle.split("");
        System.out.println(Arrays.toString(karakterler)); //[N, e, r, e, d, e,  , o,  , ', h, e, l, l, o,
        for (int i = 0; i < karakterler.length; i++) {
            if (karakterler[i].equals(harf)){
                sayac++;
            }
        }
        System.out.println("aradiğiniz " + harf + " harfi verilen cümlede " + sayac + " adet kullanılmkıstir" );
    }
}
