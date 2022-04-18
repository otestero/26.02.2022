package day_40_Overridding;

public class C02 extends C01{
    @Override
    public void method1() { // generetten overriding yapınca geliyor
        System.out.println(" Child method2");

    }

    public static void main(String[] args) {

        C02 obj=new C02();
        obj.method1();   //PM1
        obj.method2();   // CM2


        C01 obj2=new C02();
        obj2.method1();     //PM1
        obj2.method2();   //PM2

        C01 obj3=new C01();
        obj3.method1();     //PM1
        obj3.method2();   //PM2

    }
}
