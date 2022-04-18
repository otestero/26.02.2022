package Day_27_constructur;

public class Cons02 {
    public static void main(String[] args) {
        Cons01 obj1= new Cons01(); //default cont devrede
        /* Cons01  claasinda hiç const oluşturmazsak JAVA DEFAULT
        Ancak bir parameterli ceya parametresiz bir constrouctor yazdığımızda JAVA dEFAULT constractorı siler.

        Dolaysıyla bir herhangi bir contruc oluşturduğumuzda daha önce başka clasları
        veya kullanıcıların oluşturmuş olabileceği objeleri kullanabilmeleri için default contractor in
        işlevini gerçekleştirecek parametresiz bir constroctor oluşturmakta fayda var.

         */
        Cons01 obj2= new Cons01("JAVA");
    }
}
