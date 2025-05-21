package Streams;

import java.util.Arrays;
import java.util.List;

public class TerminalOperations {

    public static void main(String[] args) {
        // Step 1: Create a list of integers
        List<Integer> numbers = Arrays.asList(3, 6, 8, 1, 9, 4, 7, 10);

        // Step 2: Use stream to count even numbers
        int evenCount = (int) numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();

        // Output the result
        System.out.println("Number of even numbers: " + evenCount);
    }
}
