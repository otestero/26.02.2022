package Day_12;

public class EndsWith {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin


        String email = "mülkiyeayboy@gmail.com";
        String arananMetin = "@gmail.com";

        if (!email.contains(arananMetin)) {
            System.out.println("Lutfen gmail adresi yaziniz");
        } else if (email.endsWith(arananMetin)) {
            System.out.println("email adresiniz kaydedildi");
        } else {
            System.out.println("lutfen yazimi kontol edin");
        }
    }
}
