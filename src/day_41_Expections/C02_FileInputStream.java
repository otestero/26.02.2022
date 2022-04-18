package day_41_Expections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args)  {//throws FileNotFoundException
        String dosyayolu="src/day_41_Expections/dosya";

        try {
            FileInputStream fis=new FileInputStream(dosyayolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
