package day_34_accessModifiier;

public class C04_Encapsulation {
    public static void main(String[] args) {
        C03  obj= new C03();
obj.getSayi();
        System.out.println(obj.getSayi());//0
        obj.setStr("java java java");
        System.out.println(obj.getStr());//java java java
        System.out.println(obj);// C03{sayi=0, str='java java java'}
    }
}
