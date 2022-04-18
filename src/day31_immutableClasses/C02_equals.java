package day31_immutableClasses;

public class C02_equals {
    public static void main(String[] args) {
        String a = "";
        a += 2;
        a += 'c';
        a += false;

        if (a == "2cfalse") {
            System.out.println("==");
        }
        if (a.equals("2cfalse")) {
            System.out.println("equalas");

       String b="2cfalse";
            if (b.equals("2cfalse")) {
                System.out.println("==");
        }
    }
}}