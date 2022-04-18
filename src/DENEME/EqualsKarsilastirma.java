package DENEME;

public class EqualsKarsilastirma {
    public static void main(String[] args) {
        String isim1= "Ali Can";
        String isim2= isim1+"";

        System.out.println(isim1==isim2);
        System.out.println(isim1.equals(isim2));
    }
}
