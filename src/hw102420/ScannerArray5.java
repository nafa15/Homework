package HW102420;

import java.util.ArrayList;

import java.util.Random;

public class ScannerArray5 {

    public static void main(String[] args) {

        ArrayList<String> foodMenu5 = new ArrayList<>();

        foodMenu5.add("Burgers");
        foodMenu5.add("ChickenBowl");
        foodMenu5.add("Burrito");
        foodMenu5.add("Steak");
        foodMenu5.add("Vegan");

        ArrayList<String> names5 = new ArrayList<>();
        names5.add("Rahat");
        names5.add("Mike");
        names5.add("Abir");
        names5.add("Nafa");
        names5.add("Touhid");

        Random random = new Random();
        int s = random.nextInt(foodMenu5.size());
        int t = random.nextInt(names5.size());

        //for (int i = 0; i < names5.size(); i++) {
            System.out.println(names5.get(t) + ": " + foodMenu5.get(s));

    }
}