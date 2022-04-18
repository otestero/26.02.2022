package day43_Garbege;

public abstract class C04 {
    public abstract void absmethod1();
    public static void concreatMethod(){
        System.out.println("C04 concreat methot");
    }

    public static void main(String[] args) {
        //C04 obj=new C04();
        System.out.println("abstrak class");
        concreatMethod();
    }
}
