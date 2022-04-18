package DENEME;

import java.util.Scanner;

public class equalsIgnorCase {
    public static void main(String[] args) {
        //kullanıcıya derse katılıp katılmayacağını sorum
        // ever derse, cevabını ve "derse katılımınız onaylanmıştır" yazdırın
        // hayır derse cevabını ve "sonraki derslerimize bekleriz" yazdırın

        String str= "derse katılacakmısınız?";
        System.out.println(str);
        Scanner scan= new Scanner(System.in);
        System.out.println("evet yada hayır yazınız");
        String cevap= scan.next();

        if (cevap.equalsIgnoreCase("evet")) {
            System.out.println("Cevabımız: " + cevap + "   derse katılımınız onaylanmıştır");
        } else if (cevap.equalsIgnoreCase("hayır")) {
            System.out.println("Cevabınız: " + cevap +  "   sonraki derslerimize bekleriz");
    } else {
            System.out.println("evet yada hayır yazınız");
}}}
