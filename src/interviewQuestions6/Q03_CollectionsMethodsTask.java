package interviewQuestions6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q03_CollectionsMethodsTask {
    public static void main(String[] args) {
        // part 1: create list of 5 numbers from user input
// sort the list in reverse order and print it
// shuffle the list and print it
// rotate right by 3 places and print it

// bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
// listeyi ters sırada sırala ve yazdır
// listeyi karıştır ve yazdır
// 3 yer sağa döndür ve yazdır

// part 2: find the max number and min number, print them
// replace all max number with min number

// bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
// tüm maksimum sayıları minimum sayı ile değiştir

        ArrayList<Integer> arrlist=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("sayı giriniz");
            arrlist.add(scan.nextInt());
        }

        Collections.sort(arrlist, Collections.reverseOrder());
        System.out.println("ters sıraladıktan sonra arrlist"+ arrlist);

        Collections.shuffle(arrlist);
        System.out.println("rastgele karıştırılmış arrlist = " + arrlist);

        Collections.rotate(arrlist,3);
        System.out.println("rotate arrlist = " + arrlist);

        Integer max=Collections.max(arrlist);
       Integer min = Collections.min(arrlist);

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        Collections.replaceAll(arrlist,max,min);
        System.out.println("arrlist = " + arrlist);


    }
}
