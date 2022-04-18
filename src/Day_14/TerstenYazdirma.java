package Day_14;

import java.util.Scanner;

public class TerstenYazdirma {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.

        //Scanner scan= new Scanner(System.in);

        String input= "Mavi";
        String tersStr= input.substring(3).toUpperCase() +
                input.substring(2,3).toLowerCase()+
                input.substring(1,2)+
                input.substring(0,1);
        System.out.println(tersStr);

        System.out.println(tersStr);
    }
}
