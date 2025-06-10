package Sakila;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ActorDAO dao = new ActorDAO();
        Scanner scanner = new Scanner(System.in);

        // Ask for last name
        System.out.print("Enter actor's last name: ");
        String lastName = scanner.nextLine();
        List<Actor> actors = dao.findByLastName(lastName);

        if (actors.isEmpty()) {
            System.out.println("No actors found with last name: " + lastName);
            return;
        }

        for (Actor a : actors) {
            System.out.println(a);
        }

        // Ask for full name
        System.out.print("\nEnter first name of the actor to see their movies: ");
        String firstName = scanner.nextLine();

        List<String> movies = dao.findMoviesByActor(firstName, lastName);
        for (String title : movies) {
            System.out.println("- " + title);
        }
    }
}
