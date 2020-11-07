package hw101720;

public class Constructors1 {

    String model;

    public Constructors1(String modelOfConstructor) {
        this.model = modelOfConstructor;
    }

    public static void main(String[] args) {
        Constructors1 constructors1 = new Constructors1("Ferrari");
        constructors1.printCar();

    }

    public void printCar() {
        System.out.println(model);
    }


}
