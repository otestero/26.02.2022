package OgrenciOgretmenBilgiSistemi;

public class ogrenciOgretmenBilgileri { //Parent class

    // Ortak Variable lar
    private String  isim;
    private String  soyisim;
    private String  TCno;
    private Integer yas;

    //Default constroctur
    public ogrenciOgretmenBilgileri(){

    }
    // Parametreli Constroctur
    public ogrenciOgretmenBilgileri(String isim, String soyisim, String TCno, Integer yas) {
        this.isim    = isim;
        this.soyisim = soyisim;
        this.TCno    = TCno;
        this.yas     = yas;
    }
    //  Getter-Setter
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getTCno() {
        return TCno;
    }

    public void setTCno(String TCno) {
        this.TCno = TCno;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }
    // to String


    @Override
    public String toString() {
        return " " +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", TCno='" + TCno + '\'' +
                ", yas=" + yas +
                ' ';
    }
}
