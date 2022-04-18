package Practise_Haluk;

public class minBul {
    public static void main(String[] args) {
        /* TASK :
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,-3},{41,55},{-61,-17,80}}
         * Output : 80
         */
        int input[][]={{1,2,-3},{41,55},{-61,-17,80}};
        System.out.println("input = " + minDegeriBul(input));
    }
    private static Integer minDegeriBul(int input[][]) {
        int min=input[0][0];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j]>min){
                    min=input[i][j];
                }
            }
        }return min;

    }
}
