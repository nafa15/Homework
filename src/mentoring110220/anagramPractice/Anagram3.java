package mentoring110220.anagramPractice;

import java.util.Arrays;

public class Anagram3 {

    public static void main(String[] args) {

        System.out.println("Are the two words are anagrams");

        String word1 = "d/ebit card 1995";        // check if the two words are anagrams.
        String word2 = "bad cr/edit 9591";


        isAnagram(word1, word2);


    }
    public static void isAnagram(String word1, String word2){


        char [] firstWord = word1.toLowerCase().toCharArray();
        char [] secondWord = word2.toLowerCase().toCharArray();


        Arrays.sort(firstWord);
        Arrays.sort(secondWord);


        boolean anagram = Arrays.equals(firstWord, secondWord);

        if (anagram){
            System.out.println("Yes, they are.");
        } else {
            System.out.println("No, they are not.");
        }
    }
}
