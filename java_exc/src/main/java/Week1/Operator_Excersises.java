package Week1;

public class Operator_Excersises {
    public static void main(String[] args) {
        // 1. Create 3 variables: an int, a double, and a char. Print them.
        int integer = 1;
        double doubleNum = 2.0;
        char character = 'a';
        System.out.println(integer + " " + doubleNum + " " + character);
        // 2. Add two int variables and print the result.
        int integer2 = 3;
        int integer3 = 4;
        int totalSum = (integer2 + integer3);
        System.out.println(totalSum);
        // 3. Divide an int by another int and print the result.
        System.out.println(integer3 / integer2);
        // 4. Divide an int by a double and print the result. What data type is the result?
        System.out.println(integer3 / doubleNum);
        // ** It comes back as a double **

        // 5. Store your age in an int. Calculate and print: "In 10 years I will be: ..."
        int age = 28;
        int decade = 10;
        int myOldAge = (age + decade);
        System.out.println("In 10 years I will be: " + myOldAge);
        // 6. Create a byte with value 100. Add 28 to it and store it in an int. Print it.
        byte bitty = 100;
        int bittiInty = (bitty + 28);
        System.out.println(bittiInty);
        // 7. Create a double with value 5.7. Cast it to int and print both.
        double fiveSeven = 5.7;
        int casted = (int)fiveSeven;
        System.out.println("Double Number " + fiveSeven);
        System.out.println("Casted Number " + casted);
        // 8. Multiply a float and an int. Store the result in a double. Print it.
        float cloud = 8.3F;
        int integer4 = 11;
        double multiTime = (cloud * integer4);
        System.out.println("what " + multiTime);
        // 9. Store a char 'A' in a variable. Add 1 to it and print the result. (What happens?)
        char letterA = 'A';
        int weirdThing = (letterA + 1);
        System.out.println("weird " + weirdThing);


        // 10. Create two variables:
        int a = 9;
        int b = 2;
        double doubleTime = (double)a / b;
        // Calculate and print:
        // a divided by b
        System.out.println(doubleTime);
        // a modulo b
        System.out.println(a % b);
        // 11. Store your weight in a double. Store your height in a double. Calculate and print BMI:
        double weight = 150;
        double height = 64;
        double bmi = weight / (height * height);
        System.out.println(bmi);
        // 12. Calculate the average of 3 double numbers. Print the result.
        double double1 = 1;
        double double2 = 2;
        double double3 = 3;
        double average = (double1 + double2 + double3) / 3;
        System.out.println(average);
        /* 13. BONUS: Explore the compound assignment operator (+=, *=, etc.) to modify a variable step by step.
        Print after each step. */
        int sus = 5;
        sus += 5;
        int sussy = 10;
        sussy -= 4;
        int sussyBaka = 15;
        sussyBaka *= 2;
        System.out.println(sus);
        System.out.println(sussy);
        System.out.println(sussyBaka);
        // 14. Create a short with value 30000. Multiply it by 2. What happens? Fix it using casting.
        short thirtyK = 30000;
        short sumShort = (short)(thirtyK * 2 );
        System.out.println(sumShort);
        /* 15. Create a variable double price = 10.99. Create int quantity = 5.
        Calculate total cost and cast the result to int. Print it.*/
        double price = 10.99;
        int quantity = 5;

        // 16. Create an int with value 130. Cast it to byte. Print it. Explain the weirdness.
        // 17. Create a variable char letter = 'z'. Subtract 2 from it and print the resulting character.
        // 18. Store a long value of 2 billion (2000000000). Add 1 billion to it. Print the result.
        // 19. Calculate the area of a circle:
        // double radius = 4.5;
        // area = PI * radius * radius;
        // Use Math.PI and print the result.

        // 20. Mixing it all:
        // Create variables of type:

        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // Do random operations between them (add, subtract, multiply), use casting when needed and print all the results.

        // Mini Challenge: Time Calculator (Operators & Casting Only)
        // The Story:
        //A bakery is tracking its oven usage time. Every day, the ovens are on for a certain number of minutes. You are asked to convert total oven minutes into:

        // Full hours
        // Remaining minutes
        // The Challenge:
        // Create an int variable with the total number of minutes the ovens were on.
        // Example:
        // int totalMinutes = 350;

        // Calculate:
        // Full hours
        // Remaining minutes
        // Print this exact output:
        // Total minutes: 350
        // That is 5 hour(s) and 50 minute(s).
                // Bonus (still no if, no loops)
        // Add a double variable for electricity cost per hour → e.g., 2.75 euros/hour.
                // Calculate and print the total cost for the full hours only (ignore leftover minutes).
        // Example output:

        // Cost for 5 hour(s) = 13.75 euros

    }
}
