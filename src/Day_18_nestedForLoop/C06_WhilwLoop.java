package Day_18_nestedForLoop;

public class C06_WhilwLoop {
    public static void main(String[] args) {
        // kullanıcıdan iki tam sayı alıp bu sayıları ve
        // aralarındaki tüm sayıları yazdıran bir kod oluşturun

        int baslangıc=40;
        int bitis= 60;

        for (int i = baslangıc; i <=bitis ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        //While loopla yapılışı

        while (baslangıc<=bitis);
        System.out.print(baslangıc + " ");
        baslangıc ++;
        System.out.println("");
    }

}
