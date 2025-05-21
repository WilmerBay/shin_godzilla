package Streams;

public class Main {

    public static void main(String[] args) {

        NumericOperator addition = (a, b) -> a + b;

        int result = addition.operate(5, 3);
        System.out.println("Addition: " + result);

        NumericOperator maximum = (a, b) -> Math.max(a, b);

        int maxResult = maximum.operate(7, 4);
        System.out.println("Maximum: " + maxResult);
    }

}
