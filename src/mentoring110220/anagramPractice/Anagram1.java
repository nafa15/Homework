package mentoring110220.anagramPractice;

import java.util.Arrays;

public class Anagram1 {

    // Two words or sentences are anagrams when they have the same letters with the same number.
    //   In Java, two strings are anagrams when they have the same characters, but in different order.

    public static void main(String[] args) {

        System.out.println("Are the two words are anagrams");

        String word1 = "debit card";        // check if the two words are anagrams.
        String word2 = "bad credit";

        Anagram1 anagram1 = new Anagram1();  // 4 --> run the boolean inside the main method.
        anagram1.isAnagram(word1, word2);

    }

    public void isAnagram(String word1, String word2) {

        char[] firstWord = word1.toCharArray();              //1 --> if the strings have the same case
        char[] secondWord = word2.toCharArray();            // converting the two strings into characters.

        //    char [] firstWord = word1.toLowerCase().toCharArray();    // If the strings do not have the same case -->
        //     char [] secondWord = word2.toLowerCase().toCharArray();  // Change the case of characters of both strings and converting them to char array.

        Arrays.sort(firstWord);                   // 2 --> sorting both words.
        Arrays.sort(secondWord);

        boolean anagram = Arrays.equals(firstWord, secondWord);   // 3 --> create a boolean to check if the two strings are equal.

        if (anagram) {
            System.out.println("Yes, they are.");
        } else {
            System.out.println("No, they are not.");
        }


    }

}
