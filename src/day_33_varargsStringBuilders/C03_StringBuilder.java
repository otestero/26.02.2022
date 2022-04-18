package day_33_varargsStringBuilders;

public class C03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder("Java çok güzeldir");
        StringBuilder sb3=new StringBuilder(10);

        System.out.println("sb1 lenght  : " + sb1.length());  // 0
        System.out.println("sb1 capacity: " + sb1.capacity());// 16

        System.out.println("sb2 lenght  : " + sb2.length());  // 17
        System.out.println("sb2 capacity: " + sb2.capacity());// 33

        System.out.println("sb3 lenght  : " + sb3.length());  // 0
        System.out.println("sb3 capacity: " + sb3.capacity());// 10

        sb1.append("Java").append(" ").append("cok").append(" ").append("güzei");
        System.out.println("sb1 lenght: " + sb1.length()); //14
        System.out.println("sb1 capacity: " + sb1.capacity()) ;//

        sb1.trimToSize();
        System.out.println(sb1.length());
    }
}
