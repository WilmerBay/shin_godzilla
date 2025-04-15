import java.sql.SQLOutput;
import java.util.Scanner;

public class friday_mini_exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome hunter, what is your name?");
        String hunter = scanner.next();

        System.out.println("I see " + hunter + "," + " glorious, you will do.");
        System.out.println("as you know dwarves are 7 times older than humans, lets see how old you are in Dwarven years...");
        System.out.print("enter your age: ");

        int age = scanner.nextInt();
        int dwarfAge = (age * 7);

        System.out.println(age + "?" + " Marvelous, so you are " + dwarfAge + " in Dwarven years!");
        System.out.println("On this journey, you will be using your Chaos Stone™ to roll for you FATE!");

        int chaosStone = (int)Math.floor(Math.random() * 6) + 1;

        System.out.println("Yell hunter! Yell whatever you'd like to decide your fate!");
        String diceRoll = scanner.next();
        System.out.println("MAGNIFICENT HUNTER! YOUR CASTING SPELL TO DECIDE YOUR FATE IS " + diceRoll + "!");
        System.out.println("It has begun, you've rolled " + chaosStone + " your fate has been chosen!");
        //name strength and agility
        System.out.println("Your name?");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("your strength?");

        int strength = scanner.nextInt();
        System.out.println("Finally, your Agility?");
        int agility = scanner.nextInt();
        System.out.println("I see... you are " + name + " with a strength level of " + strength + ", and Agility at " + agility + "!");

        System.out.println("what level are you?");

        int level = scanner.nextInt();
        level += 1;

        try {
            Thread.sleep(1500);
            System.out.println("I don't like that number. I'll add 1 to it.");
            Thread.sleep(2000);
            System.out.println("I've leveled you up, you are now level " + level + " that's a better number no?");
            Thread.sleep(2500);
            System.out.println("Let's check your pouch for currency, how much gold do you have?");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // gold calc
        final int goldWorth = 10;
        final int silverWorth = 1;


        int gold = scanner.nextInt();
        System.out.println("What about silver?");
        int silver = scanner.nextInt();
        scanner.nextLine();
        System.out.println("I see, so you have " + gold + " gold and " + silver + " silver... interesting.");
        int valuePoints = (goldWorth * gold) + (silverWorth * silver);
        System.out.println("Gold is worth 10, Silver is worth 1 so you have " + valuePoints + " total currency.");
        //roll a dice
        int dice = (int)Math.floor(Math.random() * 100) + 1;
        System.out.println("Roll the dice, coward. Press [Enter]");
        scanner.nextLine();

        if (dice % 2 == 0) {
            System.out.println("You rolled " + dice + " that's an even, you survived... for now.");
        }
        else {
            System.out.println("You rolled " + dice + " an...an odd? You're no longer with us friend.");
        }
        //Crit hit chance
        // Ask for player's luck stat (0-100). If luck > 50 → print "Critical Hit!" else "Normal Hit".
        System.out.println();
        System.out.println("what's your luck from 0-100 buddy?");
        int luck = scanner.nextInt();
        while (luck < 0 || luck > 100) {
            System.out.println("You tried, but that's not how this works, I said 0 - 100 buddy");
            luck = scanner.nextInt();
        }
        if (luck >= 50){
            System.out.println("My word you're angry today... CRIT HIT " + luck + "!");
        }else{
            System.out.println("Normal hit " + luck);

        }
        // 9. Character Class Check
        // Ask for a character class (input: "warrior" or "mage"). Print a different starting weapon for each.
        // System.out.println("Choose your class, are you 'warrior' or 'mage'?");
        //10. Magic Number Guess
        //Hardcode a secret number. Ask the player to guess. Tell them if they're correct or not.
        int secretNum = 3;
        System.out.println("Hey gamer, I'm thinking of a umber 1-10 can you guess what it is?");
        int theirGuess = scanner.nextInt();













    }
}
