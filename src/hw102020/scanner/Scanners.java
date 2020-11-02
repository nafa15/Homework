package HW102020.scanner;

import java.util.Scanner;

public class Scanners {

    public static void main(String [] args) {

            MassIndex();

    }

    public static void MassIndex(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("First name: ");
        String First_name= scanner.nextLine();
        System.out.println("Last name: ");
        String Last_name= scanner.nextLine();
        System.out.println("Height");
        double h = scanner.nextDouble();
        System.out.println("Weight");
        int w = scanner.nextInt();
        double MI = w/(h*h);
        System.out.println("Your body mass index, Mr "+ First_name + " " + Last_name + " is " + MI);
        System.out.println("Decision: ");
        if (MI < 18.5){
        System.out.println("You are underweight!");}
        else if (MI < 24.9){
            System.out.println("You're good!");}
        else if (MI < 29.9){
            System.out.println("You are overweight!");}
        else {
            System.out.println("You're obese, stop junk food!");}

        scanner.close();
    }



}
