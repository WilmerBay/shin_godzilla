package ShoppingCart;

public class DiscountedProduct extends Product {

    private final double discountPercentage;

    public DiscountedProduct(String name, double price, double discountPercentage) {

        super(name, price);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getFinalPrice() {

        return price - (price * discountPercentage / 100);
    }
}
