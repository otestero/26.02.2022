package Zoom;

import java.util.Scanner;

public class Depoislemler implements MainIntrface{
  static int ID=1001;
    static Scanner scan =new Scanner(System.in);
    public void girişmenusu(){
        bonner();
        girişmenusuSecimi();

    }

    private void girişmenusuSecimi() {
        System.out.println("1- ürün tanımlama \n 2- urun listesi\n 3- Urun Girişi \n 4- urunu rafa koy \n 5- Çıkış");
int secim = Try_Catch.tryCatchint();
switch (secim){
    case 1:
        urunTanimla();
        girişmenusuSecimi();
    case 2:
        urunListesi();
        girişmenusuSecimi();
    case 3:
       urunGirisi();
        girişmenusuSecimi();
    case 4:
       urunuRafaKoy();
        girişmenusuSecimi();
    case 5:
        sıkıs();
        girişmenusuSecimi();
        break;
    default:
        throw new IllegalStateException("Unexpected value: " + secim);
}

    }

       private static void bonner() {
        System.out.println("Depo projesi");
        System.out.println("============");
    }

    @Override
    public void urunTanimla() {

    }

    @Override
    public void urunListesi() {

    }

    @Override
    public void urunGirisi() {

    }

    @Override
    public void urunuRafaKoy() {

    }

    @Override
    public void sıkıs() {

    }
}

