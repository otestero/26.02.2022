package Day_15;

public class C07 {
    public static void main(String[] args) {
        String str="Ali";
       // Stringyazdirmetodo(str);
        // hoş geldiniz diyen bir metot oluşturun
        //hosgeldinYazdir();

        hosgeldinYazdir();
        Stringyazdirmetodo("Güzelleşelim");
        KapanmaMetodu();
    }

    private static void hosgeldinYazdir() {
        System.out.println("Hoş Geldin");

        // kapanma mesajı yazan bir metot oluşturalım
       // KapanmaMetodu();
    }

    private static void KapanmaMetodu() {
        System.out.println("Bizi Tercih Ettiğiniz için teşekkür ederiz");
    }

    private static void Stringyazdirmetodo(String str) {
        System.out.println(str);
    }
}
