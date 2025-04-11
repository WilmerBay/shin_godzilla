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

        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        double result = num1 * num2;

        System.out.println("Result: " + result);


    }
}
