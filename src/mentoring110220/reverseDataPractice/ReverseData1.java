package mentoring110220.reverseDataPractice;

public class ReverseData1 {

    public static void main(String[] args) {

        String sentence = " I reverse data";  // the string can't be modifiable

//        StringBuilder stringBuilder = new StringBuilder(sentence);   // 1 -->we need a stringbuilder to be able to modify; it's like creating an object for a string
//       // stringBuilder.append(sentence);         // 2 --> append the data (sentence) to the string builder we created
//
//        String sentenceReversed = stringBuilder.reverse().toString();  // 3 --> reverse the sentence
//
//        System.out.println(sentenceReversed);  // 4 --> print it.

        StringBuilder stringBuilder = new StringBuilder((sentence));

        String sentenceReversed = stringBuilder.reverse().toString();

        System.out.println(sentenceReversed);


    }


}
