package Day_27_constructur;

public class VolvoRunner2 {
    public static void main(String[] args) {
        // Her obje oluşturduğumuzda model, yakıt gibi değerleri
        // tek tek atama yapmak istemiyorsanız

        Volvo arb1=new Volvo("XC60", false, 2023, "Benzin");
        System.out.println(arb1.toString());//Model   : XC60 Yakıt   : Benzin Max Hiz : 240
        System.out.println(arb1);
    }
}
