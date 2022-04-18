package OgrenciOgretmenBilgiSistemi;

import java.util.*;

public class Islemler {

    static List<ogrenciOgretmenBilgileri> SinifListesi = new ArrayList<ogrenciOgretmenBilgileri>();


    static ArrayList<ogrenciOgretmenBilgileri> OgretmenHavuzu = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String statu;

    public static void girisPaneli() {
        System.out.println(" ********** Öğrenci Öğretmen Yönetim Paneli**********");
        System.out.println(" yapmak istediğiniz statuyü seçiniz");
        System.out.println(" Öğrenci İşlemleri için  1,\n" +
                           " Öğretmen işlemleri için 2,\n" +
                           " Çıkış için              Q basınız");
        Scanner scan = new Scanner(System.in);
        String secim = scan.next().toUpperCase(Locale.ROOT);

        switch (secim) {
            case "1":
                statu = "Ogrenci";
                islemMenusu();
                break;
            case "2":
                statu = "Ogretmen";
                islemMenusu();
                break;
            case "3":
                statu = "Cıkıs";
                cıkıs();
                break;
            default:
                System.out.println("hatalı giriş yaptınız");
                girisPaneli();
                break;
        }
    }

    private static void cıkıs() {
        System.out.println("Tekrar Bekleriz");
    }

    public static void islemMenusu() {
        System.out.println("Yapmak istediğiniz işlemi seçiniz");
        System.out.println("**********İşlemler *************\r\n"
                + "1- Ekleme \r\n"
                + "2- Arama  \r\n"
                + "3- Listeleme \r\n"
                + "4- Silme  \r\n"
                + "0- Ana Menu");
        try {
            System.out.println("Tercihiniz yapınız");
            Integer secılenIslem = scan.nextInt();
            switch (secılenIslem) {
                case 1:
                    ekleme();
                    islemMenusu();
                    break;
                case 2:
                    arama();
                    islemMenusu();
                    break;
                case 3:
                    listele();
                    islemMenusu();
                    break;
                case 4:
                    silme();
                    islemMenusu();
                    break;
                case 0:
                    girisPaneli();
                    break;
                default:
                    System.out.println("yanlış giriş yaptınız, 0 ile 4 arasında bir sayı girmelisiniz ");
                    islemMenusu();
                    break;
            }
        } catch (InputMismatchException e) {
            String str = scan.next();
            System.out.println("Hatalı giriş yaptınız. 1,2,3,4,0 dan birini girmelisiniz");
            islemMenusu();
        }
    }
    private static void ekleme() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Ogrenci/Öğretme adını giriniz      ");
        String girilenAdi = scan.next();
        System.out.print("Öğrenci/Öğretmen soyadını giriniz  ");
        String girilenSoyad = scan.next();
       String girilenTC ;
        while (true) {
            try {
                System.out.print("Ogrenci/Öğretmen 4 haneli TC no giriniz: ");
                girilenTC = scan.next();
                girilenTC = girilenTC.replaceAll("\\D", "");
                int a=girilenTC.length();
                if (a!=4) {
                    throw new InputMismatchException();
                } else break;
            } catch (InputMismatchException e) {
                System.out.println("TC no 4 haneli olmalı ");
            } catch (Exception e) {
                String str = scan.next();
                System.out.println("Hatalı giriş yaptınız.");
            }
        }
        int girilenYas = 0;
        while (true) {
            try {
                System.out.print("Ogrenci/Öğretmen yaşını giriniz: ");
                girilenYas = scan.nextInt();
                if (girilenYas < 0 || girilenYas > 120) {
                    throw new ArithmeticException();
                } else break;
            } catch (ArithmeticException e) {
                System.out.println("Yaş 0 ile 120 arasında olmalıdır");
            } catch (Exception e) {
                String str = scan.next();
                System.out.println("Hatalı giriş yaptınız.");
            }
        }
        if (statu.equals("Ogrenci")) {

         String girilenOgrenciNo;
         while (true) {
             try {
                System.out.print("Ogrenci numarasını giriniz     ");
                girilenOgrenciNo = scan.next();
                System.out.println("");
                girilenOgrenciNo = girilenOgrenciNo.replaceAll("\\D", "");
                 int b=girilenOgrenciNo.length();
                 if (b!=4) {
                   throw new InputMismatchException();
               } else break;
             } catch (InputMismatchException e) {
                 System.out.println("Öğrenci no 4 haneli olmalı ");
            }  catch (Exception e) {
                System.out.println("Hatalı giriş yaptınız. Lütfen 4 haneli bir sayı girmelisiniz");
            }
}
           System.out.print("Öğrenci Sınıf/Şubesini giriniz ");
                    String girilenOgrenciSinifi = scan.next();
                    scan.nextLine();

            ogrenciBilgileri basariliOgrenci = new ogrenciBilgileri(girilenAdi, girilenSoyad, girilenTC,
                    girilenYas, girilenOgrenciNo, girilenOgrenciSinifi);

            SinifListesi.add(basariliOgrenci);
            System.out.println("Eklenen Ögrenci: " + basariliOgrenci);

        } else {
            System.out.print("Öğretmen branşını giriniz       ");
            String girilenOgretmenBransi = scan.next();
            System.out.print("Öğretmenin sicilini giriniz     ");
            String girilenOgretmenSicili = scan.next();
            scan.nextLine();

            ogretmenBilgileri CanavarOgretmen = new ogretmenBilgileri(girilenAdi, girilenSoyad, girilenTC,
                    girilenYas, girilenOgretmenBransi, girilenOgretmenSicili);
            System.out.println(CanavarOgretmen); //
            OgretmenHavuzu.add(CanavarOgretmen);
            System.out.println("Canavar Öğretmen: " + OgretmenHavuzu);
        }
    }
    private static void arama() {
        System.out.println(" Aradıgınız TCno yu giriniz: ");
        String arananTcno = scan.next();
        int girilenogrencilistesi = SinifListesi.size();
        for (int i = 0; i < girilenogrencilistesi; i++) {
            if (arananTcno.equals(SinifListesi.get(i).getTCno())) {
                System.out.println("buldum sinifListesi = " + SinifListesi.get(i));
            }
            if (!arananTcno.equals(SinifListesi.get(i).getTCno())) {
                System.out.println("*** Öğrenci Bulunamadı ***");
            }
        }
        int girilenogretmenlistesi = OgretmenHavuzu.size();
        for (int i = 0; i < girilenogretmenlistesi; i++) {
            if (arananTcno.equals(OgretmenHavuzu.get(i).getTCno())) {
                System.out.println(" buldum Öğretmeni = " + OgretmenHavuzu.get(i));
            }
            if (!arananTcno.equals(OgretmenHavuzu.get(i).getTCno())) {
                System.out.println("*** Öğretmen Bulunamadı ***");
            }
        }
    }
    private static void silme() {
        System.out.println("Silmek istediğiniz TCno yu giriniz: ");
        String silinecekTcno = scan.next();
        int girilenogrencilistesi= SinifListesi.size();
        for (int i = 0; i < girilenogrencilistesi; i++) {
            if (silinecekTcno.equals(SinifListesi.get(i).getTCno())) {
                System.out.println(" Sileceğin bu mu? sinifListesi = " + SinifListesi.get(i));
                System.out.println(SinifListesi.remove(SinifListesi.get(i)));
            }
            if (!silinecekTcno.equals(SinifListesi.get(i).getTCno())) {
                System.out.println("*** Silinecek Öğrenci Bulunamadı ***");
            }
        }
        int girilenOgretmenListesi=OgretmenHavuzu.size();
        for (int i = 0; i < girilenOgretmenListesi; i++) {
            if (silinecekTcno.equals(OgretmenHavuzu.get(i).getTCno())) {
                System.out.println(" buldum Öğretmen Havuzu = " + OgretmenHavuzu.get(i));
                System.out.println(OgretmenHavuzu.remove(OgretmenHavuzu.get(i)));
            }if (!silinecekTcno.equals(OgretmenHavuzu.get(i).getTCno())) {
                System.out.println("*** Silinecek Öğretmen Bulunamadı ***");
            }
        }
    }
    private static void listele() {
       int girilenogrencilistesi= SinifListesi.size();
        for (int i = 0; i < girilenogrencilistesi; i++) {
            System.out.println("sinifListesi = " + SinifListesi.get(i));
        }
        int girilenOgretmenListesi=OgretmenHavuzu.size();
        for (int i = 0; i < girilenOgretmenListesi; i++) {
            System.out.println("OgretmenHavuzu = " + OgretmenHavuzu.get(i));
        }
    }
}




