package hw102420;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ScannerArray {
    public static void main(String[] args) {

        // from the user, take 5 food they like
        // give them a random food to eat

        ArrayList<String> foodMenu = new ArrayList<>();

        foodMenu.add("Burgers");
        foodMenu.add("ChickenBowl");
        foodMenu.add("Burrito");
        foodMenu.add("Steak");
        foodMenu.add("Vegan");

        ArrayList<String> names = new ArrayList<>();
        names.add("Rahat");
        names.add("Mike");
        names.add("Abir");
        names.add("Nafa");
        names.add("Touhid");


        Random random = new Random();
        int j = random.nextInt(foodMenu.size());
        //int k= random.nextInt(names.size());

        Iterator iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + ": " + foodMenu.get(j));
        }


// for (int n=0; n<foodMenu.size(); n++) {
        //  System.out.println() + ": " + foodMenu.get(j));

    }
}
