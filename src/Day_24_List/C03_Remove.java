package Day_24_List;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5); //[5]
        sayilar.add(3);

        sayilar.add(0,7);
        sayilar.add(2,7);
        sayilar.remove(3);

    }
}
