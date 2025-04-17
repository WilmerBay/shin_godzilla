package week2;

import java.util.Scanner;

public class sentenceAnalysis {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String sentence = getSentence(scanner);
        if (sentence.trim().isEmpty()) {
            System.out.println("You didn't enter a sentence. I hate you and I hope your phone battery is low.");
            return;
        }

        int lengthOfSentence = sentence.length();
        System.out.println("You have: " + lengthOfSentence + " characters in your sentence including the spaces.");

        int wordCount = sentenceSplitter(sentence);
        System.out.println("You have " + wordCount + " words in your sentence.");

        char firstCharacter = sentence.charAt(0);
        char lastCharacter = sentence.charAt(sentence.length() - 1);
        System.out.println("First character is " + "\"" + firstCharacter + "\"" + " Last character is " + "\"" + lastCharacter + "\"");
    }

    static String getSentence(Scanner scanner) {

        System.out.println("Write any sentence: ");
        return scanner.nextLine().toLowerCase();
    }

    static int sentenceSplitter(String sentence) {
        String[] takeSpaceAway = sentence.split(" ");
        int wordCount = takeSpaceAway.length;
        return wordCount;
    }

}
