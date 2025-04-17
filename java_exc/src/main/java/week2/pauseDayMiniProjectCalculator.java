package week2;

import java.util.Scanner;

public class pauseDayMiniProjectCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double firstNumber = getNum1(scanner);
        double secondNumber = getNum2(scanner);
        double Total = equation(scanner, firstNumber, secondNumber);
        System.out.println("Total: " + Total);

    }
    static double getNum1 (Scanner scanner) {
        System.out.println("Enter your first number: ");
        return Double.parseDouble(scanner.nextLine());
    }
    static double getNum2 (Scanner scanner) {
        System.out.println("Enter your second number: ");
        return Double.parseDouble(scanner.nextLine());
    }
    static double equation (Scanner scanner, double firstNumber, double secondNumber) {
        System.out.println("selected your choice: (+) (-) (*) (/)");
        String equationPath = scanner.nextLine();
        double total = 0;
        if (equationPath.equals("+")) {
            total = firstNumber + secondNumber;
        } else if (equationPath.equals("-")) {
            total = firstNumber - secondNumber;
        } else if (equationPath.equals("*")) {
            total = firstNumber * secondNumber;
        } else if (equationPath.equals("/")) {
            if (secondNumber == 0) {
                System.out.println("Can't do that buddy the world ends if I divide by 0");
            } else {
                total = firstNumber / secondNumber;
            }
        } else {
            System.out.println("we broke it, good luck buddy");
        }return total;
    }

}
