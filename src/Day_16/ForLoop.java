package Day_16;

public class ForLoop {
    public static void main(String[] args) {


    // verilen string'i tersten yazdiran bir kod yaziniz

    String str = "Java cok zevkli";
        String str1 = "Ali topu tut ";

        for (int i = str.length()-1 ; i >=0 ; i--) {
        System.out.print(str.substring(i,i+1));
       }
    }
}

