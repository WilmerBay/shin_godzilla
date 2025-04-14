import java.util.Scanner;

public class payRollCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // their name
        System.out.println("Please enter your full name:");
        String name = scanner.nextLine();
        // their hours worked (a floating point number)
        System.out.println("How many hours have you worked?");
        double hoursWorked = scanner.nextDouble();
        // their pay rate (a floating point number) Calculate their gross pay.
        System.out.println("What is your pay rate?");
        // Display the employee's name and their gross pay.
        double payRate = scanner.nextDouble();
        double grossPay = hoursWorked * payRate;
        System.out.println(name + " Your gross pay is " + grossPay + " you're built different.");

    }
}
