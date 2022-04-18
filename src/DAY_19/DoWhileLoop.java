package DAY_19;

import com.sun.source.tree.WhileLoopTree;

public class DoWhileLoop {
    public static void main(String[] args) {



        int input=20;
        // for loop iled eyapabiliriz While loop ile yapacağız
        int bolen=1;
        int sayac=0;

        while (bolen<=input){
            if (input%bolen==0){
                System.out.print(bolen + " ");
                sayac++;
            }
            bolen++;
        }
        System.out.println("");
        System.out.println(input  + "sayini bolen   " + sayac + " adet sayı vardır");
}}
