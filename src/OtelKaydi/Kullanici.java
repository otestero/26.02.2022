package OtelKaydi;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Kullanici {   //  Class

    // variabllar
    String name;
    LocalDateTime kayitzamani;
    public Kullanici() { //Parametresiz Controctırımız
            }

    // obje oluşturmak için Contructor ihtiyacımız var
    public Kullanici(String name, LocalDateTime kayitzamani) { //Parametreli controctor yaptık.
        this.name=name;
        this.kayitzamani=kayitzamani;


    }




}
