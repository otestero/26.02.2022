package day_42_Exception;

public class C02_Castexception {
    public static void main(String[] args) {
        int sayi=10;
       // String str=sayi; CTE
        Object sayi2=20;
        String str2=(String) sayi2;//Explicit narrow
                                  //ClassCasException
    }
}
