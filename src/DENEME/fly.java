package DENEME;


import java.util.Scanner;

public class fly {
    public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);
            System.out.println("ilk kelimeyi giriniz");
            String str = scan.nextLine();
            System.out.println("2. kelimeyi giriniz");
            String str2 = scan.nextLine();
            String arr1[] = str.split("");
            String arr2[] = str2.split("");
            //isAnagram=
            int count = 0;
            if (arr1.length == arr2.length) {
                for (int i = 0; i < arr1.length; i++) {
                    for (int j = 0; j < arr2.length; j++) {
                        if (arr2[j].contains(arr1[i])) {
                            count++;
                            break;
                        }
                    }
                }
                if (count == arr1.length) {
                    System.out.println("anagramdir" + count);
                } else {
                    System.out.println("anagram degidlr");
                }
            } else {
                System.out.println("anagram degidlri");
            }

        }
    }
