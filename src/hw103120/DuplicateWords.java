package hw103120;

import java.util.HashMap;

public class DuplicateWords {

    public static void main(String[] args) {

        String proverb = "la vie est comme une bicyclette, il faut avancer pour ne pas perdre l'equilibre, la vie .";

        String[] splittedData = proverb.split(" ");

        HashMap<String, Integer> appearance = new HashMap<>();

        for (int n = 0; n < splittedData.length; n++) {
            Integer prevCount = appearance.get(splittedData[n]);
            if (prevCount == null) {
                prevCount = 0;
            }
            appearance.put(splittedData[n], prevCount + 1);
        }
        System.out.println(appearance);
        System.out.println(appearance.get("vie"));
    }
}
