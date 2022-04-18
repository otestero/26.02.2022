package OgrenciOgretmenBilgiSistemi;

public class ogretmenBilgileri extends ogrenciOgretmenBilgileri { // parent classa extends ettik

    // variable lar Öğretmene özel
    private String brans  ;
    private String sicilNo;

    // Default Constroctor parametresiz
    public ogretmenBilgileri(){
    }

    //  Constroctor Parametreli (generete-constroctur-variable sec-OK
    public ogretmenBilgileri(String brans, String sicilNo) {
        this.brans = brans;
        this.sicilNo = sicilNo;
    }

    public ogretmenBilgileri(String isim, String soyisim, String TCno, Integer yas, String brans, String sicilNo) {
        super(isim, soyisim, TCno, yas);
        this.brans = brans;
        this.sicilNo = sicilNo;
    }
    // Getter-Setter (generete-Getter-Setter-variable sec-OK)
    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }
    // to String (generete-Getter-Setter-variable sec-OK)


    @Override
    public String toString() {
        return "ogretmenBilgileri{" +
                "brans='" + brans + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                "} " + super.toString();
    }
}

