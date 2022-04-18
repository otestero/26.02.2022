package Day_27_constructur;

public class Z {
    String isim;
    String soyisim;
    int numara;
    boolean gercekMi;

    public Z(String ism, String soyism, int no, boolean grc) {
        isim = ism;
        soyisim = soyism;
        numara = no;
        gercekMi=grc;
    }
    public Z(String isim, String soyisim, String no) {
        this.isim=isim;
        this.soyisim=soyisim;
        this.numara=numara;
    }
     public String toString(){
        return ("Isim : "+ isim+ ", Soysim :"+ soyisim + " No : " + numara);
     }



}





