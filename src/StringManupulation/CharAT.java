package StringManupulation;

public class CharAT {
    public static void main(String[] args) {
        //stringte herhangi bir harfi almak iatediğimizde o harfin indexini kullanarak
        //str.charAT(İstenenIndex) yazılabılır

        String str1= "Java çok güzel";
        // j yazdıralım
        System.out.println(str1.charAt(0));

        // G yazdırısak

        System.out.println(str1.charAt(9));

        // va yazdıralım
        System.out.println(""+str1.charAt(2)+str1.charAt(3));

        //son harfi yazdıralım
        // stringte 14 harf var, son harfin indexi

        System.out.println(str1.charAt(14-1));
        // eğer uzunluğu index olarak fgirersek
        // java çalıştıktan sonra hata verir
        System.out.println(str1.charAt(14));

    }

}
