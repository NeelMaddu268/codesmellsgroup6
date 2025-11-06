public class PercentagedDiscountItem extends Item {
    public PercentagedDiscountItem(String name, double price, int quantity, double discountAmount) {
        super(name, price, quantity, discountAmount);
    }

    @Override
    public double getDiscountPrice() {
        return getPrice() - (getPrice() * getDiscountAmount());
    }
}
