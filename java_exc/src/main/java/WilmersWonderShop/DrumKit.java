package WilmersWonderShop;

public class DrumKit extends Item {

    public DrumKit(String name, double price) {
        super(name, price);
    }

    @Override
    public void use() {
        System.out.println("🥁 " + name + " booms with thunderous rhythm!");
    }
}
