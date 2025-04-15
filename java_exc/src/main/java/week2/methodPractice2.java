package week2;

public class methodPractice2 {

    public static void main(String[] args) {
        String lord = "Wilmer";
        welcomeLord(lord);
        int xp = 50;
        doubleWeekend(xp);
        int myXP = 21;
        int levelCap = 21;
        hasLeveledUp(myXP, levelCap);
        rollDice();
        rollDice();

    }
    public static void welcomeLord (String lord) {
        System.out.println ("Welcome lord " + lord + ", your magnificence.");
    }
    public static int doubleWeekend(int xp){
        int doubleXP = xp * 2;
        System.out.println("Normal XP earned: " + xp + "!");
        System.out.println("Double XP earned! You've earned: " + doubleXP);
        return doubleXP;
    }
    public static boolean hasLeveledUp(int myXP, int levelCap){
        if (myXP > levelCap) {
            System.out.println("You're strong brudder, level up");
            return true;
        } else {
            System.out.println("Keep trying, you still aren't Paulo buddy");
            return false;
        }

    }
    public static int rollDice() {
        int dice = (int)(Math.random() * 6) + 1;
        System.out.println("Rolled for " + dice + "!");
        return dice;
    }


}



