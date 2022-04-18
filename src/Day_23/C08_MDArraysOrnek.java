package Day_23;

public class C08_MDArraysOrnek {
    public static void main(String[] args) {
        // MDA arrayin
        // iç arraylerindeki son elemeanların çarpımını
        // ekrana yazdıran bir program ayzınız

        int arr[][]={{1,2,3},{4,5},{6}};
        int carpim=1;
        for (int i = 0; i < arr.length; i++) {
            carpim*=arr[i][arr[i].length-1];//arr nin 0 cı elementinin 2. elementininsonundaki sayı 3
            }
        System.out.println("son elementler çarpımı : " + carpim);
        }
    }

