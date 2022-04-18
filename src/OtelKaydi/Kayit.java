package OtelKaydi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {

   List<Kullanici> kişiler= new ArrayList<>();// boş list açtık. Kayıtal metodu bu liste element atayacak


    public List<Kullanici> kayitAl(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Adınızı giriniz: ");
        String isim=scan.nextLine();                  // Kullanıcıdan ismini aldık. Kayitolan'a atadık
        Kullanici kayitolan=new Kullanici(isim, LocalDateTime.now()); // Kullanıcı Clasından Parametreli Contructor ile obje oluşturduk.
        kişiler.add(kayitolan);                                       //  // Kayitolan herkişiyide kişiler listesine ekledik

        

        return kişiler;
    }
    public void sanliKullanici(List<Kullanici>kişiler) {  // kll lişilerden geliyor
        for (Kullanici each: kişiler) {// kayıtAl() metodundanda oluşturulan her  bir kullanıcı döngüye sokuldu
            if (each.kayitzamani.getSecond()<10) { // her bir kullanıcının kayıt zamanındaki saniye if şartına sokuldu
                System.out.println("Şanslı kişisiniz: " + each.name + " 5 kilo bal kazandıznız : ");
            }else System.out.println("maalesef " + each.name + " Size Bal yok:");
            }
        }
        public void listele(List<Kullanici>kayitolan){
            for (Kullanici each:kayitolan ) { //kayıAl metodundan gelen kişiler listesini döngüye sokar
                System.out.println("adı " + each.name+ "kayıt zamanı"+ each.kayitzamani); //kişiler listteskiher bir kullanıcının ad ve zamanını yazdırır

            }
    }


}
