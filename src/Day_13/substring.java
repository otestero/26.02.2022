package Day_13;

public class substring {
    public static void main(String[] args) {

        String str="Java ile IT çok güzel";
        System.out.println(str.substring(5));//ile IT çok güzel
        // yukarıdaki string i Mehmet  hoca ile IT çok güzel

        System.out.println(str.replace("Java", "Mehmet hoca"));
        System.out.println("Mehmet hoca " + str.substring(5) );
        System.out.println(str.substring(9));// yazılan index inclusive
        System.out.println(str.substring(0,5));// Java 0 dahil, 5 hariç
        System.out.println(str.substring(0,1)); // J
        String harf= str.substring(5,6); // i bana 6. karakter string olarak bulun
        System.out.println(harf); //i

        str= "Java gün geçtikçe güzelleşiyor";
        System.out.println(str.substring(7,7)); // hiçlik döndürür
        //System.out.println(str.substring(5,2));// bitiş indeksi başlangıç indeksinden küçük olamaz
        System.out.println(str.substring(str.length()-5));// şiyor
        System.out.println(str.substring(str.length()-1));//son harfi verir "r"
        System.out.println(str.substring(str.length())); // s
    }
}
