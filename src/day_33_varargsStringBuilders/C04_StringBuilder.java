package day_33_varargsStringBuilders;

public class C04_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Yaşasın Java");
        System.out.println(sb1.indexOf("Java")); // 8

        System.out.println(sb1.lastIndexOf("s"));//4
        System.out.println(sb1.replace(0,7,"Ne güzel")); // Ne güzel Java

        System.out.println(sb1.delete(0,3)); //güzel Java
        System.out.println(sb1.deleteCharAt(5)); // güzelJava

    }
}
