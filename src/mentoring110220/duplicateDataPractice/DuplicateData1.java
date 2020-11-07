package mentoring110220.duplicateDataPractice;

import java.util.HashMap;

public class DuplicateData1 {

    public static void main(String[] args) {

        // we need an algorithm to find the duplicated word

        String proverb = "Life is like riding a bicycle, to keep your balance, you must keep moving. Life is short.";

        String[] splittedData = proverb.split(" ");      // 1 --> split the string into substrings based on a delimiter ( in this case it's a space)


        HashMap<String, Integer> appearance = new HashMap<>();    // 2 --> we create a HashMap to present every substring with the times it duplicates

        for (int n = 0; n < splittedData.length; n++) {          // 3 --> loop to find how many times EACH word is duplicated
            Integer prevCount = appearance.get(splittedData[n]);
            if (prevCount == null) {
                prevCount = 0;
            }
            appearance.put(splittedData[n], prevCount + 1);
        }
        System.out.println(appearance);
        //  System.out.println(appearance.get("Life"));


    }


}
