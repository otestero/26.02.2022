package Day_12;

public class Contains {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin

        String email = "mülkiyeayboy@gmail.com";
        String arananMetin = "@gmail.com";

        if (!email.contains(arananMetin)){
            System.out.println("Lutfen gmail adresi yaziniz");
        } else if (email.lastIndexOf(arananMetin) == (email.length() - 10)){

            System.out.println("Email adresiniz kaydedildi.");
        } else
        {
            System.out.println("Lutfen yazimi kontrol ediniz");
        }


    }}



