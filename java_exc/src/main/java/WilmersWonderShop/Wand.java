package WilmersWonderShop;

public class Wand extends Item {
    public Wand(String name, double price) {
        super(name, price);
    }

    @Override
    public void use() {
        System.out.println("✨ Swish! " + name + " sparks with magical fury!");
    }
}
