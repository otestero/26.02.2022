package StringManupulation;

public class Concate {
    public static void main(String[] args) {


        // concanitation yapmak iatersek iki ihtimal var
        //istersek daha önce yaptığımız gibi +
        String str1 = "Java";
        String str2 = " Candır";
        System.out.println(str1+ " "+str2);

        String cumle= str1.concat(str2);
        cumle= str1.concat(" ").concat(str2);
        System.out.println(cumle);

        // concat içine string yerinesayı veya boolen değer yazsak?
        //cumle=str1.concat(true);
        //cumle=str1.concat(true+"");
    }
}
