package Day_12;

import java.util.Scanner;

public class indexOf {
    public static void main(String[] args) {

        //Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //        - Girilen kelime cumlede kullanilmamis.
        //        - Girilen kelime cumlede 1 kere kullanilmis.
        //        - Girilen kelime cumlede 1’den fazla kullanilmis.

        //Scanner scan=new Scanner(System.in);

        String cumle = "Java ogren,yenı program ile yeni bir sayfa aç";
        String kelime= "t";
        int ilkkullanım=cumle.indexOf(kelime); //-1 veya index, kelimenin ilk
                                                // kacıncı ındexte kullanıldığını gosterır
        int ikincikullanım= cumle.indexOf(kelime, ilkkullanım+1);

        if (ilkkullanım==(-1)) {
            System.out.println("girilen kelim cümlede kullanılmamıştır");

        } else if(ikincikullanım==(-1)){
            System.out.println("girilen kelime cümlede bir kere kullanılmıştır");
        } else {
            System.out.println("girilen kelime cümlede 1 den fazla kullanılmıştır");
        }


    }
}
