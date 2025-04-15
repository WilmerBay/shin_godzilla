package week2;

import java.util.Scanner;

public class sandwhichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double basePrice = sandwhichPrice(scanner);
        int age = userAge(scanner);
        double finalPrice = basePrice - (basePrice * discount(age));
        System.out.println("Your final price is " + finalPrice);


    }
    public static double sandwhichPrice(Scanner scanner){
        System.out.println("You have 2 options sandwhich (1) or sandwhich (2).");

        int sandwhich = scanner.nextInt();

        if (sandwhich == 1){
            System.out.println("Number 1 coming right up, that's $5.45");
            return 5.45;

        } else if (sandwhich == 2) {
            System.out.println("The big one, nice. $8.45 Big G");
            return 8.95;

        } else {
            System.out.println("I hate this guy, just get him the normal one. That's $5.45 smart guy.");
            return 5.45;
        }
    }
    public static int userAge(Scanner scanner){
        System.out.println("How old are you?");
        return scanner.nextInt();
    }
    public static double discount(int age){
        if (age <= 17){
            double discount = 0.10;
            System.out.println("You get a 10% discount");
            return discount;
        } else if (age >= 65) {
            double discount = 0.20;
            System.out.println("Alright boomer, you get a 20% discount");
            return discount;
        } else {
            System.out.println("no discount for you. lol");
            return 0.0;
        }

    }

}