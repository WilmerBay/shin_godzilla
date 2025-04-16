package week2;

import java.util.Scanner;

public class moreExercises {


     static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //gather score in the right format
        System.out.print("Please enter a game score in this format \"Home:Visitor|21:9\" ");
        String scoreFormat = scanner.nextLine();

        String winner = winnerFinder(scoreFormat);
        System.out.println("Winner: " + winner);
    }


     static String winnerFinder(String scoreFormat) {

        String[] parts = scoreFormat.split("\\|");
        // Also take away colons same way. 0 and 1 are the values for home : visitor and the score 21 : 9
        // So that's getting taken away from both
        String[] teamNames = parts[0].split(":");
        String[] teamScores = parts[1].split(":");

        // Convert the scores from Strings to integers this isnt casting this is parsing (it kinda looks like casting)
        int score1 = convertToInt(teamScores[0 ]);
        int score2 = convertToInt(teamScores[1]);

        // Compare the scores and return the winning team
        if (score1 > score2) {
            return teamNames[0];
        } else if (score1 < score2) {
            return teamNames[1];
        } else {
            return "Draw";
        }
    }

    // This isn't casting this is parsing a string to an Integer with .parseInt
     static int convertToInt(String numberString) {
        return Integer.parseInt(numberString);
    }
}