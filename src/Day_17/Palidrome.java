package Day_17;

public class Palidrome {
    public static void main(String[] args) {
         String input="salam";
         palindromeKontrolEt(input);

    }

    private static void palindromeKontrolEt(String input) {

        String tersteninput="";
        for (int i= input.length()-1; i>=00; i--) {
            tersteninput += input.charAt(i);
        }
            System.out.println("Girdiğiniz Kelimenin tersten Yazılımı; " +tersteninput);
    }
    }

