package Zoom;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch {
    static Scanner scan=new Scanner(System.in);
    public static int tryCatchint() {
        int giris = 0;
boolean flag1=false;
        do {


            try {
                if (flag1==true){
                    scan.nextLine();
                flag1=false;
            }
                giris = scan.nextInt();
                if (giris < 0 || giris > 5) {

                    throw new IllegalArgumentException();
                }
            } catch (InputMismatchException e) {
                flag1=true;
                System.out.println("lütfen pozitif bir syı giriniz");
            } catch (IllegalArgumentException e) {
                flag1=true;
                System.out.println("lütfen bir rakam giriniz");
            } catch (Exception e) {
                flag1=true;
                System.out.println("lütfen geçerli bir sayı giriniz");

            }

        } while (flag1);

        return giris;
    }
}
