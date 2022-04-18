package Concatennation;

public class StringDatalarıBirlestirme {
    public static void main(String[] args) {
        String a= "Hello";
        String b= "World";
        String d= "123456";
        int c=10;
        //int d=20;
        System.out.println(a+b);
        System.out.println(a+" "+b);
        System.out.println(b+""+b);
        System.out.println(a+" "+b+" "+a);
        System.out.println(b+" "+a+" "+ b+" "+b);
        System.out.println(c+" "+a+" "+b+" ");
        System.out.println(a+b+c+d);
        System.out.println(a+b+" "+c);
        System.out.println(c+Integer.valueOf(d));
    }
}
