package Day_20;

public class C01_Instance {
    int sayi;          //intense variable object
    String bransIsmi= "Java";
    boolean okuldaMi;

    public static void main(String[] args) {
        // sayi=10; variable'ı static olmadığı için main metotta direkt olarak kullanılamaz
        //İnstance variablelare static methotlardaan ulaşabilömemiz için obje oluşturmamız gerekir

        C01_Instance obje1=new C01_Instance();
        System.out.println(obje1.sayi); // 0
        obje1.sayi=10;
        System.out.println(obje1.sayi);//10
        obje1.bransIsmi="SQL";
        System.out.println(obje1.okuldaMi);//false

        C01_Instance obje2=new C01_Instance();
        System.out.println(obje2.sayi); // 0
        System.out.println(obje2.bransIsmi);//JAVA

        obje1.okuldaMi=true;
        System.out.println(obje2.okuldaMi); //

    }
}
