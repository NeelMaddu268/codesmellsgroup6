class Item {
    private String name;
    private double price;
    private int quantity;
    private DiscountType discountType;
    private double discountAmount;

    private boolean taxable;
    private final double taxRate = 7;

    private boolean giftCard = false;

    public Item(String name, double price, int quantity, DiscountType discountType, double discountAmount, boolean taxable, boolean giftCard) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discountType = discountType;
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

    public DiscountType getDiscountType() {
        return discountType;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public boolean isTaxable() {
        return taxable;
    }
    public double getTaxRate() {
        return taxRate;
    }

    public double getDiscount() {
        double newPrice = price;
        switch (discountType) {
            case PERCENTAGE:
                newPrice -= discountAmount * newPrice;
                break;
            case AMOUNT:
                newPrice -= discountAmount;
                break;
            default:
                // no discount
                break;
        }
        return newPrice;
    }

    public boolean isGiftCard() {
        return giftCard;
    }
}
