package Day_24_List;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {


        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("İlker");
        isimler.add("Oğuzhan");
        System.out.println(isimler);
       boolean sonuc= isimler.remove("Oğuzhan"); // true
        System.out.println(isimler);

        if (sonuc==true){
            System.out.println("silindi");
        }else{
            System.out.println("İstediğiniz isim bunamadığından silinemedi");
    }
        System.out.println(isimler.remove(1));// yusufu sile ve delil olarak yusuf ismini döndürür
        System.out.println(isimler); //[Aykut, İlker]
}}
