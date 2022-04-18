package day_42_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01 {
    public static void main(String[] args) {
        String dosyayolu = "src/day_41_Expections/dosya";

        try {
            FileInputStream fis = new FileInputStream(dosyayolu);
            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.println((char)k);}
            } catch(FileNotFoundException e){
                e.printStackTrace();
            } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }


