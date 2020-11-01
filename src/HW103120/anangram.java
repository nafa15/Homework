package HW103120;

import java.util.Arrays;
import java.util.Scanner;

public class anangram {

    public static void main(String[] args) {

        String code = "CODE1234";

        Scanner scanner = new Scanner(System.in);
        System.out.println("The code we sent you:");
        String code2 = scanner.nextLine();
        System.out.println("The code we have: "+code);
        System.out.println("Decision:");

        boolean anangram = check(code, code2);
        if (anangram){
            System.out.println("Permitted.");
        } else {
            System.out.println("Sorry, you're not permitted.");
        }
        scanner.close();
    }

    public static boolean check(String code, String code2) {

        char[] first= code.toUpperCase().toCharArray();
        char[] second= code2.toUpperCase().toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }
}
