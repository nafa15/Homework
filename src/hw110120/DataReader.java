package hw110120;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

    // given you have a text file in your machine
    // rad that text file, and store every word of he file into a Arraylist
    // and store also in a Hashmap where the word is your key and how many time it occured if your value

    public static void main(String[] args) throws IOException {

        String tmpcontainer;
        String finalText = "";

        FileReader fileReader = new FileReader("src/hw110120/data.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((tmpcontainer = bufferedReader.readLine()) != null) {
            finalText = tmpcontainer;

            System.out.println(finalText);
        }
    }
}
