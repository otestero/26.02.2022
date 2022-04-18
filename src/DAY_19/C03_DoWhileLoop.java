package DAY_19;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        // kullanıcıdan bir pozitif tam sayı alıp
        int input = 3;
        int sayi = 1;
        // int sayac = 1;
        while (sayi < input) {
            System.out.println(sayi);
            //  sayac++;
            sayi++;
        }

        // sayi=1;
        do {
            System.out.println(sayi);
            sayi++;
        } while (sayi < input);
    }
}

