package day07_ifStatments;

public class C02_ifstate {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a < b && b < 100) {
            System.out.println("isteğiniz gerçekleşecek");
            System.out.println("body içindeki tüm kodlar çalışır");
        }

        if (a<0) System.out.println("süslü parantez olmassa sadece bir satır çalışır");
        System.out.println("ikinci satırda çalıştı");


    }
}
