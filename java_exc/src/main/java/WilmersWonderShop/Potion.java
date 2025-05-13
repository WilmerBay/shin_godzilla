package WilmersWonderShop;

public class Potion extends Item {

        public Potion(String name, double price) {
            super(name, price);
        }

        @Override
        public void use() {
            System.out.println("💫 You drink " + name + ". Time seems to bend around you!");
        }
    }

