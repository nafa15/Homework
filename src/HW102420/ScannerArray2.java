package HW102420;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ScannerArray2 {
    public static void main(String[] args) {

        ArrayList<String> menu= new ArrayList<>();

        menu.add("Burgers");
        menu.add("Chickenbowl");
        menu.add("Burrito");
        menu.add("Steak");
        menu.add("Veggie");

        ArrayList<String> names2= new ArrayList<>();
        names2.add("Rahat");
        names2.add("Mike");
        names2.add("Abir");
        names2.add("Nafa");
        names2.add("Touhid");

        Random random = new Random();
        int j= random.nextInt(menu.size());
        int k= random.nextInt(names2.size());

        Scanner scanner= new Scanner(System.in);
        String user1= scanner.nextLine();
        System.out.println(menu.get(j));
       String user2= scanner.nextLine();
        System.out.println(menu.get(j));
        /* String user3= scanner.nextLine();
        System.out.println(names2.get(k) +": "+ menu.get(j));
        String user4= scanner.nextLine();
        System.out.println(names2.get(k) +": "+ menu.get(j));
        String user5= scanner.nextLine();
        System.out.println(names2.get(k)+": "+ menu.get(j));*/




        scanner.close();




    }


}
