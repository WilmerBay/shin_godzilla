package WilmersWonderShop;

public class Guitar extends Item {

    public Guitar(String name, double price) {
        super(name, price);
    }

    @Override
    public void use() {
        System.out.println("🎸 " + name + " rings out with a blazing solo!");
    }
}
