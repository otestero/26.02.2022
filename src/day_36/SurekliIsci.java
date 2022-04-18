package day_36;

public class SurekliIsci extends Isci{
    public static void main(String[] args) {
        SurekliIsci surIc1=new SurekliIsci();
        surIc1.persNo=5001;
        surIc1.isim="Cem";
        surIc1.soyisim="Akay";
        surIc1.statu="İşçi";
        surIc1.saatucreti=11;
        surIc1.maas=surIc1.maasHesaplama();
        System.out.println(surIc1);
        }

    @Override
    public String toString() {
        return "SurekliIsci{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatucreti=" + saatucreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}


