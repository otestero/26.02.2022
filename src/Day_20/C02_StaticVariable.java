package Day_20;

public class C02_StaticVariable {

    //İntance variableler objeye bağımlıdırlar ve her obje faklı değerler alabilirler
    // öğrenci notları veya öğretmen branşları gibi bir objeye aitbir variable in son değerini bulmak için sadece o objeyi dikkate alır.

    //Static variableler ise class variable olarak tanımlarnır ve tüm

    static String okulIsmi="Yıldız Koleji";
    static int okulNo;
    static boolean okulAcikMi;


    public static void main(String[] args) {
        System.out.println(okulIsmi);   // yıldız koleji
        System.out.println(okulNo); //0
        okulNo=102;
        System.out.println(okulNo); //102
        System.out.println(okulAcikMi); //false

        staticMethod();  //methotcall metot çağırma satırı
        System.out.println(okulNo); //200
    }
    public static void staticMethod(){

        okulNo=200;
        System.out.println(okulNo); //200 konsolda 200 değerini göremeyiz.
                                    // main methodun içine staticMethod yazar çağırırsak 200 o zaman yazar

    }
}
