package day_38;

public class Isci extends Personel{
    // variable
  public   String statu = "İşçi";
  public   String haklar = "İşçiler Kıdem tazminatı alırlar";
  public   String ikramiye= "6 ayda bir";
  public   String izin="haftada 2 gün";


    public void mesai() { // Metotlar
        System.out.println("Tüm işçiler haftalık 40 saat çalışır ");
    }

    public void maasHesapla() {

        System.out.println("Tüm işçiler 30 gün * 8 saat 10 euro = " + (30 * 8 * 10) + "Euro maas alır");

    }
}