package Day_18_nestedForLoop;

public class NestedForLoop {
    public static void main(String[] args) {

        //kullanıcıdan bir rakam alıp çarpım tablosu oluşturalım

        int input=8;
        //1 2 3   1*1 1*2 1*3
        //2 4 6   2*1 2*2 2*3

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=input ; j++) {
                System.out.print((i*j) + " ");
            }
            System.out.println("");//satırı aşağıya indirir
        }

    }
}
