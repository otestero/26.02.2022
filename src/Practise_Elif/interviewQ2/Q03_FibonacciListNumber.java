package Practise_Elif.interviewQ2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03_FibonacciListNumber {
    /*
 Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
 0-1-1-2-3-5-8-13-21-34....
 */
    public static void main(String[] args) {
        List<Integer>fibonacci=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        int sayi= scan.nextInt();
        fibonacci.add(0);
        fibonacci.add(1);



        int i=1;
        if (sayi<=1){
            System.out.println("daha büyük bir sayı giriniz");
        } else{
            while (fibonacci.get(i)<sayi){ //fibonaci elemanları, sayıdan küçük olduğu sürece,
                fibonacci.add(fibonacci.get(i)+fibonacci.get(i-1));//bir önceki eleman ile topla
                i++;
            }
        }
    }
}
