package day_36;

public class Muhasebe extends Personel{

    protected int  saatucreti;
    protected String    statu;
    protected int     maas =8;

    protected int maasHesaplama(){
        int maas=saatucreti*8*30;
        return maas;
    }
}
