package DepoProjesi;

public class UrunlerClassi {


   String  urunIsmi;
   String  ureticisi;
   Integer miktari;
   String  birimi;
   String  raf;

    public UrunlerClassi() {
    }

    public UrunlerClassi(String urunismi, String ureticisi, Integer miktari, String birimi, String raf) {

        this.urunIsmi  = urunismi;
        this.ureticisi = ureticisi;
        this.miktari   = miktari;
        this.birimi    = birimi;
        this.raf       = raf;

    }




    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUreticisi() {
        return ureticisi;
    }

    public void setUreticisi(String ureticisi) {
        this.ureticisi = ureticisi;
    }

    public Integer getMiktari() {
        return miktari;
    }

    public void setMiktari(Integer miktari) {
        this.miktari = miktari;
    }

    public String getBirimi() {
        return birimi;
    }

    public void setBirimi(String birimi) {
        this.birimi = birimi;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    @Override
    public String toString() {
        return
        "Urunler{" +
                " urunIsmi='" + urunIsmi + '\'' +
                ", ureticisi='" + ureticisi + '\'' +
                ", miktari=" + miktari +
                ", birimi='" + birimi + '\'' +
                ", raf='" + raf + '\'' +
                '}';
    }
}
