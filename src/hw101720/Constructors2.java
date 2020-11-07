package hw101720;

public class Constructors2 {

    public static void main(String[] args) {
        printNumberOfCylinders();
        printCarDetails("Honda");
        printCarDetails("Honda", "Civic S", "2020");
        printNumberofCylinders(2);

    }

    public static void printNumberOfCylinders() {
        System.out.println(12);
    }

    public static void printCarDetails(String nameOfBrand) {
        System.out.println(nameOfBrand);
    }

    public static void printCarDetails(String nameOfBrand, String Model, String year) {
        System.out.println(nameOfBrand + " " + Model + " " + year);
    }

    public static void printNumberofCylinders(int extraCylinder) {
        int numberOfCylinders = 4;
        int totalCylinders = numberOfCylinders + extraCylinder;
        System.out.println(totalCylinders);
    }
}
