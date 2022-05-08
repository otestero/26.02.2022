package DepoProjesi;



import java.security.KeyStore;
import java.util.*;

public class Menu implements Yapilacaklar {

    static Scanner scan = new Scanner(System.in);
    static  HashMap<Integer, UrunlerClassi> urunlerBilgiListesi =new HashMap<>(); //Heryerden ulaşılması için Static yaptık
    static int ID=1000;
    public void PanelGirisi() {
            System.out.println(" ================================================");
            System.out.println("                Testeroğlu Unları                ");
            System.out.println(" ================================================");
            System.out.println(" ************** Depo Girişi Menusu **************");
            System.out.println(" **************Yapmak istediğiniz işlemi seçiniz? *************");
            System.out.println(" 1- Urun Tanimlama \n 2- Urun Listeleme \n 3- Urun Girisi \n " +
                    "4- Urun  Rafa Koy \n 5- Urun Cıkısı \n 6- Cıksı \n");
ID++;
            int secim ;
        while (true)
        try {    //Integer yerine harf girilmesini durumundaki exceptino onlmek için
                secim = scan.nextInt();

                    switch (secim) {
                        case 1:
                            urunTanimlama();
                            PanelGirisi();
                            break;
                        case 2:
                            urunListele();
                            PanelGirisi();
                            break;
                        case 3:
                            urunGirisi();
                            PanelGirisi();
                            break;
                        case 4:
                            urunuRafaKoy();
                            PanelGirisi();
                            break;
                        case 5:
                            urunCikisi();
                            PanelGirisi();
                            break;
                        case 6:
                            System.out.println("bye bye");
                            break;
                        default: {
                            System.out.println("*** 1 ile 6 arasında bir sayı girmelisiniz ***");
                            PanelGirisi();
                            break;
                        }
                    }break;
            }catch(InputMismatchException e){
            scan.nextLine();
            System.out.println("*** Sayı girmelisiniz ***");
            }
        }

    @Override
    public void urunTanimlama() {

        System.out.println(                "****** Ürün Tanımlama ******");
        System.out.println("Lütfen girilecek ürünün ismini yazınız");
        String girilenurunismi=scan.next();
        System.out.println("Lütfen ürünün üreticisini yazınız");
        String girilenureticisi= scan.next();
        System.out.println("Lütfen ürünün birimini (cuval, kg, adet vb) yazınız");
        String girilenbirimi= scan.next();
        UrunlerClassi girilenVeriler=new UrunlerClassi(girilenurunismi,girilenureticisi,0,girilenbirimi,"Raf yeri yok");
        urunlerBilgiListesi.put(ID,girilenVeriler);
        System.out.println(" Yeni kaydedilen ürün bilgileri  " + ID + " " + urunlerBilgiListesi.get(ID));
    }

    @Override
    public void urunListele() {
        System.out.println("                    ****** Ürün Listesi ******");
        System.out.printf(" %-10s %-10s %-13s %-10s %-10s %-10s\n",
                "ID", " Ürün ismi ", " Üreticisi", " Miktarı", "Birimi", "Raf Yeri");

        for (Map.Entry<Integer, UrunlerClassi> each : urunlerBilgiListesi.entrySet()
        ) {
            System.out.printf(" %-11d %-11s %-13s %-9s %-10s %-15s\n",
                    each.getKey(), each.getValue().urunIsmi,each.getValue().ureticisi,
                    each.getValue().birimi,each.getValue().miktari,each.getValue().raf );

        }
    }

    @Override
    public void urunGirisi() {
        System.out.println(                "****** Ürün Girişi ******");
        System.out.println("İstediğiniz ürünün ID numarasını giriniz");
        ID = scan.nextInt();
        if (urunlerBilgiListesi.containsKey(ID)) {
            System.out.println("Aradığınız Ürün:" + urunlerBilgiListesi.get(ID));
            while (true) {
                try {
                    System.out.println("Ekleyeceğiniz miktarı yazınız");
                    Integer eklenecekmiktar = scan.nextInt();
                    if (eklenecekmiktar > 0) {
                        urunlerBilgiListesi.get(ID).miktari += eklenecekmiktar;
                        System.out.println("Depodaki toplam miktar: "+ urunlerBilgiListesi.get(ID).miktari +" "
                                + urunlerBilgiListesi.get(ID).birimi+ " oldu.");
                    } else System.out.println("Bu menüden sadece ürün ekleyebilirsiniz");
                    System.out.println("Ürünün güncel hali: " + urunlerBilgiListesi.get(ID));
                    break;
                } catch (InputMismatchException e) {
                    scan.nextLine();
                    System.out.println("*** Sayı girmelisiniz ***");
                }
            }
        } else {
            System.out.println("ID ait bir ürün bulunamadı");
        }
    }
    @Override
    public void urunuRafaKoy() {
        System.out.println(                "****** Raf yeri Girişi ******");
        System.out.println("Rafa Koyacagınız ürünün ID numarasını giriniz");
        ID = scan.nextInt();
        if (urunlerBilgiListesi.containsKey(ID)) {
            System.out.println("Aradığınız Ürün:" + urunlerBilgiListesi.get(ID));
                    System.out.println("Lütfen raf yerini giriniz");
                    String girilenrafyeri=scan.next();
                    urunlerBilgiListesi.get(ID).raf=girilenrafyeri;
                    System.out.println("Ürünün güncel hali: " + urunlerBilgiListesi.get(ID));

        } else {
            System.out.println("ID ait bir ürün bulunamadı");
        }
    }

    @Override
    public void urunCikisi() {
        System.out.println(                 "****** Ürün Çıkışı ******");
        System.out.println("Çıkış yapılacak ürünün ID numarasını giriniz");
        ID = scan.nextInt();
        if (urunlerBilgiListesi.containsKey(ID)) {
            System.out.println("Aradığınız Ürün:" + urunlerBilgiListesi.get(ID));
            while (true) {
                try {
                    System.out.println("Çıkış miktarını yazınız");
                    Integer cıkanmiktar = scan.nextInt();
                    if (cıkanmiktar > 0 & urunlerBilgiListesi.get(ID).miktari>=cıkanmiktar) {
                        urunlerBilgiListesi.get(ID).miktari -= cıkanmiktar;
                        System.out.println("Depoda kalan Miktar: " + urunlerBilgiListesi.get(ID).miktari +" "+ urunlerBilgiListesi.get(ID).birimi);
                    } else if (cıkanmiktar<0){
                        System.out.println(" Hatalı giriş yaptınız");
                    } else if (urunlerBilgiListesi.get(ID).miktari<=cıkanmiktar){
                        System.out.println("Depo mevcudumuz yeterli değildir. ");
                        System.out.println("En fazla  " + urunlerBilgiListesi.get(ID).miktari + " "
                                           + urunlerBilgiListesi.get(ID).birimi+ " çıkartabilirsiniz");
                    }
                  break;
                } catch (InputMismatchException e) {
                    scan.nextLine();
                    System.out.println("*** Sayı girmelisiniz ***");
                }
            }
        } else {
            System.out.println("ID ait bir ürün bulunamadı");
        }

    }
}
