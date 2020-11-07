package mentoring110220.anagramPractice;

import java.util.Arrays;

public class Anagram4 {

    public static void main(String[] args) {

        String word1 = "Debit card25";
        String word2 = "bad credit52";

        // 1. convert them to characters

        // we need to convert the two words into the same case


//        char [] firstWord= word1.toLowerCase().toCharArray();
//        char [] secondWord = word2.toLowerCase().toCharArray();

        char[] firstWord = word1.toUpperCase().toCharArray();
        char[] secondWord = word2.toUpperCase().toCharArray();

        // 2. sort them

        Arrays.sort(firstWord);
        Arrays.sort(secondWord);

        // 3. to create to check if they equal

        boolean anagram = Arrays.equals(firstWord, secondWord);

        if (anagram) {
            System.out.println("they are anagrams ");
        } else {
            System.out.println("they are not");
        }


    }
}
