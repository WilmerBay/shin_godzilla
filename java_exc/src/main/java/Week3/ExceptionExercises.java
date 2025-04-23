package Week3;

import java.util.Scanner;

public class ExceptionExercises {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int num1 = num1();
        int num2 = num2();

        try {
            int answer = num1 / num2;
            System.out.println("Answer is: " + answer);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero chief");
        }

    }
    static int num1() {
        System.out.println("Give a number: ");
        return scanner.nextInt();
    }
    static int num2() {
        System.out.println("Give another number: ");
        return scanner.nextInt();
    }


}
