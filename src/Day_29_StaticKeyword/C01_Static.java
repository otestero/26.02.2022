package Day_29_StaticKeyword;

public class C01_Static {
    String okulIsmi= "Yıldız Koleji";
    static String okulTelefonu="3122553635";

    public  static void staticMethod(){
        System.out.println("Dtstik Metod çalıştı");
    }

    public void staticOlmayanMethod(){
        System.out.println("Statik olmayan");
    }
}
