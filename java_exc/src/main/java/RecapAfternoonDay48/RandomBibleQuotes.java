package RecapAfternoonDay48;

import java.util.Random;
import java.util.Scanner;

public class RandomBibleQuotes {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        String[] quotes = {
                "The Lord is my strength and my shield. - Psalm 28:7",
                "Be still, and know that I am God. - Psalm 46:10",
                "The Lord is my light and my salvation. - Psalm 27:1",
                "With God all things are possible. - Matthew 19:26",
                "The truth will set you free. - John 8:32",
                "Perfect love casts out fear. - 1 John 4:18",
                "Faith can move mountains. - Matthew 17:20",
                "The Lord is good to all. - Psalm 145:9",
                "Peace I leave with you; my peace I give you. - John 14:27",
                "Those who hope in the Lord will renew their strength. - Isaiah 40:31"
        };
        System.out.println("This is a random Bible verse generator, press the enter/return key to generate. " +
                "When you would like to leave, type exit.");

        while (true) {
            String enter = scanner.nextLine();

            if(enter.equalsIgnoreCase("exit")) {
                System.out.println("Have a nice day");
                break;
            }
            int i = random.nextInt(quotes.length);
            System.out.println(quotes[i]);
        }
    }
}


