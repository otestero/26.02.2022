package Day_12;

public class Replace {
    public static void main(String[] args) {

        String str=    "Bugün ne çok şey öğrendik";
        // bu cümlede boşluk dışındaki karakter sayısını bulunuz
        System.out.println("space hariç karakter sayısı ;" + str.replace(" ", "").length());//




        //atama yapılmadığı sürece orjinal string kalıcı olarak değişmez
        // sadece o satır için değişiklik yapılıp sonuç yazdırılmış olur

        System.out.println("orjinal str karakter sayısı : "+str.length());
    }
}
