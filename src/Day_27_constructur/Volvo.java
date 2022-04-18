package Day_27_constructur;

public class Volvo {

    String marka = "Volvo";
    String mensei = "Isvec";
    String model;
    boolean elektrikliMi;
    int yil;
    String yakit;
    boolean otomatilPilot = otomatikPilotSorgusu();

    int maxHiz=maxHizAtaMedotu();

    public Volvo(String mdl, boolean elk, int yl, String ykt) {
        model=mdl;
        elektrikliMi=elk;
        yil=yl;
        yakit=ykt;

    }
    public Volvo(){ //parametresiz constaktor

    }

    private int maxHizAtaMedotu() {
        int maxHiz = 0;
        if (elektrikliMi) {
            maxHiz = 160;
        } else {
            maxHiz = 240;
        }
        return maxHiz;
    }
       private boolean otomatikPilotSorgusu() {
           boolean sonuc = false;
           if (elektrikliMi) {
               sonuc = true;
           }
           return sonuc;
       }
       public String toString(){
        String arabaOzellikleri=" Model   : " + model +
                                " Yakıt   : " + yakit +
                                " Max Hiz : " + maxHiz;




                return arabaOzellikleri;
       }
    }


