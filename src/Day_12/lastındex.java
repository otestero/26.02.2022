package Day_12;

public class lastındex {
    public static void main(String[] args) {


        String cumle = "Java ogren,yenı program ile yeni bir sayfa aç";
        String kelime= "t";
        int ilkkullanim=cumle.indexOf(kelime); //-1 veya index,
        int sonkullanim= cumle.lastIndexOf(kelime);

        if (ilkkullanim==(-1)){
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        } else if (ilkkullanim==sonkullanim){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
        }else {
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        }

        String str="Eclipse";
        System.out.println(str.lastIndexOf("p",   4));
    }
}
