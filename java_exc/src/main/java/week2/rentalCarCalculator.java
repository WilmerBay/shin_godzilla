package week2;

import java.util.Scanner;

public class rentalCarCalculator {
    static Scanner scanner = new Scanner(System.in);
    static final double carRental = 29.99;
    static final double under25Charge = .30;
    static final double gpsCost = 2.95;
    static final double roadsideCost = 3.95;
    static final double tollPrice = 3.95;

    public static void main(String[] args) {

        String pickupDate = getDate();
        int numberOfDays = numberOfDays();
        scanner.nextLine();
        boolean tollTag = tollTag();
        boolean addGPS = addGPS();
        boolean roadside = roadside();
        int age = age();
        scanner.nextLine();
        double totalCost = costCalculator (numberOfDays, tollTag, addGPS, roadside, age);
        System.out.println("your total cost is " + totalCost);
        System.out.println("toll charge: " + tollTag);
        System.out.println("GPS charge: " + addGPS);
        System.out.println("roadside charge: " + roadside);
        System.out.println("Under age 25 fee: " + age);
    }
    //calculate costs
    static double costCalculator (int numberOfDays, boolean tollTag, boolean addGPS, boolean roadside, int age) {
        double basePrice = carRental * numberOfDays;
        double under25Fee = 0;
        double tollCost = 0;
        double gps = 0;
        double roadsideAssist = 0;

        if (age < 25) {
            under25Fee = basePrice * under25Charge;
        }
        if (tollTag) {
            tollCost = tollPrice * numberOfDays;
        }
        if (addGPS) {
            gps = gpsCost * numberOfDays;
        }
        if (roadside) {
            roadsideAssist = roadsideCost * numberOfDays;
        }

        double total = basePrice + under25Fee + tollCost + gps + roadsideAssist;
        return total;
    }

    // - pickup date (store as a string)
    static String getDate() {
        System.out.println("When will you be picking up? Enter mm/dd/yy");
        return scanner.nextLine();
    }
    // - number of days for the rental
    static int numberOfDays() {
        System.out.println("How many days will you be renting the car?");
        int days = scanner.nextInt();
        return days;
    }
    // - whether they want an electronic toll tag at $3.95/day (yes/no)
    static boolean tollTag() {
        System.out.println("Would you like an electronic toll tag at $3.95 per day? Yes or No?");
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("yes");
    }
    // - whether they want a GPS at $2.95/day (yes/no)
    static boolean addGPS() {
        System.out.println("Would you want to add GPS for $2.95 per day? Yes or No?");
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("yes");
    }
    // - whether they want roadside assistance at $3.95/day (yes/no)
    static boolean roadside() {
        System.out.println("Would you want to add roadside for $3.95 per day? Yes or No?");
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("yes");
    }
    // - their current age
    static int age() {
        System.out.println("What's your age?");
        int age = scanner.nextInt();
        return age;
    }
}

