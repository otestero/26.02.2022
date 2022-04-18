package day_38;

public class Ustabasi extends Isci{

    // variable
  public   String statu = "Ustabasi";
  public   String haklar = "HAftada bir gün ekstra tatile sahiptir";


    public void mesai() { // Metotlar
        System.out.println("Arıza varsa ustabaşı ekstra ucret almadan çalışır ");
    }

    public void maasHesapla() {

        System.out.println("Tüm Ustabaşi 30 gün * 8 saat 10 euro = " + (30 * 8 * 10) + "Euro maas alır");

    }

    public static void main(String[] args) {
        Ustabasi yasin=new Ustabasi();
        System.out.println(yasin.statu);//Ustabaşı
        System.out.println(yasin.haklar);// HAftada bir gün ekstra tatile sahiptir
        System.out.println(yasin.ikramiye); // 6 ayda bir
yasin.maasHesapla();
yasin.mesai();
        System.out.println("");


       Isci Ahmet=new Ustabasi();
        System.out.println(Ahmet.statu);//isci
        System.out.println(Ahmet.haklar); // işçiler
        System.out.println(Ahmet.ikramiye);//
        System.out.println(Ahmet.izin);
        Ahmet.maasHesapla();
Ahmet.mesai();

      //data türü    adem    contructor
        Personel adem=new Ustabasi();
        System.out.println(adem.statu);//personel
        System.out.println(adem.haklar); // işçiler
        // System.out.println(adem.ikramiye);// CTE verir
        System.out.println(adem.izin);
        adem.maasHesapla();
        adem.mesai();









    }
}