abstract class Item {
    private String name;
    private double price;
    private int quantity;
    //private DiscountType discountType;
    private double discountAmount;

    private boolean taxable;
    private final double taxRate = 7;

    private boolean giftCard = false;

    public Item(String name, double price, int quantity, double discountAmount, boolean taxable, boolean giftCard) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
//        this.discountType = discountType;
        this.discountAmount = discountAmount;
        this.taxable = taxable;
        this.giftCard = giftCard;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

//    public DiscountType getDiscountType() {
//        return discountType;
//    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public boolean isTaxable() {
        return taxable;
    }
    public double getTaxRate() {
        return taxRate;
    }

    public abstract double getDiscountPrice();

    public boolean isGiftCard() {
        return giftCard;
    }

    public double getTotalPrice() {
        double discounted = getDiscountPrice() * quantity;
        double tax;
        if (taxable) {
            tax = (taxRate / 100 ) * price;
        } else {
            tax = 0.0;
        }
        return discounted + tax;
    }
}