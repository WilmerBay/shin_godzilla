package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); //list of integers

        List<Integer> result = numbers.stream()  // turn to stream
                .filter(n -> n % 2 != 0) // filtering even numbers
                .map(n -> n * n)         // Squaring the remaining numbers
                .toList();                      // collected new list:  .collect(Collectors.toList()); was simplified to .tolist();

        System.out.println("Squared odd numbers: " + result); // printing out the new list entirely
    }
}
