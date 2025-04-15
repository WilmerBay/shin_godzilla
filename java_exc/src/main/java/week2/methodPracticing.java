package week2;

public class methodPracticing {
    public static void main(String[] args) {
        int wilmerLevel = 0;
        int ryanLevel = 100;
        String player = "Wilmer";
        String target = "Ryan";
        String pizza = "freakin 'ZA jabroni";
        String sword = "Sword";
        String shield = "Shield";
        String wizard = "Ryan";
        String spellName = "Fireball";
        int manaCost = 25;
        int rupeeCount = 5;
        String dungeonName = "Dreadnaught";

    printWelcome();
    displayPlayerName(player);
    showLevel(player, wilmerLevel, target, ryanLevel);
    attack(player, target);
    foundItem(player, sword);
    foundItem(player, shield);
    foundItem(player, pizza);
    castSpell(wizard, spellName, manaCost);
    gameOver(player);
    displayInventory(player, rupeeCount);
    enterDungeon(player, dungeonName);
    victoryDance(player);
    }
    public static void printWelcome() {
        System.out.println ("Welcome! ");
    }
    public static void displayPlayerName(String player) {
        System.out.println ("player has joined: " + player);
    }
    public static void showLevel(String player, int wilmerLevel, String target, int ryanLevel) {
        System.out.println (player + " is level: " + wilmerLevel);
        System.out.println (target + " is level: " + ryanLevel);
    }
    public static void attack(String attacker, String target) {
        System.out.println (attacker + " attacks " + target + "!");
        System.out.println("Wilmer dies, what was he thinking...");
    }
    public static void foundItem(String player, String item){
        System.out.println (player + " found a " + item + "!");
    }
    public static void castSpell(String wizard, String spellName, int manaCost) {
        System.out.println(wizard + " casts " + spellName + " costing " + manaCost + " mana");
    }
    public static void gameOver(String player) {
        System.out.println("You are dead " + player + ", game over.");
    }
    public static void displayInventory(String player, int itemCount) {
        System.out.println(player + " has " + itemCount + " rupees ");
    }
    public static void enterDungeon(String player, String dungeonName) {
        System.out.println(player + " has entered the crevices in the " + dungeonName + " good luck down there...");
    }
    public static void victoryDance(String player) {
        System.out.println(player + "'s poppin a THIZZ FACE after his victory. That's fire.  ");
    }




}
