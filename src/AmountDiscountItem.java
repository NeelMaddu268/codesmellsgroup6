public class AmountDiscountItem extends Item {
    public AmountDiscountItem(String name, double price, int quantity, double discountAmount, boolean taxable, boolean giftCard) {
        super(name, price, quantity, discountAmount, taxable, giftCard);
    }

    @Override
    public double getDiscountPrice() {
        return getPrice() - getDiscountAmount();
    }
}