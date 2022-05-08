package DENEME;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _15_ExceptionsQ01_VizeFinalOrtalamaBul {
    public static void main(String[] args) {

/* 'ortalama' isminde bir method create ediniz ve int v  - int f  isminde 2 adet parametresi olsun.
        int v = vize
        int f = final
        Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
        Sistem ArithmeticException hatası versin ve Notlar 0-100 arasında olmalı mesajını döndürsün.
        Diğer durumlarda ise,    vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.(ortalama =)
        vizeye 120, finale 80 girin.  Programın çalışmasını sağlayın. (handle edin)*/

        int vizenotu = 0;
        int finalnotu = 0;
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Vize notunu giriniz");
                vizenotu = scan.nextInt();
                if (vizenotu < 0 || vizenotu > 100) {
                    //System.out.println("Yanlış not girdiniz");
                    throw new ArithmeticException();
                }  break;
            } catch (ArithmeticException e) {
                System.out.println("Vize notu 0 ile 100 arasında olmalıdır");
            } catch (InputMismatchException e) {
                String str = scan.nextLine();
                System.out.println("sayı girmelisini");
            }
        }
        while (true) {
            try {
                scan = new Scanner(System.in);
                System.out.println("Final notunu giriniz");
                finalnotu = scan.nextInt();
                    if (finalnotu<0 || finalnotu>100) {
                       System.out.println("Yanlış not girdiniz");
                       throw new ArithmeticException();
                     } break;
                } catch (ArithmeticException e) {
                        System.out.println("Final notu 0 ile 100 arasında olmalıdır");
                        } catch (InputMismatchException e) {
                                String str= scan.nextLine();
                                System.out.println("Sayı girmelisiniz");
                                }
        }ortalamayıbul(vizenotu, finalnotu);
    }
    private static void ortalamayıbul(int vizenotu, int finalnotu) {
        Double ortalama = ((vizenotu * 0.4) + (finalnotu * 0.6));
        System.out.println("ortalama = " + ortalama);

    }
}

