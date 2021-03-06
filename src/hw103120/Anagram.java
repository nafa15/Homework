package hw103120;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("insert first word : ");
        String code1 = scanner.nextLine();
        System.out.println("insert second word : ");
        String code2 = scanner.nextLine();

        boolean anangram = check(code1, code2);
        if (anangram) {
            System.out.println(" words are anangram");
        } else {
            System.out.println("Sorry, words aren't anangram");
        }
        scanner.close();
    }

    public static boolean check(String code, String code2) {

        char[] first = code.toUpperCase().toCharArray();
        char[] second = code2.toUpperCase().toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }
}
