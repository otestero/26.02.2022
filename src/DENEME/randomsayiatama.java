package DENEME;

import java.util.ArrayList;

public class randomsayiatama {
    public static void main(String[] args) {

        ArrayList<Integer>arr1=new ArrayList<>();
        ArrayList<Integer>arr2=new ArrayList<>();

        arr1=arrListhazir(10,0,20);
        arr2=arrListhazir(5,0,20);
        System.out.println(" 10 elemanlı arr1    = " + arr1);
        System.out.println("  5 elemanlı arr2    = " + arr2);

     // arr1.retainAll(arr2);
      //  System.out.println("ortak elemanlar arr1 = " + arr1);


      //  arr1=arrListhazir(10,0,20);
      //  arr2=arrListhazir(5,0,20);
      //  System.out.println(" 10 elemanlı arr1    = " + arr1);
       // System.out.println("  5 elemanlı arr2    = " + arr2);

        arr1.retainAll(arr2);
        System.out.println("arr1 = " + arr1);
        arr2.removeAll(arr1);
        System.out.println("arr2 = " + arr2);

    }

    public static int getRandomInt(int min, int max) {

        return (int)(Math.random()*(max-min+1));
    }

    private static ArrayList<Integer> arrListhazir(int size, int min, int max) {
        ArrayList<Integer>bosList=new ArrayList<>();

        for (int i = 0; i < size; i++) {
            bosList.add(getRandomInt(min,max));

        }return bosList;
    }
}
