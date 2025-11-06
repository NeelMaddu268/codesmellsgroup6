
public class GiftCardItem extends Item {
    public GiftCardItem(String name, double price, int quantity, double discountAmount){
        super(name, price, quantity, discountAmount);
    }
    @Override
    public double getDiscountPrice() {
        return getPrice() - getDiscountAmount();
    }
}
