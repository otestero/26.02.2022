package Day_11;

public class indexOf {
    public static void main(String[] args) {

        String str1= "Java bir başka güzeldir";
        System.out.println(str1.indexOf('J'));//0
        System.out.println(str1.indexOf("l"));//19

        System.out.println(str1.length()-1);
        System.out.println(str1.indexOf("aska"));//10
        System.out.println(str1.indexOf('b'));//5

        System.out.println(str1.indexOf('b', 5));

      int ilkbindex= str1.indexOf('b');//5
        System.out.println(str1.indexOf("b", ilkbindex+1));


    }
}
