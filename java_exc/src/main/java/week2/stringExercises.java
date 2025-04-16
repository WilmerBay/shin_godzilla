package week2;

import java.util.Scanner;

public class stringExercises {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String userName = getName();
        System.out.println("Your name is " + userName.length() + " characters long");

        char firstLetter = userName.charAt(0);
        char lastLetter = userName.charAt(userName.length() - 1);
        System.out.println("First Letter " + firstLetter);
        System.out.println("Last letter " + lastLetter);

        String typeAnything = typeAnything();
        System.out.println(typeAnything.toLowerCase());
        System.out.println(typeAnything.toUpperCase());

        containsJava();




    }

    static String getName() {
        System.out.println("Whats your name?");
        return scanner.nextLine();
    }
    static String typeAnything () {
        System.out.println("Type whatever you want. it prints in lower and upper case");
        return scanner.nextLine();
    }
    static String containsJava() {
        System.out.println("Make a sentence, if it contains the word \"java\" it will return a smiley face. If not, sad face");
        String javaSentence = scanner.nextLine().toLowerCase();
        if (javaSentence.contains("java")) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }
        return javaSentence;
    }



}
