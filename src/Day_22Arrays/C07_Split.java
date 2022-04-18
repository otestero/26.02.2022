package Day_22Arrays;

import java.util.Arrays;

public class C07_Split {
    public static void main(String[] args) {
        String str="Java gün gectikce güzelleşiyor";
        str.split(" ");      // spaceten böl demek. "Java", "gün", ...
        String kelimeler[]=str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); //[Java, gün, geçtikçe, güzelleşiyor]
        System.out.println(kelimeler[1]);  // gün

        String gectikce[]=str.split("gectikce");
        System.out.println(Arrays.toString(gectikce)); //[Java gün ,  güzelleşiyor]

        String harfler[]=str.split("");
        System.out.println(Arrays.toString(harfler)); // [J, a, v, a,  , g, ü, n,  , g, e, c, t, i, k, c, e,  , g, ü, z, e, l, l, e, ş, i, y, o, r]
    }
}
