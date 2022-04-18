package Day_14;

public class IsimGizleme {
    public static void main(String[] args) {

        //Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //isim-soyisim : M***** B*******
        //kart no : **** **** **** 1234
        //Scanner scan=new Scaner(System.in

        String isim= "oğuzhan";
        String soyisim= "BALKAYA";
        String kKNo="1234567890123456";

        String yeniisim= isim.substring(0,1).toUpperCase()+
                         isim.substring(1).replaceAll("\\S","*");

        String yenisoyisim= soyisim.substring(0,1).toUpperCase() +
                soyisim.substring(1).replaceAll("\\S", "*");
        String yeniKKNO= "**** **** **** " + kKNo.substring(12);
        System.out.println("isim-soyisim   : " + yeniisim+ " " + yenisoyisim+"\nkart no  :"+ yeniKKNO);

    }
}
