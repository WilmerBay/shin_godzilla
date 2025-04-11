import java.util.Scanner;

public class basic_calculator {
    public static void main(String[] args) {
        Scanner scanboi = new Scanner(System.in);


        System.out.println("Enter a number: ");
        double num1 = scanboi.nextDouble();
        scanboi.nextLine();
        System.out.print("Enter another number: ");
        double num2 = scanboi.nextDouble();
        scanboi.nextLine();



        double result = num1 * num2;

        System.out.println("Result: " + result);


    }
}
