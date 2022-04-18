package C05_WrapperClass;

public class C06_WrapperClass {
    public static void main(String[] args) {
        String str1= "123";
        String str2 = "236";

        System.out.println(str1+str2);
        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));
    }
}
