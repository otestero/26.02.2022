package day_34_accessModifiier;

public class C03 {
    // encapsule edeceğimiz iki variablemiz olsun

    private int sayi;
    private String str;

    public int getSayi() {
        return sayi;
    }

    @Override
    public String toString() {
        return "C03{" +
                "sayi=" + sayi +
                ", str='" + str + '\'' +
                '}';
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
