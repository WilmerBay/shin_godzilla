package WilmersWonderShop;

import java.util.ArrayList;
import java.util.List;

public class Magician {
    private String name;
    private List<Item> magicItems;

    public Magician(String name) {
        this.name = name;
        this.magicItems = new ArrayList<>();
    }

    public void addItem(Item item) {
        magicItems.add(item);
    }

    public void performShow() {
        System.out.println("🧙 " + name + " begins the magic show!");
        for (Item item : magicItems) {
            item.use();
        }
        System.out.println();
    }
}