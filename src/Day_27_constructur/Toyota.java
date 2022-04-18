package Day_27_constructur;

public class Toyota {
    String marka = "Toyota";
    int TelerAdedi = 4;
    boolean motoruVarMi = true;
    String model;
    String yakit;
    int yil;

    public void maxHiz() {
        if (yakit.equals("Benzin")) {
            System.out.println("Benzinli Aralar maz 240 km hız yapar");
        } else if (yakit.equals("Dizel")) {
            System.out.println("max Hız 260 km hız yapar");
        }
    }
    public void renkTercihleri(){
        if (model.equals("Corolla")){
            System.out.println("Corolla kırmızı");
        }
    }
}
