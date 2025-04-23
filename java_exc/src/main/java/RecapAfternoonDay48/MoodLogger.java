package RecapAfternoonDay48;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MoodLogger {

    private static String moodFile = "moodLogger.txt";
    private static DateTimeFormatter dateFormat = DateTimeFormatter.ISO_LOCAL_DATE; //ISO_LOCAL_DATE is always year month day format
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean running = true;

        System.out.println("Time to mood your logs.");
        System.out.println("Mood Logger");

        while (running) {
            System.out.println("\nPlease choose an option:");
            System.out.println("[1] Log a new mood");
            System.out.println("[2] View past moods");
            System.out.println("[3] Exit");
            System.out.println("Your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    newMood(scanner);
                    break;
                case "2":
                    viewPastMoods();
                    break;
                case "3":
                    running = false;
                    System.out.println("See you next time c: ");
                    break;
                default:
                    System.out.println("That doesn't work.");
            }
        }

        scanner.close();
    }

    private static void newMood(Scanner scanner) {
        System.out.println("\nHow are you feeling today?");
        String moodInput = scanner.nextLine().trim();

        if (moodInput.isEmpty()) {
            System.out.println("No worries, if you don't have something we can try again another time");
            return;
        }

        LocalDate today = LocalDate.now();
        String entry = today.format(dateFormat) + ": " + moodInput;

        //if i dont append true it would overwrite everything in the file everytime and i'll cry
        try (FileWriter writer = new FileWriter(moodFile, true)) {
            writer.write(entry + "\n");
            System.out.println("Mood logged successfully!");
        } catch (IOException e) {
            System.out.println("Error saving mood: " + e.getMessage());
        }
    }

    private static void viewPastMoods() {
        File file = new File(moodFile);

        if (!file.exists() || file.length() == 0) {
            System.out.println("\nNo moods have been logged yet.");
            return;
        }

        System.out.println("\nYour moods logged so far:");

        try (BufferedReader reader = new BufferedReader(new FileReader(moodFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading moods: " + e.getMessage());
        }
    }
}
