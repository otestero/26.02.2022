package C05_WrapperClass;

public class Co5_WrapperClass {
    public static void main(String[] args) {
        short sayi1= 20;
        Short sayi2= 30;

        sayi1= sayi2;

        System.out.println(sayi1);
        System.out.println((Short.MAX_VALUE));

        System.out.println(Short.MIN_VALUE);
    }


}

