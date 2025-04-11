package org.example;

import java.sql.SQLOutput;

public class App {

    public static void main(String[] args) {
    String vin = "1g23fds5689gre56w";
    String makeAndModel = "Ford Explorer";
    String color = "Blue";
    boolean towingPackage = true;
    double odometer = 123.12;
    double price = 19.99;
    char letter1 = 'a';
    char letter2 = 'b';
    char letter3 = 'c';
    String phoneNumber = "+1 415-123-4567";
    String socialSecurity = "123-45-6789";
    int zipCode = 94104;

        System.out.println(vin);
        System.out.println(makeAndModel);
        System.out.println(color);
        System.out.println(towingPackage);
        System.out.println(odometer);
        System.out.println(price);
        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);
        System.out.println(phoneNumber);
        System.out.println(socialSecurity);
        System.out.println(zipCode);

        Calculator calculator = new Calculator();
        calculator.print();


    }

static class Calculator{
    int sum1 = 7 + 3;
    int sub = 10 - 4;
    int multi = 2 * 5;
    int div = 20 / 4;
    int mod = 10 % 3;
    public void print() {
        System.out.println(sum1 + " " + sub + " " + multi + " " + div + " " + mod);
    }
}







































}