package day45_interface;

public interface I01_Default_Static {
    void method1();
    //void method2() budurumdan kurtarmak için aşağıdaki şekilde yazılır
    public default void method2(){
        System.out.println("interface default method");

    }

}
