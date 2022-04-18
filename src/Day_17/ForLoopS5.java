package Day_17;

public class ForLoopS5 {
    public static void main(String[] args) {

        char ilkharf = 'm';
        char sonharf = 't';
        for (char i = ilkharf; i <= sonharf; i++) {
            System.out.print(i + " ");
        }
        double baslangıc = 10;
        double bitis = 20;
        double artis = 0.2;

        for (double i = baslangıc; i <= bitis; i += artis) {
            System.out.print(i + " ");

        }
    }
}