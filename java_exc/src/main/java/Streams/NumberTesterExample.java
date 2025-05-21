package Streams;

@FunctionalInterface
interface NumberTester {

    boolean test(int number);
}

public class NumberTesterExample {

    public static void main(String[] args) {

        NumberTester isEven = number -> number % 2 == 0; // checking for even number

        int[] numbers = {6,43,8,35,2,3,94,8}; // testing numbers

        for (int n : numbers) { // testing loop

            System.out.println(n + " even number? " + isEven.test(n));
        }

        System.out.println("\n______or if i wanted to replace true false with yes or no______\n");

        for (int n : numbers) { // testing loop

            if (isEven.test(n)) {
                System.out.println(n + " is an even number? yes");
            } else {
                System.out.println(n + " is an even number? no");
            }
        }
    }
}