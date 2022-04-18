package Day_32_DateandTime;

public class C06_Varargs {
    public static void main(String[] args) {

        // verieln iki sayiyi toplayan bir metot oluşturun

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int sayi4 = 40;
        int sayi5 = 50;
        toplagel();
        toplagel(sayi1);
        toplagel(sayi1, sayi2);
        toplagel(sayi1, sayi2, sayi3);
        toplagel(sayi1, sayi2, sayi3, sayi4);
        toplagel(sayi1, sayi2, sayi3, sayi4, sayi5);
    }

    private static void toplagel(int... sayi) {

        int toplam = 0;
        for (int each : sayi
        ) {
            toplam += each;
        }
        System.out.println(toplam);


        //System.out.println(sayi1 + sayi2);
    }

    //private static void toplagel(int sayi1, int sayi2, int sayi3) {
    //System.out.println(sayi1 + sayi2 + sayi3);
}