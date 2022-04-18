package Day_17;

public class ForLoopV1 {
    public static void main(String[] args) {

        for (int i= 10; i <=29 ; i++) {
            System.out.print(i + ",  ");
        }
        System.out.println(30);

        int baslangıc=10;
        int bitis = 30;

        for (int i= baslangıc ; i <=bitis ;i++) {
            if (i<bitis) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i);
            }
        }

    }

}
