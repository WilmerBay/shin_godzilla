package Sakila;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ActorService service = new ActorService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter actor's last name (or type 'exit' to quit): ");
            String lastName = scanner.nextLine().trim();

            if (lastName.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            List<Actor> actors = service.getActorsByLastName(lastName);

            if (actors.isEmpty()) {
                System.out.println("No actors found with last name: " + lastName);
                continue;
            }

            System.out.println("\nMatching actors:");
            for (Actor a : actors) {
                System.out.println(a);
            }

            System.out.print("\nEnter first name of the actor to see their movies: ");
            String firstName = scanner.nextLine().trim();

            List<String> movies = service.getMoviesByActor(firstName, lastName);

            if (movies.isEmpty()) {
                System.out.println("No movies found for " + firstName + " " + lastName);
            } else {
                System.out.println("\nMovies for " + firstName + " " + lastName + ":");
                for (String title : movies) {
                    System.out.println("- " + title);
                }
            }
        }

        scanner.close();
    }
}
