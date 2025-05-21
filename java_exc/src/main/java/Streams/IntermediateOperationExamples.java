package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperationExamples {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("beep", "boo", "bop", "bu", "buu", "bap", "beeep", "hippopotamus");

        List<String> result = words.stream() // convert to stream
                .filter(word -> word.length() <= 6) // filter 6 or more characters
                .map(String::toUpperCase)                 // To uppercase
                .toList();            // Collect new list. converted to toList();

        System.out.println("Filtered and uppercased words: " + result);
    }
}
