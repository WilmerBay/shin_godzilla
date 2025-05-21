package Streams;

import java.util.Arrays;
import java.util.List;

public class LoopToForEachExample {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("beep", "boo", "bop", "bu", "buu", "bap", "beeep", "hippopotamus", "letter", "suavemente");

        System.out.println("For loop replacement printout");
        strings.forEach(s -> System.out.println(s));
    }
}
