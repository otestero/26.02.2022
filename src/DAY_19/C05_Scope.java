package DAY_19;

public class C05_Scope {

    // 1-bir
    // 2* tüm methotların kullanabilmeisini istediğimiz variablelerı
    // class levelde oluştururuz
    // Class levelde oluşturduğumuz variabe ı
    // -- statik yaparsak tüm metotlar kullanabilir.
    // -- statik olmazsa (instance) o zaman sadece static olmayan methodlar kullanabilir
    // 3- loop içinde oluşturulan variablelar loop içersisinde kullanılabilir ancak dışında kullanılamaz

    public static void main(String[] args) {
    //static int sayi4;
        int level=10;
    // isim="Veli YAn"
       // System.out.println(kurs);
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            int loopsayi=20;

        }
    }
    public static  void method1(){
    //sayi=20;
    }
    public  void method2(){
    //sayi=30;
    }
}
