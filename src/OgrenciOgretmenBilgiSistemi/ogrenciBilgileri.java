package OgrenciOgretmenBilgiSistemi;

public class ogrenciBilgileri extends ogrenciOgretmenBilgileri {
    //variable lar
    private String ogrenciNo;
    private String SinifSube;

    // Default parametresi Constroctor
    public ogrenciBilgileri(){
    }
    // Constroctor Parametreli
    public ogrenciBilgileri(String ogrenciNo, String SinifSube) {
        this.ogrenciNo = ogrenciNo;
        this.SinifSube = SinifSube;
    }

    public ogrenciBilgileri(String isim, String soyisim, String TCno, Integer yas, String ogrenciNo, String SinifSube) {
        super(isim, soyisim, TCno, yas);
        this.ogrenciNo      = ogrenciNo;
        this.SinifSube      = SinifSube;
    }
    // Getter-Setter
    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getSinifSube() {
        return SinifSube;
    }

    public void setSinifSube(String sinifSube) {
        this.SinifSube = SinifSube;
    }
    // to String


    @Override
    public String toString() {
        return "ogrenciBilgileri{" +
                "ogrenciNo='" + ogrenciNo + '\'' +
                ", SinifSube='" + SinifSube + '\'' +
                "} " + super.toString();
    }
}


