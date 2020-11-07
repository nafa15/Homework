package mentoring110220.duplicateDataPractice;

import java.util.HashMap;

public class DuplicateData2 {

    public static void main(String[] args) {

        String proverb = "Life is like riding a bicycle, to keep your balance, you must keep moving. Life is short.";

        String[] splittedProverb = proverb.split(" ");  // we splitted the sentence

        HashMap<String, Integer> appearance = new HashMap<>();

        for (int x = 0; x < splittedProverb.length; x++) {
            Integer count = appearance.get(splittedProverb[x]);
            if (count == null) {
                count = 0;
            }

        }


    }
}
