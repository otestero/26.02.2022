package day_38;

public class Personel {
    // variable
  public   String statu= "Personel";
  public   String haklar= "Tüm personel eşit hakalara sahiptir";
  public   String izin= "8 gün";



    public void mesai() { // Metotlar
        System.out.println("Tüm personel 5 gün, günde 9 saat çalışır " );
    }
    public  void  maasHesapla(){

        System.out.println("Tüm personel 30 gün * 8 saat 10 euro = " + (30*8*10)+ "Euro maas alır");
    }
}
