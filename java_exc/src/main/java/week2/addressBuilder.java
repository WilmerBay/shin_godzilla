package week2;

import java.util.Scanner;

public class addressBuilder {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        StringBuilder address = new StringBuilder();

        getInfo(address);

        System.out.println(address.toString());

    }

    static void getInfo(StringBuilder address) {
        System.out.print("Provide your full name: ");
        address.append("Full Name: ");address.append(scanner.nextLine()).append("\n");


        System.out.print("Billing Street: ");
        address.append(scanner.nextLine()).append("\n");

        System.out.print("Billing City: ");
        address.append(scanner.nextLine()).append(", ");

        System.out.print("Billing State: ");
        address.append(scanner.nextLine()).append(" ");

        System.out.print("Billing Zip: ");
        address.append(scanner.nextLine()).append("\n\n");

        System.out.print("Shipping Street: ");
        address.append(scanner.nextLine()).append("\n");

        System.out.print("Shipping City: ");
        address.append(scanner.nextLine()).append(", ");

        System.out.print("Shipping State: ");
        address.append(scanner.nextLine()).append(" ");

        System.out.print("Shipping Zip: ");
        address.append(scanner.nextLine());
    }
}