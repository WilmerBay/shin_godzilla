package week2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class tipCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double billAmount = getBillAmount();
        double total = tipPercentageCalc(billAmount);
        System.out.printf("Your total is: %.2f ", total);
        double totalRoundedUp = Math.ceil(total);
        double totalRoundedDown = Math.floor(total);
        System.out.println("Rounded up " + totalRoundedUp);
        System.out.println("Rounded down " + totalRoundedDown);
        int howManyPeople = howManyPeople();
        scanner.nextLine();
        double totalWithPeople = peopleCalc(total, howManyPeople);
        System.out.printf("Pay %.2f", totalWithPeople);
    }
    static double getBillAmount() {
        System.out.println("What is your bill amount? 00.00");
        double billAmount = scanner.nextDouble();
        return billAmount;
    }
    static double tipPercentageCalc(double billAmount) {
        System.out.println("How much would you like to tip? Type in decimal format eg:.25");
        double tipPercent = scanner.nextDouble();
        double total = (tipPercent * billAmount) + billAmount;
        System.out.println("Alright you are tipping " + tipPercent);
        System.out.println("With " + tipPercent);
        return total;
    }
    static int howManyPeople () {
        System.out.println("How many people are you splitting the bill with?");
        return scanner.nextInt();
        }
    static double peopleCalc (double total, int howManyPeople) {
        if (howManyPeople > 1) {
            return total / howManyPeople;
        } else if (howManyPeople == 0) {
            System.out.println("It's just you buddy pay the bill");
        } else {
            System.out.println("what is happening here, im crashing out");
        } return total;
    }

}
