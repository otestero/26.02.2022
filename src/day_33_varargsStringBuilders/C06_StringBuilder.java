package day_33_varargsStringBuilders;

public class C06_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Prize Dikkat");
        System.out.println(sb1.insert(12," edin")); // Prize Dikkat edin
        String str= "Hayat çok güzel şeyler var";
        System.out.println(sb1.insert(0,str,0,10)); //Hayat çok Prize Dikkat edin
        System.out.println(sb1.reverse()); //nide takkiD ezirP koç tayaH
        System.out.println(sb1.reverse()); //Hayat çok Prize Dikkat edin

        System.out.println(sb1.equals(sb1));// true

    }
}
