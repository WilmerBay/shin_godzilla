package week2;

import java.util.Scanner;

public class temperatureConverter {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String tempPath = tempPath();
        double temp = getTemp();
        System.out.println("Do you want to convert to Kelvin? Y/N");
        String userKelvin = scanner.nextLine().toUpperCase();
        if (userKelvin.equals("Y")) {
            double kelvinConversion = kelvinTime(tempPath, temp);
            System.out.println("Conversion complete Kelvin measures at: " + kelvinConversion);
        }
        double convertedTemp = pathConversion(tempPath, temp);


        System.out.printf("Conversion complete: %.2f", convertedTemp);
        scanner.close(); // i always forget to close scanner, i think it goes here

    }
    static String tempPath() {
        System.out.println("Choose C for celsius or F for fahrenheit");
        String tempPath = scanner.nextLine().toUpperCase();
        return tempPath;
    }


    static double getTemp (){
        System.out.println("What's your temperature?");
        double userTemp = scanner.nextDouble();
        scanner.nextLine();
        return userTemp;
    }
    static double pathConversion(String tempPath, double temp ) {

        double fahrenheit = (temp * 9/5) + 32;
        double celsius = (temp - 32) * 5/9;
        if (tempPath.equals("C")) {
            System.out.println("Converting Celsius to Fahrenheit");
        return fahrenheit;
        } else if (tempPath.equals("F")) {
            System.out.println("Converting Fahrenheit to Celsius");
            return celsius;
        } else {
            System.out.println("We broke it, I blame you");
            return Double.NaN; // i had to look up how to return something without a number
        }
    }
    static double kelvinTime (String tempPath, double temp) {

        double celsiusToKelvin = (temp + 273.15);
        double fahrenheitToKelvin = (temp - 32) * 5/9 + 273.15;
        if (tempPath.equals("C")) {
                System.out.println("Converting Celsius to Kelvin");
                return celsiusToKelvin;
        } else if (tempPath.equals("F")) {
                System.out.println("Converting Fahrenheit to Kelvin");
                return fahrenheitToKelvin;
        } else {
                System.out.println("We broke it, I blame you");
                return Double.NaN;
        }
        }


}
