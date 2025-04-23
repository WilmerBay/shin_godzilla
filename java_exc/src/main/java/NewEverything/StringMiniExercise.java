package NewEverything;

import java.util.Scanner;

public class StringMiniExercise {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String user = getName();
        System.out.println("Welcome! " + user);

        String sentence = sentence();
        System.out.println("Your sentence has " + sentence.length() + " characters.");



    }
    // ask user to input name and return hello [name]
    static String getName() {
        System.out.println("What is you name?");
        return scanner.nextLine();
    }
    // Ask for a string input. Print the number of characters in it using .length().
    static String sentence() {
        System.out.println("Write whatever you would like. We are going to count the characters");
        return scanner.nextLine();
    }
    static String getWord() {
        System.out.println("Now enter a single word");
        return scanner.nextLine();
    }
}
