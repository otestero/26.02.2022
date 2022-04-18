package Practise_Elif.Practise_Elif_Day04;

public class Q10_Arrays {
    public static void main(String[] args) {
        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */

        String cumle="Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        cumle=cumle.replace(" ","");

        System.out.println(cumle);
        int sayac;
        //for (int i = 0; i < cumle.length()+1; i++) {
         //   System.out.println(i);}

        String harfsayisi[]=cumle.split("");
        System.out.println(harfsayisi.length);

        //
        }
    }

