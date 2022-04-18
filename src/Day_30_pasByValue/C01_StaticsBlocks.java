package Day_30_pasByValue;

public class C01_StaticsBlocks {

    static { // class çalışmaya bşalmadan önce gereken ön atamalar varsa onları yapar
        // static block clas ilk çalışmaya başlayınca devreye girer
        // clasın çalışmasıı için gerekli olan hazırlıklar için kullanılır.
        // yazıldığı satırın bir önemi yoktur. class içerisinde istenen yere yazılabilir.
        // statik block birden fazla ise yukarıdan aşağı doğru çalışır
        System.out.println("Static Blok çalıştı");
    }
    static {
        System.out.println("static blok 2 çalıştı");
    }


    C01_StaticsBlocks(){
        System.out.println("Constructor çalıştı");
    }


    public static void main(String[] args) {
        System.out.println("main metot bailangıcı");
C01_StaticsBlocks obj;
new C01_StaticsBlocks();
        System.out.println("main metod  sonu");
    }

}
