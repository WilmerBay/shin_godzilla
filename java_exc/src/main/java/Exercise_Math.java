public class Exercise_Math {
//it works buddy
    public static void main(String[] args) {
        // Return the max value of numbers
        System.out.println(Math.abs(-25));
        System.out.println(Math.abs(55));
        /* Create an int variable with value -45.
        Print it as a positive number using Math.abs().
         */
        int fortyFive = -45;
        System.out.println(Math.abs(fortyFive));
        /*Create two double variables: 3.5 and 7.8
        Print the biggest one.*/
        double threeFive = 3.5;
        double sevenEight = 7.8;
        System.out.println(Math.max(threeFive, sevenEight));
        /*Create two int variables: 99 and 23
        Print the smallest one.*/
        int ninetyNine = 99;
        int twentyThree = 23;
        System.out.println(Math.min(twentyThree, ninetyNine));
        /* Create a double variable with value 8.9.
                Print the floored value.*/
        double eightNine = 8.9;
        System.out.println("It rounds down to " + Math.floor(eightNine));
        /* Create a double variable with value 5.2.
                Print the ceiled value. */
        double fiveTwo = 5.2;
        System.out.println("Rounding up, it will choose to print the number six -> " + Math.ceil(fiveTwo));
        /* Create a double variable with value 9.6.
                Print the rounded value. */
        double nineSix = 9.6;
        System.out.println("Math.round will round as normal, up or down, in this case 9.6 rounds up to ten  -> " + Math.round(nineSix));
        /* BONUS
        Print the absolute difference between both temperatures.
        Print the highest temperature.
        Print the lowest temperature.
        Round the afternoon temperature.
        Floor the morning temperature.*/
        double morningTemp = -3.7;
        double afternoonTemp = 12.4;
        double absoDiff = (Math.abs (morningTemp - afternoonTemp));
        System.out.println("The absolute difference between -3.7 and 12.4 is " + absoDiff);
        System.out.println("Highest Temp between the two is " + Math.max(morningTemp, afternoonTemp));
        System.out.println("The lowest temperature between the two is " + Math.min(morningTemp, afternoonTemp));
        System.out.println("Afternoon temp rounded is -> " + Math.round(afternoonTemp));
        System.out.println("Morning temp floored is -> " + Math.floor(morningTemp));
        // LEVEL UP //
        double price = 10.876;
        /* Tasks:
        Round price to 2 decimal places.
        Print it like this: */
        double moveDeci = price * 100;
        double roundNew = Math.round(moveDeci);
        double finalNum = roundNew / 100;
        System.out.println(finalNum);
        /* A video is 320 seconds long.
                Calculate:
        How many full minutes is that?
        How many total minutes should you show if you round UP (so the viewer always sees enough time)?
                Example output:
        Real minutes: 5
        Show as: 6 minutes */
        double videoTotal = 320;
        double videoSeconds = videoTotal / 60;
        System.out.println(videoSeconds);
        System.out.println("Rounded up it would be " + Math.ceil(videoSeconds) + " minutes.");
        /*You have a price:
        Stores round down to nearest 0.05.
                Example:
        3.87 → 3.85
        3.83 → 3.80
        Task: Calculate and print the rounded price. */
        double threeEightSeven = 3.87;
        double doubleNum = threeEightSeven * 20;
        double divNum = Math.round(doubleNum);
        double backTo = divNum / 20;
        System.out.println(backTo);

        /*Look at this and predict the output:

        double x = 5.9;
        int y = (int)x + 3;
        System.out.println(y);
        Now try with: */

        // ** 8 **

        /* int z = (int)(x + 3);
        System.out.println(z);
        What's the difference and why? */

        // ** Still 8 **

        /* 5. Max-Min Battle
        You have 3 numbers:

        int a = 17;
        int b = 42;
        int c = 9;
        Task:
        - Print the biggest one without using if or loops.
        - Print the smallest one. */

        int a = 17;
        int b = 42;
        int c = 9;
        System.out.println(Math.max(Math.max(a, b), c));
        System.out.println(Math.min(Math.min(a, b), c));

        int x = 150;
        byte y = (byte)x;
        System.out.println(y);

        double start = -12.8;
        double end = 7.3;
        /*Print absolute distance between start and end.
                Round it UP.
        Cast to int and print like this:
        Absolute distance = 20*/
        double totalAbRyan = Math.abs(start - end);
        double ceilAbRyan = Math.ceil(totalAbRyan);
        System.out.println(totalAbRyan);
        System.out.println(ceilAbRyan);
        System.out.println((int)ceilAbRyan);





















    }

}
