package day_42_Exception;

import java.util.Scanner;

public class C03_IllegalArgumentException {
    public static void main(String[] args) {
        // Kullaıcaıdan yaşını isteyin,
        // kullanıcı negatif sayı yada 0 veya 120 den büyük bir sayı girerse
        // illegalArgumentExeption oluşacak şekilde bir program yazı
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas= scan.nextInt();
        if (yas<=0 || yas>120){
throw new IllegalArgumentException();
        }else{

        }
    }
}
