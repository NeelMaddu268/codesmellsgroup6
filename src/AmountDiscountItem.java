public class AmountDiscountItem extends Item {
    public AmountDiscountItem(String name, double price, int quantity, double discountAmount) {
        super(name, price, quantity, discountAmount);
    }

    @Override
    public double getDiscountPrice() {
        return getPrice() - getDiscountAmount();
    }
}
