package mentoring110220.reverseDataPractice;

public class ReverseData2 {

    public static void main(String[] args) {

        String palindrome ="no le mon, no mel on";

        StringBuffer stringBuffer = new StringBuffer(palindrome);
        System.out.println(stringBuffer.reverse());


    }
}



    // StringBuffer is synchronized i.e. thread safe.
    // It means two threads can't call the methods of StringBuffer simultaneously.
    // StringBuilder is non-synchronized i.e. not thread safe.