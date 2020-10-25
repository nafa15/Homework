package HW102020.scanner;



import java.util.Scanner;

public class Scanner2 {

    public static void main(String[] args) {

    Scanner2.footToMeter();
    }

    public static void footToMeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Feet");
        double Feet = scanner.nextDouble();
        System.out.println("Meter");
        System.out.println(Feet / 3.128);

        System.out.println("Lbs");
        int Lbs = scanner.nextInt();
        System.out.println("Kg");
        System.out.println(Lbs / 2.205);

        scanner.close();
    }

}
