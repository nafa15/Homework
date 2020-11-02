package HW102420;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ScannerArray4 {

    public static void main(String[] args) {

        Random random = new Random();
        int a= random.nextInt(5);

        //System.out.println(a);



        ArrayList<String> foodMenu4= new ArrayList<>();

        foodMenu4.add("Burgers");
        foodMenu4.add("ChickenBowl");
        foodMenu4.add("Burrito");
        foodMenu4.add("Steak");
        foodMenu4.add("Vegan");

        ArrayList<String> names4= new ArrayList<>();
        names4.add("Rahat");
        names4.add("Mike");
        names4.add("Abir");
        names4.add("Nafa");
        names4.add( "Touhid");

           //  System.out.println(names4 + ": " + foodMenu4);


             Iterator iterator= names4.iterator();
             while (iterator.hasNext()){
                 System.out.println(iterator.next()+ ": " + foodMenu4.get(a));
             }








    }
}
