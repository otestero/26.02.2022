package Practise_Elif._Day05.ObjeOlusturma_ogretmen;

public class BookClass {

    String adi, yazari;
    int yayinyili;

    public BookClass(String adi, String yazari, int yayinyili) {
        this.adi = adi;
        this.yazari = yazari;
        this.yayinyili = yayinyili;
    }

    public BookClass(String adi, String yazari) { // sağ clik-generate-
        this.adi = adi;
        this.yazari = yazari;
    }
    public void display(){
        System.out.println(adi + yazari + "Yazar :" + yazari + "yayinyili:" + yayinyili);
    }

    public static void main(String[] args) {
        BookClass kitap1= new BookClass("Harry Potter and the Goblet of Fire", "Can Dündar" , 2000);
        kitap1.display();
    }
}
