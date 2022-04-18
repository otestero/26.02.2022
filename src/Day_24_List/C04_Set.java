package Day_24_List;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {
        List<String > isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("İlker");
        isimler.add("Oğuzhan");
        System.out.println(isimler); // [Aykut, Yusuf, İlker, Oğuzhan]

        isimler.set(1,"Seckin");
        System.out.println(isimler); // [Aykut, Seckin, İlker, Oğuzhan]

        // daha önceden  listede olanlarıda arşiv olaark tutmak istiyorsak
        List<String > LogListesi=new ArrayList<>();

        LogListesi.add(isimler.set(2,"Cosmos"));
        System.out.println(isimler);    // [Aykut, Seckin, Cosmos, Oğuzhan]
                                        // 2. indeksteki ismi alır Cosmosu yerine koyar İlkeride Loga koyar
        System.out.println(LogListesi); // [İlker]

    }
}
