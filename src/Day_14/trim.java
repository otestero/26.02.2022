package Day_14;

public class trim {
    public static void main(String[] args) {
        String str="   Siz ne derseniz deyin JAVA bildiğini okur.    ";
        str.trim();
        System.out.println(str);
        System.out.println(str.length());//49

        str=str.trim();
        System.out.println(str);
        System.out.println(str.length());//42


    }
}
