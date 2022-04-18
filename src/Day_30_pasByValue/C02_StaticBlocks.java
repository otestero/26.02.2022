package Day_30_pasByValue;

public class C02_StaticBlocks {
    {    // statik olmayan bloklar obje oluştururken çalışır.
        // statik bloklar sadece 1 kere en başta çalışır ama
        // statik olmayan bloklar her obje oluşturulurken yeniden çalışır
        System.out.println("statik olmayan instance blok çalıştı");
    }
    static {
        System.out.println("statik blok  çalıştı");
    }

    public static void main(String[] args) {
        System.out.println("main metot başı");

        C02_StaticBlocks obj1=new C02_StaticBlocks();
        C02_StaticBlocks obj2=new C02_StaticBlocks();
    }
}
