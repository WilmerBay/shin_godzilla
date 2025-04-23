package Week1;

import java.util.Scanner;

public class basic_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a number: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter another number: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();



        double result = num1 * num2;

        System.out.println("Result: " + result);


    }
}
